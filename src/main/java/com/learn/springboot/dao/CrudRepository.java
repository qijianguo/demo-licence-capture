package com.learn.springboot.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-29
 * Time: 16:54
 */
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID>{

    /**
     * Saves the given entity.
     *
     * @param entity
     * @param <S>
     * @return
     */
    <S extends T>S save(S entity);

    /**
     * Deletes the given entity.
     *
     * @param entity
     */
    void delete(T entity);

    /**
     * update the given entity.
     *
     * @param entity
     */
    void update(T entity);

    /**
     * Returns the entity identified by the given id.
     *
     * @param primaryKey
     * @return
     */
    T findOne(ID primaryKey);

    /**
     * Returns all entities.
     *
     * @return
     */
    Iterator<T> findAll();

    /**
     * Returns the number of entities.
     *
     * @return
     */
    Long getCount();



}
