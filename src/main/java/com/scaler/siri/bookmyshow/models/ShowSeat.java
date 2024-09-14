package com.scaler.siri.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

/*
SS : Show => M : 1
1  : 1
M : 1

S1A1
S1A2
S1A3
S2A1
S2A2


SS : Seat => M : 1
1 : 1
M : 1

-------------------
class X{
}

class Y{
}

class XY{
}

XY : X => M: 1
XY : Y => M : 1
 */