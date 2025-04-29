package com.github.yacht_booking_service.service;

import com.github.yacht_booking_service.model.Booking;
import com.github.yacht_booking_service.model.BookingStatus;

import java.util.List;

public interface BookingService {

    Booking createBooking(Long customerId, Long yachtId, String fromDate, String toDate);

    void cancelBooking(Long bookingId);

    List<Booking> getBookingsByCustomer(Long customerId);

    Booking updateBookingStatus(Long bookingId, BookingStatus status);

    List<Booking> getAllBookings();

}
