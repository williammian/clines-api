package br.com.wm.clines.api.aircraftmodels;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import br.com.wm.clines.shared.exceptions.ResourceAlreadyExistsException;
import br.com.wm.clines.shared.exceptions.ResourceNotFoundException;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class AircraftModelService {
    private final AircraftModelRepository repository;
    private final AircraftModelFormMapper formMapper;
    private final AircraftModelViewMapper viewMapper;

    public Long createAircraftModelBy(AircraftModelForm form) {
        repository.findByDescription(form.getDescription()).ifPresent(
                (existingAircraftModel) -> {
                    throw new ResourceAlreadyExistsException("Aircraft Model already exists");
                });
        var aircraftModel = formMapper.map(form);

        repository.save(aircraftModel);

        return aircraftModel.getId();
    }
    
    public List<AircraftModelView> listAllAircraftModels() {
        return repository.findAll().stream().map(viewMapper::map).collect(toList());
    }

    public AircraftModelView showAircraftModelBy(Long aircraftModelId) {
        var aircraftModel = repository.findById(aircraftModelId).orElseThrow(() -> new ResourceNotFoundException("Cannot find aircraft model"));
        return viewMapper.map(aircraftModel);
    }
}
