package lv.lu.finalwork.model.ui;

public class ProductData {
    private final String id;
    private final String name;
    private final String price;
    private final String category;

    public ProductData(String id, String name, String price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
