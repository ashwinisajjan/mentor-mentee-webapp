package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IFeedbackDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Feedback;

@Repository
public class FeedbackDaoImpl extends AbstractHibernateDao<Feedback> implements IFeedbackDao {

    public FeedbackDaoImpl() {
        super();

        setClazz(Feedback.class);
    }

    // API

}
