package ru.lomov.dao;

import ru.lomov.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();
    public String findTitleById(Long id);
    Product findById(Long id);
    void insert(Product product);
    void update(Product product);
    void deleteById(Long id);
}
