package eStoreProduct.ProductsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eStoreProduct.DAO.ProductDAO;
import eStoreProduct.model.Product;

@Service
public class ProductService {

	private final ProductDAO productDAO;

	@Autowired
	public ProductService(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<Product> getAllProductCategories() {
		return productDAO.getAllProducts();
	}

	public List<Product> getProductsByCategory(int category_id) {
		return productDAO.getProductsByCategory(category_id);
	}

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
}