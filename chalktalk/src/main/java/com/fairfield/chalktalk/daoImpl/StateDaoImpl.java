package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IStateDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.State;

@Repository
public class StateDaoImpl extends AbstractHibernateDao<State> implements IStateDao {

    public StateDaoImpl() {
        super();

        setClazz(State.class);
    }

    // API

}
