package deepak.cg.gla.spring.dao;

import java.util.List;

import deepak.cg.gla.spring.entity.Product;
import deepak.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
