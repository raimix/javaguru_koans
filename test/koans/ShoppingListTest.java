package koans;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingListTest {

	@Test
	public void addItemFirstTimeTest() {
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.APPLE);
		Assert.assertEquals(1, sl.checkHowMuch(Product.APPLE));
	}
	
	@Test
	public void addItemFirstTimeTest2() {
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.APPLE, 2);
		Assert.assertEquals(2, sl.checkHowMuch(Product.APPLE));
	}
	
	@Test
	public void itemNotAddedTest(){
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.CABBAGE);
		Assert.assertEquals(0, sl.checkHowMuch(Product.APPLE));
	}
	
	@Test
	public void showAllItemsTest(){
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.CABBAGE);
		sl.addItem(Product.APPLE, 2);
		StringBuilder expectedString = new StringBuilder();
		expectedString.append("APPLE: 2\n");
		expectedString.append("CABBAGE: 1");
		Assert.assertEquals(expectedString.toString(), sl.showList());
	}
	
	@Test
	public void showItemsCountTest(){
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.CABBAGE);
		sl.addItem(Product.APPLE, 2);
		Assert.assertEquals(3, sl.getItemsCount());
	}
	
	@Test
	public void showProductsCountTest(){
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.CABBAGE);
		sl.addItem(Product.APPLE, 2);
		Assert.assertEquals(2, sl.getProductsCount());
	}
	
	@Test
	public void showProductsCountTest2(){
		ShoppingList sl = new ShoppingList();
		sl.addItem(Product.CABBAGE);
		sl.addItem(Product.APPLE, 2);
		sl.removeProductFromList(Product.CABBAGE, 1);
		Assert.assertEquals(1, sl.getProductsCount());
	}
}
