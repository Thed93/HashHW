import hw1.Product;
import hw1.ProductList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product(15, 8, "Банан");
        Product carrot = new Product(20,10, "Морковь");
        Product potato = new Product(13,20, "Картошка");

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.showProductList();
        productList.addProduct(carrot);







    }

}