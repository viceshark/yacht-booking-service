package com.github.yacht_booking_service.repository;

import com.github.yacht_booking_service.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
