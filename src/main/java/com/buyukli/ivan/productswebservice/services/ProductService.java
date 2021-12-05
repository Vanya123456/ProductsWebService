package com.buyukli.ivan.productswebservice.services;

import com.buyukli.ivan.productswebservice.entities.Product;
import com.buyukli.ivan.productswebservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

    public void delete(Product product){
        productRepository.delete(product);
    }

//    public void changePrice(Long productId, Integer delta) {
//        productRepository.changeCost(productId, delta);
//    }

    public List<Product> findByPriceBetween(Integer min, Integer max) {
        return productRepository.findByCostBetween(min, max);
    }
}
