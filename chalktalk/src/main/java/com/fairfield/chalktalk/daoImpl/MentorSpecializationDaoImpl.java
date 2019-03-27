package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMentorSpecializationDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.MentorSpecialization;

@Repository
public class MentorSpecializationDaoImpl extends AbstractHibernateDao<MentorSpecialization> implements IMentorSpecializationDao {

    public MentorSpecializationDaoImpl() {
        super();

        setClazz(MentorSpecialization.class);
    }

    // API

}
