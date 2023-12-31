package com.peterson.helpdesk.repositories;

import com.peterson.helpdesk.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    Optional<Product> findBySku(String sku);
}

