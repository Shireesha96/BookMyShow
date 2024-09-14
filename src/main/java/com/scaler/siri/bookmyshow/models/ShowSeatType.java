package com.scaler.siri.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private int price;
}


/*
SST : Show => M : 1
1 : 1
M : 1



SST : SeatType => M : 1
1 : 1
M : 1
 */