package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Delivery;
import edu.ssc.hrs.entity.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public Iterable<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    public Optional<Delivery> findById(Long id) {
        return deliveryRepository.findById(id);
    }

    public Delivery save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public void deleteById(Long id) {
        deliveryRepository.deleteById(id);
    }
}

