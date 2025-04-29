package com.github.yacht_booking_service.repository;

import com.github.yacht_booking_service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
