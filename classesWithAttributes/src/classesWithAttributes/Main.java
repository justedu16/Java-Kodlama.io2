package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.inStock = 45;
		product.description = "Guzel bir Laptop";
		product.price = 18000;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

}
