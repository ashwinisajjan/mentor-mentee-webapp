package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IRequestinsToAdmin;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.RequestsToAdmin;

@Repository
public class RequestsToAdminDaoImpl extends AbstractHibernateDao<RequestsToAdmin> implements IRequestinsToAdmin {

    public RequestsToAdminDaoImpl() {
        super();

        setClazz(RequestsToAdmin.class);
    }

    // API

}
