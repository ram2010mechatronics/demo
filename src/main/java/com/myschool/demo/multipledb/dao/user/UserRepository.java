package com.myschool.demo.multipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.demo.multipledb.model.user.UserMultipleDB;

public interface UserRepository extends JpaRepository<UserMultipleDB, Integer> {
}