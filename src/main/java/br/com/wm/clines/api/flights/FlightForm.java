package br.com.wm.clines.api.flights;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.wm.clines.shared.domain.Aircraft;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
public class FlightForm {
    @JsonIgnore
    private Aircraft aircraft;

    @Positive
    @NotNull
    private BigDecimal price;

    @NotBlank
    private String aircraftId;

    @NotNull
    @Valid
    private WaypointForm arrival;

    @NotNull
    @Valid
    private WaypointForm departure;
}

