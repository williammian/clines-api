package br.com.wm.clines.api.flights;


import java.util.Optional;

import br.com.wm.clines.shared.domain.Airport;

public interface ExistingAirportService {
    Optional<Airport> findByCode(String code);

    Optional<Airport> findById(Long id);
}
