package com.myschool.demo.boot.daos.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myschool.demo.boot.domain.Possession;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
