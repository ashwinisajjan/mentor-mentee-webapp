package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IIndustryCategoryDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.IndustryCategory;

@Repository
public class IndustryCategoryDaoImpl extends AbstractHibernateDao<IndustryCategory> implements IIndustryCategoryDao {

    public IndustryCategoryDaoImpl() {
        super();

        setClazz(IndustryCategory.class);
    }

    // API

}
