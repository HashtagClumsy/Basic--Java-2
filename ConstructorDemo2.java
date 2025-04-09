class Item{
	int ItemNum;
	String ItemName;
	Item(int ItemNum, String ItemName){
		this.ItemNum= ItemNum;
		this.ItemName= ItemName;
	}
	
	Item(){};// default constructor
	void display()
	{
		System.out.println("Item Number = "+ItemNum);
		System.out.println("Item Name = "+ItemName);
	}

	
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Item item1 = new Item(111,"Monitor");
		item1.display();
		Item item2 = new Item();
		item2.display();
	}

}
