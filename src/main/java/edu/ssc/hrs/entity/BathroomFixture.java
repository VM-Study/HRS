package edu.ssc.hrs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bathroom_fixtures")
public class BathroomFixture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fixtureID;

    @ManyToOne
    @JoinColumn(name = "product_service_id", nullable = false)
    private ProductService productService;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String website;

    @Column(nullable = false)
    private String category;
}
