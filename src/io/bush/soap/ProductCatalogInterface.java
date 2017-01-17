package io.bush.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import io.bush.model.Product;

// called Service endpoint interface at server side 
@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(exclude = false)
	List<String> getProductCategories();

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	List<String> getProduct(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductv2(String category);

}