package com.github.yacht_booking_service.repository;

import com.github.yacht_booking_service.model.Yacht;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YachtRepository extends JpaRepository<Yacht, Long> {}
