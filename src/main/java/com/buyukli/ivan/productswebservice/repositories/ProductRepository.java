package com.buyukli.ivan.productswebservice.repositories;

import com.buyukli.ivan.productswebservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
