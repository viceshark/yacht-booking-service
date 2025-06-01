package com.github.yacht_booking_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "yacht")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Yacht {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "available", nullable = false)
    private boolean available;

    @Column(name = "image")
    private String image;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "year_built")
    private Integer yearBuilt;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "rating")
    private Integer rating;
}
