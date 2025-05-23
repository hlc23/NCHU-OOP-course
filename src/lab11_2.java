import java.util.ArrayList;
import java.util.List;

class ShoppingList {
	List<String> i;

    public ShoppingList() {
        this.i = new ArrayList<String>();
    }

    public void addItem(String item) {
        this.i.add(item);
    }

    public void removeLastItem() {
    	this.i.remove(this.i.size()-1);
    }

    public void displayItems() {
    	if (this.i.size() == 0) {
    		System.out.println("The shopping list is empty.");
    		return;
    	}
        for (String i: this.i) {
        	System.out.println(i);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();
        list.addItem("Apples");
        list.addItem("Bananas");
        list.addItem("Dog");
        list.displayItems(); // Should print: Apples\nBananas

        list.removeLastItem();
        list.displayItems(); // Should print: Apples

        list.removeLastItem();
        list.displayItems(); // Should print: The shopping list is empty.
    }
}