package workshop04;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus",50000,5);
		Book b2 = new Book("Java 2.0",40000,3);
		Book b3 = new Book("JSP Servlet",60000,6);
	
		System.out.println("책이름"+"\t\t"+"가격"+"\t"+"할인율"+"\t"+"할인후금액");
		System.out.println("----------------------------------------");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
	}
	
	

}
