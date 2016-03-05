package koans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class ShoppingList {
	//Map<Product, Count>
	private Map<Product, Integer> storage = new HashMap<Product, Integer>();
	
	public void addItem(Product product, Integer count){
		if(storage.get(product) == null) {
			storage.put(product, count);
		} else {
			storage.put(product, storage.get(count) + count);
		}
	}
	
	public void addItem(Product product){
		addItem(product, 1);
	}

	public Integer checkHowMuch(Product product) {
		return storage.get(product);
	}
	
	public void removeProductFromList(Product product, Integer count) {
		storage.put(product, storage.get(product) -1);
	}

	public void removeProductFromList(Product product) {
		storage.remove(product);
	}
	
	public String showList(){
		Iterator<Product> it = new TreeSet<>(storage.keySet()).iterator();
		StringBuilder str = null;
		while(it.hasNext()) {
			str.append(it.next() + ": " + storage.get(it.next()));
		}
		return str.toString();
	}

	public void getItemsCount() {
		int sum = 0;
		for(Integer count : storage.values()) {
			sum += count;
		}
	}

	public int getProductsCount() {
		return storage.size();
	}
}
