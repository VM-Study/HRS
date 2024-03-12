package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Customer;
import edu.ssc.hrs.entity.repository.CustomerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll(Sort.by("customerID"));
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }

    public long count() {
        return customerRepository.count();
    }

    public void saveAll(Iterable<Customer> customers) {
        customerRepository.saveAll(customers);
    }
}
