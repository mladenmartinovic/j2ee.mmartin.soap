package com.mmartin.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	public List<String> getProductCategories(){
		List<String> categories=new ArrayList<>();
		categories.add("Book");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

}
