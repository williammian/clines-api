package br.com.wm.clines.api.airports;

import static br.com.wm.clines.shared.util.StringNormalizer.normalize;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Airport;
import br.com.wm.clines.shared.infra.Mapper;


@Component
public class AirportFormMapper implements Mapper<AirportForm, Airport> {
    @Override
    public Airport map(AirportForm source) {
        var code = normalize(source.getCode());
        return new Airport(code, source.getLocation());
    }
}
