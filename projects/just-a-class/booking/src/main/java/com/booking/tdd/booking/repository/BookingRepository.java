package com.booking.tdd.booking.repository;

import com.booking.tdd.booking.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookingModel, String> {

    Optional<BookingModel> findByReserverName(String name);
}
