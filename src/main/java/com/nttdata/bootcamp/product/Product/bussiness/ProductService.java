package com.nttdata.bootcamp.product.Product.bussiness;


import com.nttdata.bootcamp.product.Product.model.Product;
import com.nttdata.bootcamp.product.Product.model.dto.RateDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<Product> create(Product product);
    Flux<Product> findAll();
    Mono<Product> findById(String customerId);
    Mono<Product> update(Product product);
    Mono<Product> remove(String customerId);
    Mono<Product> addRate(RateDto rate, String product_id);
}
