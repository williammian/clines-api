package br.com.wm.clines.api.airports;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Location;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class AircraftLocationViewMapper implements Mapper<Location, AircraftLocationView> {
    @Override
    public AircraftLocationView map(Location source) {
        var country = source.getCountry();
        return new AircraftLocationView(country.getDescription(), source.getState(), source.getCity());
    }
}
