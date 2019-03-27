package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMeetUpLocationDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.MeetUpLocation;

@Repository
public class MeetUpLocationDaoImpl extends AbstractHibernateDao<MeetUpLocation> implements IMeetUpLocationDao {

    public MeetUpLocationDaoImpl() {
        super();

        setClazz(MeetUpLocation.class);
    }

    // API

}
