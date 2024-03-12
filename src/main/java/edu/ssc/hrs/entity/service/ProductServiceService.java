package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.ProductService;
import edu.ssc.hrs.entity.repository.ProductServiceRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceService {

    private final ProductServiceRepository productServiceRepository;

    public ProductServiceService(ProductServiceRepository productServiceRepository) {
        this.productServiceRepository = productServiceRepository;
    }

    public Iterable<ProductService> findAll() {
        return productServiceRepository.findAll(Sort.by("productServiceID"));
    }

    public Optional<ProductService> findById(Long id) {
        return productServiceRepository.findById(id);
    }

    public void save(ProductService productService) {
        productServiceRepository.save(productService);
    }

    public void deleteAll() {
        productServiceRepository.deleteAll();
    }

    public long count() {
        return productServiceRepository.count();
    }

    public void saveAll(Iterable<ProductService> productServices) {
        productServiceRepository.saveAll(productServices);
    }
}

