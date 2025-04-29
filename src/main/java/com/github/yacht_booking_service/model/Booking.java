package com.github.yacht_booking_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    //добавляем билдер руками т.к. у меня не заводится через аннотацию lombok
    private Booking(Builder builder) {
        this.customer = builder.customer;
        this.yacht = builder.yacht;
        this.fromDate = builder.fromDate;
        this.toDate = builder.toDate;
        this.status = builder.status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "yacht_id")
    private Yacht yacht;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookingStatus status;


//Добавляем сеттер руками т.к. lombok не хочет работать с ENUM полем

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Customer customer;
        private Yacht yacht;
        private LocalDate fromDate;
        private LocalDate toDate;
        private BookingStatus status;

        // Методы для установки значений (возвращают this для цепочки вызовов)
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder yacht(Yacht yacht) {
            this.yacht = yacht;
            return this;
        }

        public Builder fromDate(LocalDate fromDate) {
            this.fromDate = fromDate;
            return this;
        }

        public Builder toDate(LocalDate toDate) {
            this.toDate = toDate;
            return this;
        }

        public Builder status(BookingStatus status) {
            this.status = status;
            return this;
        }

        // Метод build() создает объект Booking
        public Booking build() {
            return new Booking(this);
        }
    }

}
