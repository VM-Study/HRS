package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Lighting;
import edu.ssc.hrs.entity.repository.LightingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LightingService {

    private final LightingRepository lightingRepository;

    public LightingService(LightingRepository lightingRepository) {
        this.lightingRepository = lightingRepository;
    }

    public Iterable<Lighting> findAll() {
        return lightingRepository.findAll();
    }

    public Optional<Lighting> findById(Long id) {
        return lightingRepository.findById(id);
    }

    public Lighting save(Lighting lighting) {
        return lightingRepository.save(lighting);
    }

    public void deleteById(Long id) {
        lightingRepository.deleteById(id);
    }
}

