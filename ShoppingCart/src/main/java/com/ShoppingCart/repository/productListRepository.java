package com.ShoppingCart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ShoppingCart.Document.ProductList;


public interface productListRepository extends MongoRepository<ProductList, String> {

}
