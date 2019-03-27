package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMenteeDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Mentee;

@Repository
public class MenteeDaoImpl extends AbstractHibernateDao<Mentee> implements IMenteeDao {

    public MenteeDaoImpl() {
        super();

        setClazz(Mentee.class);
    }

    // API

}
