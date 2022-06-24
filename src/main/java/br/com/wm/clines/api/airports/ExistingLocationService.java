package br.com.wm.clines.api.airports;


import java.util.Optional;

import br.com.wm.clines.shared.domain.Country;
import br.com.wm.clines.shared.domain.Location;

public interface ExistingLocationService {
    Optional<Location> findById(Long locationId);
    Optional<Location> findByCountryAndStateAndCity(Country country, String state, String city);
}
