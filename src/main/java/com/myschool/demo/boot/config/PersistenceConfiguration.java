package com.myschool.demo.boot.config;


import com.myschool.demo.boot.services.IBarService;
import com.myschool.demo.boot.services.impl.BarSpringDataJpaService;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Profile("!tc")
@EnableTransactionManagement
@EnableJpaAuditing
public class PersistenceConfiguration {

    @Bean
    public IBarService barSpringDataJpaService() {
        return new BarSpringDataJpaService();
    }

}