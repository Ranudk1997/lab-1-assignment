package deepak.cg.gla.spring.service;

import java.util.List;

import deepak.cg.gla.spring.entity.Product;
import deepak.cg.gla.spring.entity.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
