package com.ShoppingCart.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "ProductList")
public class Mobile {
	
	@Id
	  private String id;
	  private String name;
	  private String catagory;
	  private boolean addToWishList;
	  private boolean cartAdded;
	  private String imageurl;
	  private Float Price;
	  private String Denaminamtion;
	  private int itemCount;
	  private int itemLeft;

	  public Mobile() {

	  }

	
	public Mobile(String id, String name, String catagory, boolean addToWishList, boolean cartAdded,
			String imageurl, Float price, String denaminamtion, int itemCount, int itemLeft) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
		this.addToWishList = addToWishList;
		this.cartAdded = cartAdded;
		this.imageurl = imageurl;
		Price = price;
		Denaminamtion = denaminamtion;
		this.itemCount = itemCount;
		this.itemLeft = itemLeft;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public boolean isAddToWishList() {
		return addToWishList;
	}

	public void setAddToWishList(boolean addToWishList) {
		this.addToWishList = addToWishList;
	}

	public boolean isCartAdded() {
		return cartAdded;
	}

	public void setCartAdded(boolean cartAdded) {
		this.cartAdded = cartAdded;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	public String getDenaminamtion() {
		return Denaminamtion;
	}

	public void setDenaminamtion(String denaminamtion) {
		Denaminamtion = denaminamtion;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getItemLeft() {
		return itemLeft;
	}

	public void setItemLeft(int itemLeft) {
		this.itemLeft = itemLeft;
	}

	  @Override
	public String toString() {
		return "ProductList [id=" + id + ", name=" + name + ", catagory=" + catagory + ", addToWishList="
				+ addToWishList + ", cartAdded=" + cartAdded + ", imageurl=" + imageurl + ", Price=" + Price
				+ ", Denaminamtion=" + Denaminamtion + ", itemCount=" + itemCount + ", itemLeft=" + itemLeft + "]";
	}

}
