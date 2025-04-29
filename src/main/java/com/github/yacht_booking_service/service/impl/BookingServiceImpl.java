package com.github.yacht_booking_service.service.impl;

import com.github.yacht_booking_service.model.Booking;
import com.github.yacht_booking_service.model.BookingStatus;
import com.github.yacht_booking_service.repository.BookingRepository;
import com.github.yacht_booking_service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking createBooking(Long customerId, Long yachtId, String fromDate, String toDate) {
        return null;
    }

    @Override
    public void cancelBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow(() ->
                new RuntimeException(String.format("Не найдено бронирование с id = %s", bookingId))
        );
        booking.setStatus(BookingStatus.CANCELLED);
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getBookingsByCustomer(Long customerId) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    @Override
    public Booking updateBookingStatus(Long bookingId, BookingStatus status) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

