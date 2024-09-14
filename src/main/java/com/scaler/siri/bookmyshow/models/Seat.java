package com.scaler.siri.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    private int rowVal;
    private int columnVal;
    @ManyToOne
    private SeatType seatType;
}


/*
Seat : SeatType => M:1
1  :  1
M : 1

 */