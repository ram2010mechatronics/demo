package com.myschool.demo.multipledb.dao.product;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.myschool.demo.multipledb.model.product.ProductMultipleDB;

public interface ProductRepository extends PagingAndSortingRepository<ProductMultipleDB, Integer> {

    List<ProductMultipleDB> findAllByPrice(double price, Pageable pageable);
}
