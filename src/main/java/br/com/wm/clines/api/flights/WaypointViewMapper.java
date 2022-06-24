package br.com.wm.clines.api.flights;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Waypoint;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class WaypointViewMapper implements Mapper<Waypoint, WaypointView> {
    @Override
    public WaypointView map(Waypoint source) {
        return new WaypointView(source.getTime(), source.getAirport().getCode(), source.getGate());
    }
}
