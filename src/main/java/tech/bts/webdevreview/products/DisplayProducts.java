package tech.bts.webdevreview.products;

import tech.bts.webdevreview.classes.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product p1 = new Product("iPhone", 1000, true);
        Product p2 = new Product("iPad", 1200, false);
        Product p3 = new Product("MacBook", 2200, true);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        List<String> fields = Arrays.asList("Name", "Price", "Available");

        int width = 15;

        String title = "";
        for (String field : fields) {
            title += StringUtil.padRight(field, width);
        }
        System.out.println(title);

        String line = StringUtil.repeatString("-", width * fields.size());
        System.out.println(line);

        String productLine;
        for (Product product : products) {
            productLine = StringUtil.padRight(product.getName(), width) + StringUtil.padRight("" + product.getPrice(), width) + StringUtil.padRight("" + product.isAvailable(), width);
            System.out.println(productLine);
        }

    }
}
