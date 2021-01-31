package com.ShoppingCart.Document;

import org.springframework.data.annotation.Id;

public class OrderList {
	@Id
	  private String id;

	  private String title;
	  private String description;
	  private boolean published;

	  public OrderList() {

	  }

	  public OrderList(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }


	  @Override
	  public String toString() {
	    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	  }
}
