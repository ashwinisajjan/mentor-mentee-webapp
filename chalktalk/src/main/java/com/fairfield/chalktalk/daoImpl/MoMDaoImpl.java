package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IMoMDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.MoM;

@Repository
public class MoMDaoImpl extends AbstractHibernateDao<MoM> implements IMoMDao {

    public MoMDaoImpl() {
        super();

        setClazz(MoM.class);
    }

    // API

}
