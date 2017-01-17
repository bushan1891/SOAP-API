package io.bush.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import io.bush.business.service.ProductServiceImpl;
import io.bush.model.Product;

// tells that your implementing a interface 
@WebService(endpointInterface = "io.bush.soap.ProductCatalogInterface", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	ProductServiceImpl service = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.bush.soap.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return service.getProductCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.bush.soap.ProductCatalogInterface#getProduct(java.lang.String)
	 */
	@Override
	public List<String> getProduct(String category) {
		return service.getProducts(category);
	}

	// glassfish will remove from wsdl
	/*
	 * (non-Javadoc)
	 * 
	 * @see io.bush.soap.ProductCatalogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return service.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.bush.soap.ProductCatalogInterface#getProductv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductv2(String category) {
		return service.getProductsv2(category);
	}

}
