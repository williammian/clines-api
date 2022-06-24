package br.com.wm.clines.api.aircraftmodels;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.AircraftModel;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class AircraftModelViewMapper implements Mapper<AircraftModel, AircraftModelView> {

    @Override
    public AircraftModelView map(AircraftModel source) {
        var id = source.getId();
        var description = source.getDescription();
        return new AircraftModelView(id, description);
    }
}
