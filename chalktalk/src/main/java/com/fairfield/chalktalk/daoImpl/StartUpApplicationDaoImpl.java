package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IStartUpApplicationDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.StartUpApplication;

@Repository
public class StartUpApplicationDaoImpl extends AbstractHibernateDao<StartUpApplication> implements IStartUpApplicationDao {

    public StartUpApplicationDaoImpl() {
        super();

        setClazz(StartUpApplication.class);
    }

    // API

}
