package com.github.yacht_booking_service.controller;


import com.github.yacht_booking_service.service.YachtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class YachtController {

    private final YachtService yachtService;

    @Autowired
    public YachtController(YachtService yachtService) {
        this.yachtService = yachtService;
    }

    @GetMapping("/yachts")
    public String listYachts(Model model) {
        model.addAttribute("yachts", yachtService.getAllYachts());
        return "yacht-list";
    }

    @GetMapping("/yacht/{id}")
    public String getYachtDetails(@PathVariable("id") Long yachtId, Model model) {
        model.addAttribute("yacht", yachtService.getYachtById(yachtId));
        return "yacht-details";
    }
}
