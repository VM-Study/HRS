package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Customer;
import edu.ssc.hrs.entity.Location;
import edu.ssc.hrs.entity.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Iterable<Location> findAll() {
        return locationRepository.findAll();
    }

    public Optional<Location> findById(Long id) {
        return locationRepository.findById(id);
    }

    public Location save(Location location) {
        return locationRepository.save(location);
    }

    public void deleteById(Long id) {
        locationRepository.deleteById(id);
    }

    public long count() {
        return locationRepository.count();
    }

    public void saveAll(Iterable<Location> locations) {
        locationRepository.saveAll(locations);
    }

}

