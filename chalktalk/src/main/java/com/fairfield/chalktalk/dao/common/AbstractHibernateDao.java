package com.fairfield.chalktalk.dao.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fairfield.chalktalk.utility.ChacktalkUtil;

@SuppressWarnings("unchecked")
public class AbstractHibernateDao<T extends Serializable> extends AbstractDao<T> implements IOperations<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    // API

    @Override
    public T findOne(final long id) {
    	Session session = null;
    	T t = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		t = (T) session.get(clazz, id);
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
      return t;	
    }
 

	@Override
    public List<T> findAll() {
		Session session = null;
		List<T> entitiesList = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		entitiesList = session.createQuery("from " + clazz.getName()).list();
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
      return entitiesList;	
    }

    @Override
    public void create(final T entity) {
    	Session session = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
			ChacktalkUtil.checkNotNull(entity);
			session.saveOrUpdate(entity);
			session.getTransaction().commit();
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		try {
    			e.printStackTrace();
				throw new Exception();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally {
			session.close();
		}
    }

    @Override
    public T update(final T entity) {
    	Session session = null;
    	T updatedEntity = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		ChacktalkUtil.checkNotNull(entity);
    		updatedEntity = (T) session.merge(entity);
    		session.getTransaction().commit();
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
      return updatedEntity;	
    }

    @Override
    public void delete(final T entity) {

    	Session session = null;
    	try {
    		session=sessionFactory.openSession();
    		session.beginTransaction();
    		ChacktalkUtil.checkNotNull(entity);
    		session.delete(entity);
    		session.getTransaction().commit();
    	} catch(Exception e) {
    		session.getTransaction().rollback();
    		e.printStackTrace();
		} finally {
			session.close();
		}
    }

    @Override
	public void deleteById(final long entityId) {
		try {
			final T entity = findOne(entityId);
			ChacktalkUtil.checkState(entity != null);
			delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}