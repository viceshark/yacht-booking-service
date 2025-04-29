package com.github.yacht_booking_service.service;

import com.github.yacht_booking_service.model.Yacht;

import java.util.List;
import java.util.Optional;

public interface YachtService {

    void addYacht();

    void deleteYacht();
    List<Yacht> getAllYachts();

    Optional<Yacht> getYachtById(Long id);
}
