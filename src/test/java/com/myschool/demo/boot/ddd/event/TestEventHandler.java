/**
 *
 */
package com.myschool.demo.boot.ddd.event;

import org.springframework.transaction.event.TransactionalEventListener;

import com.myschool.demo.boot.ddd.event.DomainEvent;

interface TestEventHandler {
    @TransactionalEventListener
    void handleEvent(DomainEvent event);

}
