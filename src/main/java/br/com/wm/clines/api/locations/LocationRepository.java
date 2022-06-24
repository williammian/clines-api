package br.com.wm.clines.api.locations;

import org.springframework.data.repository.Repository;

import br.com.wm.clines.api.airports.ExistingLocationService;
import br.com.wm.clines.shared.domain.Location;

import java.util.List;

public interface LocationRepository extends Repository<Location, Long>, ExistingLocationService {
    void save(Location location);
    List<Location> findAll();
}
