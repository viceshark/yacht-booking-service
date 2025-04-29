package com.github.yacht_booking_service.controller;

import com.github.yacht_booking_service.model.Booking;
import com.github.yacht_booking_service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/booking")
    public String listYachts(Model model) {
        model.addAttribute("bookings", bookingService.getAllBookings());
        return "booking-list";
    }

    @PostMapping("/booking")
    public String createBooking(@ModelAttribute Booking booking, Model model) {
        // Логика для создания нового бронирования
        // Переход на страницу с подтверждением или список бронирований
        return "redirect:/bookings";  // или возвращаем имя страницы
    }
}
