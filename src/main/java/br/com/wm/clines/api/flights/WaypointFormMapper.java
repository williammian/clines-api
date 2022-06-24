package br.com.wm.clines.api.flights;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Waypoint;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class WaypointFormMapper implements Mapper<WaypointForm, Waypoint> {
    @Override
    public Waypoint map(WaypointForm source) {
        return new Waypoint(source.getAirport(), source.getTime(), source.getGate());
    }
}
