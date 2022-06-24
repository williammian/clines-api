package br.com.wm.clines.api.flights;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.wm.clines.shared.domain.Airport;
import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Data
class WaypointForm {
    @JsonIgnore
    private Airport airport;

    @NotNull
    @Positive
    private Long airportId;

    @FutureOrPresent
    private LocalDateTime time;

    @NotBlank
    private String gate;
}
