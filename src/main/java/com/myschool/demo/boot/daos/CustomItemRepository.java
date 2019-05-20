package com.myschool.demo.boot.daos;

import org.springframework.stereotype.Repository;

import com.myschool.demo.boot.domain.Item;

@Repository
public interface CustomItemRepository {

    void deleteCustom(Item entity);

    Item findItemById(Long id);

    void findThenDelete(Long id);

}
