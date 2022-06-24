package br.com.wm.clines.api.aircraft;

import static br.com.wm.clines.shared.util.StringNormalizer.normalize;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Aircraft;
import br.com.wm.clines.shared.infra.Mapper;


@Component
public class AircraftFormMapper implements Mapper<AircraftForm, Aircraft> {

    @Override
    public Aircraft map(AircraftForm source) {
        return new Aircraft(normalize(source.getCode()), source.getModel());
    }
}
