package br.com.wm.clines.api.flights;


import java.util.Optional;

import br.com.wm.clines.shared.domain.Aircraft;

public interface ExistingAircraftService {
    Optional<Aircraft> findByCode(String code);
}
