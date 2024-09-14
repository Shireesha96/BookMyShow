package com.scaler.siri.bookmyshow.dtos;

import com.scaler.siri.bookmyshow.models.Show;
import com.scaler.siri.bookmyshow.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookMovieRequestDTO {
    private Long showId;
    private Long userId;
    private List<Long> showSeats;
}
