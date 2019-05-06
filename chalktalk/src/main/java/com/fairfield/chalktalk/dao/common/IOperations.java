package com.fairfield.chalktalk.dao.common;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable> {

    T findOne(final long id);

    List<T> findAll();

    void create(final T entity) throws Exception;

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);

}
