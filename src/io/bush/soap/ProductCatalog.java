package io.bush.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import io.bush.business.service.ProductServiceImpl;

// servicename decides the wsdl url
@WebService(name="TestMartCatalog",portName="TestMartCatalogPort",serviceName="TestMartCatalogService"
,targetNamespace="http://www.testmart.com")
public class ProductCatalog {
	ProductServiceImpl service = new ProductServiceImpl();
	
	@WebMethod(exclude=true)
	public List<String> getProductCategories(){
		return service.getProductCategories();
	}
	@WebMethod(action="fetch_categories",operationName="fetchCategories")
	public List<String> getProduct(String category){
		return service.getProducts(category);
	}
	// glassfish will remove from wsdl
	@WebMethod
	public boolean addProduct(String category,String product){
		return service.addProduct(category, product);
	}
}
