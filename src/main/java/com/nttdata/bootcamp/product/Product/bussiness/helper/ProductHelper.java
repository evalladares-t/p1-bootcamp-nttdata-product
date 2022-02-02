package com.nttdata.bootcamp.product.Product.bussiness.helper;

import com.nttdata.bootcamp.product.Product.model.Product;
import com.nttdata.bootcamp.product.Product.model.dto.RateDto;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class ProductHelper {

  public Mono<Product> addRate(Product product, RateDto rateDto){
    if(product.getRate() == null){
      product.setRate(new ArrayList<>());
    }
    product.getRate().forEach(objRate->{
      objRate.setActive(false);
    });
    rateDto.setCreatedAt(LocalDate.now());
    rateDto.setActive(true);
    product.addRate(rateDto);
    return Mono.just(product);
  }
}
