package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMeetingsDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Meetings;

@Repository
public class MeetingsDaoImpl extends AbstractHibernateDao<Meetings> implements IMeetingsDao {

    public MeetingsDaoImpl() {
        super();

        setClazz(Meetings.class);
    }

    // API

}
