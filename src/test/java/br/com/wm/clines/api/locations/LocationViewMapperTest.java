package br.com.wm.clines.api.locations;

import org.junit.jupiter.api.Test;

import br.com.wm.clines.api.locations.LocationView;
import br.com.wm.clines.api.locations.LocationViewMapper;
import br.com.wm.clines.shared.domain.Country;
import br.com.wm.clines.shared.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationViewMapperTest {
    private final Country DEFAULT_COUNTRY = Country.BR;
    private final String DEFAULT_STATE = "SAO PAULO";
    private final String DEFAULT_CITY = "SAO PAULO";
    private final Location DEFAULT_LOCATION = new Location(DEFAULT_COUNTRY, DEFAULT_STATE, DEFAULT_CITY);

    private LocationViewMapper mapper = new LocationViewMapper();
    @Test
    void shouldConvertLocationToLocationView() {
        LocationView locationView = mapper.map(DEFAULT_LOCATION);

        assertEquals(DEFAULT_LOCATION.getId(), locationView.getId());
        assertEquals(DEFAULT_COUNTRY.getDescription(), locationView.getCountry());
        assertEquals(DEFAULT_STATE, locationView.getState());
        assertEquals(DEFAULT_CITY, locationView.getCity());
    }
}