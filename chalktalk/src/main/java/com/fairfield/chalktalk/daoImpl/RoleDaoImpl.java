package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IRoleDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Role;

@Repository
public class RoleDaoImpl extends AbstractHibernateDao<Role> implements IRoleDao {

    public RoleDaoImpl() {
        super();

        setClazz(Role.class);
    }

    // API

}
