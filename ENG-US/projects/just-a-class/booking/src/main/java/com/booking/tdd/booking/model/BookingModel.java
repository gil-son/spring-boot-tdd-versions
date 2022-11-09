package com.booking.tdd.booking.model;

import java.time.LocalDate;

public class BookingModel {

    private String id;
    private String reserName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuest;

    public BookingModel(){

    }

    public BookingModel(String id, String reserName, LocalDate checkIn, LocalDate checkOut, int numberGuest) {
        this.id = id;
        this.reserName = reserName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberGuest = numberGuest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserName() {
        return reserName;
    }

    public void setReserName(String reserName) {
        this.reserName = reserName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }
}
