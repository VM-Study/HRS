package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.DesignInstallation;
import edu.ssc.hrs.entity.repository.DesignInstallationServiceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DesignInstallationService {

    private final DesignInstallationServiceRepository designInstallationServiceRepository;

    public DesignInstallationService(DesignInstallationServiceRepository designInstallationServiceRepository) {
        this.designInstallationServiceRepository = designInstallationServiceRepository;
    }

    public Iterable<DesignInstallation> findAll() {
        return designInstallationServiceRepository.findAll();
    }

    public Optional<DesignInstallation> findById(Long id) {
        return designInstallationServiceRepository.findById(id);
    }

    public DesignInstallation save(DesignInstallation designInstallation) {
        return designInstallationServiceRepository.save(designInstallation);
    }

    public void deleteById(Long id) {
        designInstallationServiceRepository.deleteById(id);
    }
}

