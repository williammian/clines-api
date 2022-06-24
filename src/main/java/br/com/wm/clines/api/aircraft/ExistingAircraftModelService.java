package br.com.wm.clines.api.aircraft;


import java.util.Optional;

import br.com.wm.clines.shared.domain.AircraftModel;

public interface ExistingAircraftModelService {
    Optional<AircraftModel> findById(Long id);
}
