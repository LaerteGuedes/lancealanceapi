package com.rabbit.lancealance.service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public abstract class BaseService<T, K> implements IBaseService<T, K> {

    @Override
    public List<T> all() {
        return getRepository().findAll();
    }

    @Override
    public T search(K id) {
        return getRepository().getOne(id);
    }

    @Override
    @Transactional
    public void save(T t) {
        getRepository().save(t);
    }

    @Override
    @Transactional
    public void delete(K id) {
        getRepository().deleteById(id);
    }

}
