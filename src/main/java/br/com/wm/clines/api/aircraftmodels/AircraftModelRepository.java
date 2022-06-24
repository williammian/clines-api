package br.com.wm.clines.api.aircraftmodels;

import org.springframework.data.repository.Repository;

import br.com.wm.clines.api.aircraft.ExistingAircraftModelService;
import br.com.wm.clines.shared.domain.AircraftModel;

import java.util.List;
import java.util.Optional;

public interface AircraftModelRepository extends Repository<AircraftModel, Long>, ExistingAircraftModelService {
    void save(AircraftModel aircraftModel);
    List<AircraftModel> findAll();
    Optional<AircraftModel> findByDescription(String description);
    Optional<AircraftModel> findById(Long id);
}
