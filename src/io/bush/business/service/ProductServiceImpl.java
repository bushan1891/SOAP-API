package io.bush.business.service;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("Inferno");
		bookList.add("Harry potter");
		bookList.add("2 states");
		
		musicList.add("3 doors");
		musicList.add("Metalica");
		musicList.add("Iron Madin");
		
		movieList.add("Die hard");
		movieList.add("Harry potter");
		movieList.add("xxx");
		
	}
	
	public List<String> getProductCategories(){
		List<String> catogories = new ArrayList<String>();
		catogories.add("Books");
		catogories.add("Movies");
		catogories.add("Music");
		return catogories;
	}
	
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		
	return null;	
	}
	
	public boolean addProduct(String category ,String product){
		
		switch(category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
			movieList.add(product);
			break;
		case "movies":
			musicList.add(product);
			break;	
		}
		return true;
	}
	
	
}

