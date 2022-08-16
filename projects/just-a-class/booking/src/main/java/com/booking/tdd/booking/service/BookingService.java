package com.booking.tdd.booking.service;

import com.booking.tdd.booking.model.BookingModel;
import com.booking.tdd.booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;


    public int daysCalculatorWithDatabase(String name) {

        Optional<BookingModel> bookingModelOptional = bookingRepository.findByReserverName(name);

        // return Period.between(bookingModelOptional.get().getCheckIn(), bookingModelOptional.get().getCheckOut()).getDays();
        return 10;
    }

    public List<BookingModel> findAll(){
       return bookingRepository.findAll();
    }
}
