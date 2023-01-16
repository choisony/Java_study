package workshop04;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() {}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice(int price, double rate) {
		return price - (price * (double)(rate/100));
	}

	@Override
	public String toString() {
		return bookName +"\t" +  bookPrice + "원\t" + bookDiscountRate + "%\t" + getDiscountBookPrice(this.bookPrice,this.bookDiscountRate)+"원";
	}
	
	
	
}
