package com.fairfield.chalktalk.daoImpl;

import org.springframework.stereotype.Repository;

import com.fairfield.chalktalk.dao.IAddressDao;
import com.fairfield.chalktalk.dao.common.AbstractHibernateDao;
import com.fairfield.chalktalk.entities.Address;

@Repository
public class AddressDaoImpl extends AbstractHibernateDao<Address> implements IAddressDao {

    public AddressDaoImpl() {
        super();

        setClazz(Address.class);
    }

    // API

}
