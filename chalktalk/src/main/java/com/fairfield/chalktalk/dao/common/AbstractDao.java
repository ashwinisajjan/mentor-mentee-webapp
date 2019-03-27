package com.fairfield.chalktalk.dao.common;

import java.io.Serializable;

import com.fairfield.chalktalk.utility.ChacktalkUtil;

public abstract class AbstractDao<T extends Serializable> implements IOperations<T> {

    protected Class<T> clazz;

    protected final void setClazz(final Class<T> clazzToSet) {
        clazz = ChacktalkUtil.checkNotNull(clazzToSet);
    }
}
