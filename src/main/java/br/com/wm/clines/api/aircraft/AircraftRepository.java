package br.com.wm.clines.api.aircraft;

import org.springframework.data.repository.Repository;

import br.com.wm.clines.api.flights.ExistingAircraftService;
import br.com.wm.clines.shared.domain.Aircraft;

import java.util.List;
import java.util.Optional;

public interface AircraftRepository extends Repository<Aircraft, String>, ExistingAircraftService {
    Optional<Aircraft> findByCode(String code);

    List<Aircraft> findAll();

    void save(Aircraft aircraft);
}
