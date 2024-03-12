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
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierID;

    @Column(nullable = false)
    private String name;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;

    @Column(name = "products_services_supplied", nullable = false)
    private String productsServicesSupplied;

    @Column(name = "terms_of_cooperation", nullable = false)
    private String termsOfCooperation;

    @ManyToMany
    @JoinTable(
            name = "supplier_products_services",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "product_service_id")
    )
    private Set<ProductService> productsServices = new HashSet<>();
}