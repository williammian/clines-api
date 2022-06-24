package br.com.wm.clines.api.aircraftmodels;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.AircraftModel;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class AircraftModelFormMapper implements Mapper<AircraftModelForm, AircraftModel> {

    @Override
    public AircraftModel map(AircraftModelForm source) { return new AircraftModel(source.getDescription()); }
}
