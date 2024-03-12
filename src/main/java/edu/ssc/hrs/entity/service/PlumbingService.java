package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Plumbing;
import edu.ssc.hrs.entity.repository.PlumbingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlumbingService {

    private final PlumbingRepository plumbingRepository;

    public PlumbingService(PlumbingRepository plumbingRepository) {
        this.plumbingRepository = plumbingRepository;
    }

    public Iterable<Plumbing> findAll() {
        return plumbingRepository.findAll();
    }

    public Optional<Plumbing> findById(Long id) {
        return plumbingRepository.findById(id);
    }

    public Plumbing save(Plumbing plumbing) {
        return plumbingRepository.save(plumbing);
    }

    public void deleteById(Long id) {
        plumbingRepository.deleteById(id);
    }
}

