package com.scaler.siri.bookmyshow.dtos;

import com.scaler.siri.bookmyshow.models.Booking;
import com.scaler.siri.bookmyshow.models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDTO {
    private Booking booking;
    private BookingStatus bookingStatus;
}
