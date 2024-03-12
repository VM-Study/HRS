package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.BathroomFixture;
import edu.ssc.hrs.entity.repository.BathroomFixtureRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BathroomFixtureService {

    private final BathroomFixtureRepository bathroomFixtureRepository;

    public BathroomFixtureService(BathroomFixtureRepository bathroomFixtureRepository) {
        this.bathroomFixtureRepository = bathroomFixtureRepository;
    }

    public Iterable<BathroomFixture> findAll() {
        return bathroomFixtureRepository.findAll();
    }

    public Optional<BathroomFixture> findById(Long id) {
        return bathroomFixtureRepository.findById(id);
    }

    public BathroomFixture save(BathroomFixture bathroomFixture) {
        return bathroomFixtureRepository.save(bathroomFixture);
    }

    public void deleteById(Long id) {
        bathroomFixtureRepository.deleteById(id);
    }
}

