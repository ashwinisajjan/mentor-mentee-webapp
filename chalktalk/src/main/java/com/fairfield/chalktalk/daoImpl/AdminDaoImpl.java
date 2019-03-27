package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IAdminDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Admin;

@Repository
public class AdminDaoImpl extends AbstractHibernateDao<Admin> implements IAdminDao {

    public AdminDaoImpl() {
        super();

        setClazz(Admin.class);
    }

    // API

}
