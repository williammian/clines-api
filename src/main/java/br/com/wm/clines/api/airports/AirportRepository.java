package br.com.wm.clines.api.airports;

import org.springframework.data.repository.Repository;

import br.com.wm.clines.api.flights.ExistingAirportService;
import br.com.wm.clines.shared.domain.Airport;

import java.util.List;
import java.util.Optional;

public interface AirportRepository extends Repository<Airport, String>, ExistingAirportService {
    List<Airport> findAll();

    Optional<Airport> findByCode(String code);

    void save(Airport airport);
}
