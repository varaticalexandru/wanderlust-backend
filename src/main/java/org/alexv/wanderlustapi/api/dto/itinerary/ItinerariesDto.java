package org.alexv.wanderlustapi.api.dto.itinerary;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ItinerariesDto {
    List<ItineraryDto> itineraries;
}
