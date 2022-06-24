package br.com.wm.clines.api.locations;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Country;
import br.com.wm.clines.shared.domain.Location;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class LocationFormMapper implements Mapper<LocationForm, Location> {

    @Override
    public Location map(LocationForm source) {
        var country = Country.findByDescription(source.getCountry());
        var state = source.getState();
        var city = source.getCity();

        return new Location(country, state, city);
    }
}
