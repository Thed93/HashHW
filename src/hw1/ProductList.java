package hw1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductList {
    Set<Product> productList = new HashSet<>();

    public ProductList() {
        this.productList = productList;
    }
    public void addProduct(Product product){
        if (productList.contains(product)){
            throw new RuntimeException("Данный товар уже добавлен");
        } else {
            productList.add(product);
        }
    }
    public void deleteProductFromList(Product product) {
        productList.remove(product);
    }

    public void showProductList() {
        System.out.println(Arrays.toString(productList.toArray()));
    }
}
