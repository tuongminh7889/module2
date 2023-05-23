package ss12.ProductManager.repository.interrface;
import ss12.ProductManager.model.Product;

import java.util.List;
public interface IProductRepository {
    List getAll();

    Product getById(String checkId);

    void add(Product newProduct);

    void remove(Product product);

    List<Product> getByName(String name);

    void setProduct(Product product, String newName, float newPrice, int newQuantity, String newDetails);

    void sortUp();

    void sortDown();
}

