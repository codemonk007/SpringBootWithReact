package com.ShoppingCart.Document;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ShoppingCart.Bean.Book;
import com.ShoppingCart.Bean.Mobile;
import com.ShoppingCart.Bean.Vegitable;

@Document (collection = "ProductList")
public class ProductList {
	
	@Id
	  private String id;
	  private Vegitable[] Vegitables;
	  private Mobile[] Mobiles;
	  private Book[] Books;

	  public ProductList() {

	  }

	public ProductList(Vegitable[] vegitables, Mobile[] mobiles, Book[] books) {
		super();
		Vegitables = vegitables;
		Mobiles = mobiles;
		Books = books;
	}

	@Override
	public String toString() {
		return "ProductList [id=" + id + ", Vegitables=" + Arrays.toString(Vegitables) + ", Mobiles="
				+ Arrays.toString(Mobiles) + ", Books=" + Arrays.toString(Books) + "]";
	}

	  public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vegitable[] getVegitables() {
		return Vegitables;
	}

	public void setVegitables(Vegitable[] vegitables) {
		Vegitables = vegitables;
	}

	public Mobile[] getMobiles() {
		return Mobiles;
	}

	public void setMobiles(Mobile[] mobiles) {
		Mobiles = mobiles;
	}

	public Book[] getBooks() {
		return Books;
	}

	public void setBooks(Book[] books) {
		Books = books;
	}


}
