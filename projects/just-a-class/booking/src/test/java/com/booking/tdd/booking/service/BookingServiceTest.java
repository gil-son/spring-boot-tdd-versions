package com.booking.tdd.booking.service;

import com.booking.tdd.booking.model.BookingModel;
import com.booking.tdd.booking.repository.BookingRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

// Spring + JUnit
@RunWith(SpringRunner.class)
public class BookingServiceTest {

    // Instance
    @TestConfiguration // The Bean is only create in this class
    static class BookingServiceTestConfiguration{

        @Bean
        public BookingService bookingService(){
            return new BookingService();
        }

    }

    @Autowired
    BookingService bookingService;

    @MockBean
    BookingRepository bookingRepository;


    @Test
    public void bookingServiceDaysCalculator(){
        String name = "Gil";
        int days = bookingService.daysCalculatorWithDatabase(name);

        Assertions.assertEquals(days, 10);

    }

    @Test
    public void findAllBookings(){

        ArrayList<BookingModel> bookingModels = new ArrayList<>();

        Mockito.when(bookingRepository.findAll())
                .thenReturn(bookingModels);
    }


    @BeforeEach
    void setUp() throws Exception{
        LocalDate checkIn = LocalDate.parse("2020-11-10");
        LocalDate checkOut = LocalDate.parse("2020-11-20");
        BookingModel bookingModel = new BookingModel("1", "Gil", checkIn,checkOut, 2);

        Mockito.when(bookingRepository.findByReserverName(bookingModel.getReserName()))
                .thenReturn(Optional.of(bookingModel));

    }

}
