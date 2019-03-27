package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.ICountyDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.County;

@Repository
public class CountyDaoImpl extends AbstractHibernateDao<County> implements ICountyDao {

    public CountyDaoImpl() {
        super();

        setClazz(County.class);
    }

    // API

}
