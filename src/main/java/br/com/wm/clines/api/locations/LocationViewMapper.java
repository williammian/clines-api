package br.com.wm.clines.api.locations;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Location;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class LocationViewMapper implements Mapper<Location, LocationView> {
    @Override
    public LocationView map(Location source) {
        var country = source.getCountry();
        return new LocationView(source.getId(), country.getDescription(), source.getState(), source.getCity());
    }
}
