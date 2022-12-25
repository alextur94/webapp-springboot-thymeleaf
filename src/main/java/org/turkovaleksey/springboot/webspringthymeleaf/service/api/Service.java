package org.turkovaleksey.springboot.webspringthymeleaf.service.api;

import java.util.List;

public interface Service<T, K> {
    List<T> getAll();

    void saveOrUpdate(T entity);

    T getByID(K id);

    void deleteById(K id);
}
