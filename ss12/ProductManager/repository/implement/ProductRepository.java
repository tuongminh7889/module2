package ss12.ProductManager.repository.implement;

import ss12.ProductManager.model.Product;
import ss12.ProductManager.repository.interrface.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("Kẹo-001", "candy", 5000, 10, "Kẹo rất ngọt"));
        productList.add(new Product("Bánh-002", "Oreo", 15000, 10, "Bánh Socola rất ngon"));
        productList.add(new Product("Bao-003", "Durex", 75000, 10, "Mỏng chân thật"));
        productList.add(new Product("Nước-004", "Cola", 10000, 10, "Sảng khoái dài lâu"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product getById(String checkId) {
        for (Product product : productList) {
            if (product.getId().equals(checkId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);
    }

    /**
     * Tìm kiếm sản phẩm theo tên
     *
     * @param name
     * @return
     */
    @Override
    public List<Product> getByName(String name) {
        List<Product> newList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                newList.add(product);
            }

        }
        if (newList.size() > 0) {
            return newList;
        } else {
            return null;
        }
    }

    @Override
    public void sortUp() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void sortDown() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void setProduct(Product product, String newName, float newPrice, int newQuantity, String newDetails) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(product)) {
                productList.get(i).setName(newName);
                productList.get(i).setPrice(newPrice);
                productList.get(i).setQuantity(newQuantity);
                productList.get(i).setDetails(newDetails);
            }
        }
    }

}