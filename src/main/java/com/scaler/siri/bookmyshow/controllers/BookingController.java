package com.scaler.siri.bookmyshow.controllers;

import com.scaler.siri.bookmyshow.dtos.BookMovieRequestDTO;
import com.scaler.siri.bookmyshow.dtos.BookMovieResponseDTO;
import com.scaler.siri.bookmyshow.models.Booking;
import com.scaler.siri.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService _bookingService;

    public BookingController(BookingService bookingService) {
        _bookingService = bookingService;
    }

    public BookMovieResponseDTO BookMovie(BookMovieRequestDTO requestDTO){
        return null;
    }
}
