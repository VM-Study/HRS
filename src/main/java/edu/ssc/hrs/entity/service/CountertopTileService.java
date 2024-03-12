package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.CountertopTile;
import edu.ssc.hrs.entity.repository.CountertopTileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountertopTileService {

    private final CountertopTileRepository countertopTileRepository;

    public CountertopTileService(CountertopTileRepository countertopTileRepository) {
        this.countertopTileRepository = countertopTileRepository;
    }

    public Iterable<CountertopTile> findAll() {
        return countertopTileRepository.findAll();
    }

    public Optional<CountertopTile> findById(Long id) {
        return countertopTileRepository.findById(id);
    }

    public CountertopTile save(CountertopTile countertopTile) {
        return countertopTileRepository.save(countertopTile);
    }

    public void deleteById(Long id) {
        countertopTileRepository.deleteById(id);
    }
}

