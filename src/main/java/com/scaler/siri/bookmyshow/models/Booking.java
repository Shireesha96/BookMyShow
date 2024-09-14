package com.scaler.siri.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User bookedBy;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @ManyToMany
    private List<ShowSeat> showSeatList;
    private Date bookedAt;
    private int amount;
    @OneToMany
    private List<Payment> paymentList;
}


/*
Booking : User => M:1
1 : 1
M : 1

M : 1
add User in booking class ( 1 in M class)

ShowSeat : Booking => M:M
1   :    M // once might cancel and other will book // if don't want to store previous bookings 1: 1
M : 1

M : M
new mapping class


Booking: Payment => 1: M
1 : M
 1  : 1
 */