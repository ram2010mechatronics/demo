package com.myschool.demo.boot.daos.impl;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myschool.demo.boot.daos.CustomItemTypeRepository;
import com.myschool.demo.boot.domain.ItemType;

@Repository
public class CustomItemTypeRepositoryImpl implements CustomItemTypeRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomItemTypeRepositoryImpl.class);

    @Autowired
    private EntityManager entityManager;

    @Override
    public void deleteCustom(ItemType itemType) {
        entityManager.remove(itemType);
    }

    @Override
    public void findThenDelete(Long id) {
        ItemType itemTypeToDelete = entityManager.find(ItemType.class, id);
        entityManager.remove(itemTypeToDelete);
    }
}
