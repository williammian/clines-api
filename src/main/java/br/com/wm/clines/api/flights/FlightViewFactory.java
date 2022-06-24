package br.com.wm.clines.api.flights;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import br.com.wm.clines.api.aircraft.AircraftViewMapper;
import br.com.wm.clines.shared.domain.Flight;

@Component
@AllArgsConstructor
public class FlightViewFactory {

    private final WaypointViewMapper waypointViewMapper;
    private final AircraftViewMapper aircraftViewMapper;

    FlightView factory(Flight flight) {
        var departure = flight.getDeparture();
        var arrival = flight.getArrival();
        var aircraft = flight.getAircraft();

        var departureView = waypointViewMapper.map(departure);
        var arrivalView = waypointViewMapper.map(arrival);
        var aircraftView = aircraftViewMapper.map(aircraft);

        return new FlightView(flight.getId(), flight.getPrice(), departureView, arrivalView, aircraftView);
    }
}
