/*Create a class Book with the data members bno,bname,price. 
Create a class SpecialEditionBook which is subclass of Book and with a data member 
discount. Create a class BookTest with main() to test the above classes 
Note - Use constructors to give the values to the data members - create a method display() in Book class which displays bno,bname and price 
and override the same display() of Book class in SpecialEditionBook which displays 
bno,bname,price using  super.display() and display the value of discount.*/
class Book {
	int bno;
	String bname;
	double price;
	Book(int bno, String bname,double price) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	void display(){
		System.out.println("Book NUmber = " + bno);
		System.out.println("Book Name = " +bname);
		System.out.println("Book price = " +price+ "$");
		System.out.println("------------------------");

	}
}
class SpecialEditionBook extends Book{
	SpecialEditionBook(int bno, String bname, double price,double discount) {
		
		super(bno, bname, price);
		this.discount = discount;
	}
	double discount ;
	void display() {
		super.display(); // Call the display method of the superclass Book
		System.out.println("discount = " +discount+"%");
		System.out.println("------------------------");

	}
}
public class BookTest {

	public static void main(String[] args) {
		//Book b1 = new Book(1, "Barister parvatheshm", 78);
		//b1.display();
		SpecialEditionBook s1 = new SpecialEditionBook(1, "Barister parvatheshm", 78,50);
		s1.display();
	}

}
