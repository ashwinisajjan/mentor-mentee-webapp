package com.fairfield.chalktalk.daoImpl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMentorDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Mentor;

@Repository
public class MentorDaoImpl extends AbstractHibernateDao<Mentor> implements IMentorDao {

    public MentorDaoImpl() {
        super();

        setClazz(Mentor.class);
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public List<Mentor> searchByMentorName(String name) {
    	Session session = null;
    	List<Mentor> result = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		StringBuilder sql = new StringBuilder();
    		  sql.append("from Mentor m where m.mentorName like :searchKey");
    		  Query query = session.createQuery(sql.toString())
    		  .setParameter("searchKey", "%" + name + "%");
    		
    		result = (List<Mentor>) query.getResultList();
    		
    		session.getTransaction().commit();
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
    	return result;
    }
    
    @Override
    public List<Mentor> searchBySkills(String skill) {
    	Session session = null;
    	List result = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		StringBuilder sql = new StringBuilder();
  		   sql.append("from Mentor m where m.mentorName like :searchKey");
  		   Query query = session.createQuery(sql.toString())
  		  .setParameter("searchKey", "%" + skill + "%");
  		  	result = (List<Mentor>) query.getResultList();
  		  session.getTransaction().commit();
  		  List<Mentor> mentors = findAll();
  		  for(Mentor mentor: mentors) {
  			  for(String expertise: mentor.getAreaOfExpertise()) {
  				  if(expertise.toLowerCase().contains(skill.toLowerCase())) {
  					 if(! result.contains(mentor)) {
  						result.add(mentor);
  					 }
  				  }
  			  }
  		  }
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
    	return result;
    }

}
