package br.com.wm.clines.api.airports;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.Airport;
import br.com.wm.clines.shared.infra.Mapper;

@Component
@AllArgsConstructor
public class AirportViewMapper implements Mapper<Airport, AirportView> {

    private final AircraftLocationViewMapper aircraftLocationViewMapper;

    @Override
    public AirportView map(Airport source) {
        var locationView = aircraftLocationViewMapper.map(source.getLocation());

        return new AirportView(source.getCode(), locationView);
    }
}
