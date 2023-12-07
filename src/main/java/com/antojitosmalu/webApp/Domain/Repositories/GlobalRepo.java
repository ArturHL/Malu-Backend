package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;

public interface GlobalRepo<T> {
  List<T> getAll();
  T getById(Integer id);
  T save(T entity);
  T update(T entity);
  void delete(Integer id);
}
