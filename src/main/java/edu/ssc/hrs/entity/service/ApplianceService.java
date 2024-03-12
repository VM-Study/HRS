package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Appliance;
import edu.ssc.hrs.entity.repository.ApplianceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplianceService {

    private final ApplianceRepository applianceRepository;

    public ApplianceService(ApplianceRepository applianceRepository) {
        this.applianceRepository = applianceRepository;
    }

    public Iterable<Appliance> findAll() {
        return applianceRepository.findAll();
    }

    public Optional<Appliance> findById(Long id) {
        return applianceRepository.findById(id);
    }

    public Appliance save(Appliance appliance) {
        return applianceRepository.save(appliance);
    }

    public void deleteById(Long id) {
        applianceRepository.deleteById(id);
    }
}

