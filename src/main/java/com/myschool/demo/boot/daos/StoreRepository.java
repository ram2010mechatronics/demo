package com.myschool.demo.boot.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myschool.demo.boot.domain.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findStoreByLocationId(Long locationId);
}
