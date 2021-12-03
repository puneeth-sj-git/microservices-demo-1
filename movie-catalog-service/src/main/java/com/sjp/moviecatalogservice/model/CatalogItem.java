package com.sjp.moviecatalogservice.model;

public class CatalogItem {
	String name;
	String desc;
	int ratings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public CatalogItem(String name, String desc, int ratings) {
		super();
		this.name = name;
		this.desc = desc;
		this.ratings = ratings;
	}
	
}
