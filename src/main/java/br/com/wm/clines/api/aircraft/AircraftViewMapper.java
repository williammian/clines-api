package br.com.wm.clines.api.aircraft;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Aircraft;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class AircraftViewMapper implements Mapper<Aircraft, AircraftView> {

    @Override
    public AircraftView map(Aircraft source) {
        var model = source.getModel();
        return new AircraftView(source.getCode(), model);
    }
}
