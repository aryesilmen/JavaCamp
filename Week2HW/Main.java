package Week2HW;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setPrice(5000);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());

    }

}