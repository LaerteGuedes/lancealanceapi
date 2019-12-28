package com.rabbit.lancealance.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBaseService<T, K> {

    JpaRepository<T, K> getRepository();

    List<T> all();
    T search(K id);
    void save(T t);
    void delete(K id);

}
