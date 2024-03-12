package edu.ssc.hrs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "design_installation_services")
public class DesignInstallation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceID;

    @Column(nullable = false)
    private String type;

    @Column(name = "hourly_rate", nullable = false)
    private Double hourlyRate;

    @Column(name = "min_charge", nullable = false)
    private Double minCharge;

    @ManyToMany
    @JoinTable(
            name = "service_products_services",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "product_service_id")
    )
    private Set<ProductService> productsServices = new HashSet<>();
}
