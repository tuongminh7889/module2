package ss12.ProductManager.model;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private float price;
    private int quantity;
    private String details;

    public Product(String id, String name, float price, int quantity, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.details = details;
    }

    public Product() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return
                "Mã sản phẩm: " + id + '\'' +
                        ", tên sản phẩm: " + name + '\'' +
                        ", giá sản phẩm: " + price +
                        ", số lượng : " + quantity +
                        ", thông tint: '" + details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}