package examoop;

import java.util.ArrayList;

public class Contract {
	private int storeId;
	private int customerId;
	private ArrayList<Product> products;
	private ConditionType type;
	private double totalPrice;
	
	public int getStoreId() {
		return storeId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public ConditionType getContractType() {
		return type;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public Contract()
	{}
	
	public Contract(int storeId, int customerId, ConditionType type) {
		this.storeId = storeId;
		this.customerId = customerId;
		products = new ArrayList<Product>();
		this.type = type;
		this.totalPrice = 0;
	}

	public void addProduct(Product product) {
		totalPrice += product.price;
		products.add(product);
	}
}
