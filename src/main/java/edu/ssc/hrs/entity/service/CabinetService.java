package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Cabinet;
import edu.ssc.hrs.entity.repository.CabinetRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CabinetService {

    private final CabinetRepository cabinetRepository;

    public CabinetService(CabinetRepository cabinetRepository) {
        this.cabinetRepository = cabinetRepository;
    }

    public Iterable<Cabinet> findAll() {
        return cabinetRepository.findAll();
    }

    public Optional<Cabinet> findById(Long id) {
        return cabinetRepository.findById(id);
    }

    public Cabinet save(Cabinet cabinet) {
        return cabinetRepository.save(cabinet);
    }

    public void deleteById(Long id) {
        cabinetRepository.deleteById(id);
    }
}

