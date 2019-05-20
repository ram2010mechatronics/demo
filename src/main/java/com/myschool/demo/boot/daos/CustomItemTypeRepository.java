package com.myschool.demo.boot.daos;

import org.springframework.stereotype.Repository;

import com.myschool.demo.boot.domain.ItemType;

@Repository
public interface CustomItemTypeRepository {

    void deleteCustom(ItemType entity);

    void findThenDelete(Long id);
}
