package com.nttdata.bootcamp.product.Product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Document(collection = "product")
public class Product {
    @Id
    private String id = UUID.randomUUID().toString();
    @Field(name = "product_type")
    private String productType;
    private String name;
    @Field(name = "max_count_personal")
    private Integer maxCountPersonal;
    @Field(name = "max_count_business")
    private Integer maxCountBusiness;
    @Field(name = "created_by")
    private String createdBy;
    private Float commission;
    @Field(name = "max_movement")
    private Integer maxMovements;
    @Field(name = "date_action")
    private Integer dateAction;
    private Boolean active;
}