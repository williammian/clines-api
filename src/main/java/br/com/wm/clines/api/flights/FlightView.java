package br.com.wm.clines.api.flights;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

import br.com.wm.clines.api.aircraft.AircraftView;

@Getter
@AllArgsConstructor
public class FlightView {
    private Long id;
    private BigDecimal price;
    private WaypointView departure;
    private WaypointView arrival;
    private AircraftView aircraft;
}
