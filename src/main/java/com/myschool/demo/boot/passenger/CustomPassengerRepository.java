package com.myschool.demo.boot.passenger;

import java.util.List;

interface CustomPassengerRepository {

    List<Passenger> findOrderedBySeatNumberLimitedTo(int limit);
}
