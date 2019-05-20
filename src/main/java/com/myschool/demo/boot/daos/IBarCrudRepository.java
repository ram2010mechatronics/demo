package com.myschool.demo.boot.daos;

import org.springframework.data.repository.CrudRepository;

import com.myschool.demo.boot.domain.Bar;

import java.io.Serializable;

public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
