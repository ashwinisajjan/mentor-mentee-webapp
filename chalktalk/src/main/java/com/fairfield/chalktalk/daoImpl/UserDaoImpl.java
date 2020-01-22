package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IUserDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.User;

@Repository
public class UserDaoImpl extends AbstractHibernateDao<User> implements IUserDao {

    public UserDaoImpl() {
        super();

        setClazz(User.class);
    }

    // API

}
