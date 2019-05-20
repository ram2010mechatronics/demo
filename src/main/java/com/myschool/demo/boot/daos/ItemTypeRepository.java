package com.myschool.demo.boot.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.myschool.demo.boot.domain.ItemType;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Long>, CustomItemTypeRepository, CustomItemRepository {
}
