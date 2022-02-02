package com.nttdata.bootcamp.product.Product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class RateDto {

  private String id = UUID.randomUUID().toString();
  @Field(name = "amount_purchase")
  private Float amountPurchase;
  @Field(name = "amount_sale")
  private Float amountSale;
  @Field(name = "is_active")
  private Boolean active;
  @Field(name = "created_by")
  private String createdBy;
  @Field(name = "created_at")
  private LocalDate createdAt;
}
