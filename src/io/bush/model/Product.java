package io.bush.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = { "price", "sku", "name" }) // order in xml
public class Product {
	private String name;
	private String sku;
	private double price;

	// for jaxb we need no arg constructor
	public Product() {

	}

	public Product(String name, String sku, double price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name = "ProductName") // custom name in xml
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
