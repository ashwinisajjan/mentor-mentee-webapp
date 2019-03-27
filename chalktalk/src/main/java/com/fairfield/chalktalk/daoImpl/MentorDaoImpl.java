package com.fairfield.chalktalk.daoImpl;

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

    // API

}
