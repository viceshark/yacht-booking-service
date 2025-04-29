package com.github.yacht_booking_service.service.impl;

import com.github.yacht_booking_service.model.Yacht;
import com.github.yacht_booking_service.repository.YachtRepository;
import com.github.yacht_booking_service.service.YachtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YachtServiceImpl implements YachtService {
    private final YachtRepository yachtRepository;

    @Autowired
    public YachtServiceImpl(YachtRepository yachtRepository) {
        this.yachtRepository = yachtRepository;
    }

    public List<Yacht> getAllYachts() {
        return yachtRepository.findAll();
    }

    public Optional<Yacht> getYachtById(Long id) {
        return yachtRepository.findById(id);
    }

    @Override
    public void addYacht() {
        throw new UnsupportedOperationException("Еще не реализовано");
    }

    @Override
    public void deleteYacht() {
        throw new UnsupportedOperationException("Еще не реализовано");
    }
}
