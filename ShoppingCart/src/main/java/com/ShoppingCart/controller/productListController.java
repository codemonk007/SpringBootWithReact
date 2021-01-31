package com.ShoppingCart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ShoppingCart.Document.ProductList;
import com.ShoppingCart.repository.productListRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class productListController{

	@Autowired
	productListRepository _productListRepository;
	
	  @GetMapping("/ProductList")
	  public ResponseEntity<List<ProductList>> getAllProductList() {
	    try {
	      List<ProductList> productList = new ArrayList<ProductList>();
	      _productListRepository.findAll().forEach(productList::add);
	      return new ResponseEntity<>(productList, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  @PostMapping("/ProductList")
	  public ResponseEntity<ProductList> createProductList(@RequestBody ProductList productList) {
	    try {
	    	ProductList _productList = _productListRepository.save(new ProductList(productList.getVegitables(),productList.getMobiles(),productList.getBooks()));
	      return new ResponseEntity<>(_productList, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
}
