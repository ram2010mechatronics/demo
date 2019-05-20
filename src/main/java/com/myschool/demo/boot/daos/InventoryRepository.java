package com.myschool.demo.boot.daos;

import org.springframework.data.repository.CrudRepository;

import com.myschool.demo.boot.domain.MerchandiseEntity;

public interface InventoryRepository extends CrudRepository<MerchandiseEntity, Long> {
}
