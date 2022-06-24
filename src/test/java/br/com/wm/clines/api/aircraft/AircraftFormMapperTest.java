package br.com.wm.clines.api.aircraft;

import org.junit.jupiter.api.Test;

import br.com.wm.clines.api.aircraft.AircraftForm;
import br.com.wm.clines.api.aircraft.AircraftFormMapper;
import br.com.wm.clines.shared.domain.AircraftModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AircraftFormMapperTest {
    private static final Long EXISTING_MODEL_ID = 1L;
    private static final AircraftModel BOEING_836 = new AircraftModel(EXISTING_MODEL_ID, "Boeing 836");
    private static final String INPUT_AIRCRAFT_CODE = "bca123";
    private static final String EXPECTED_AIRCRAFT_CODE = "BCA123";

    private AircraftFormMapper mapper = new AircraftFormMapper();

    @Test
    void shouldConvertAircraftFormToAircraft() {
        var form = new AircraftForm(INPUT_AIRCRAFT_CODE, EXISTING_MODEL_ID);
        form.setModel(BOEING_836);

        var aircraft = mapper.map(form);

        assertEquals(EXPECTED_AIRCRAFT_CODE, aircraft.getCode());
        assertEquals(BOEING_836, aircraft.getModel());
    }
}
