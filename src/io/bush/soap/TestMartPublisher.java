package io.bush.soap;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog",new ProductCatalog());
		System.out.println("published");
	}

}
