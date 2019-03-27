package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.ICompanyStageDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.CompanyStage;

@Repository
public class CompanyStageDaoImpl extends AbstractHibernateDao<CompanyStage> implements ICompanyStageDao {

    public CompanyStageDaoImpl() {
        super();

        setClazz(CompanyStage.class);
    }

    // API

}
