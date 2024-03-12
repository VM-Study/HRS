package edu.ssc.hrs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "products_services")
public class ProductService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productServiceID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Boolean availability;

    @Column(name = "image_url")
    private String imageURL;

    @ManyToMany(mappedBy = "productsServices")
    private Set<Order> orders = new HashSet<>();
}
