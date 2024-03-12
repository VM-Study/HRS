package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Conference;
import edu.ssc.hrs.entity.repository.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConferenceService {

    private final ConferenceRepository conferenceRepository;

    public ConferenceService(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    public Iterable<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    public Optional<Conference> findById(Long id) {
        return conferenceRepository.findById(id);
    }

    public Conference save(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public void deleteById(Long id) {
        conferenceRepository.deleteById(id);
    }
}

