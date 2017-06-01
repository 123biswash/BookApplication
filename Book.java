
public class Book {
		
	public Book(String bookTitle){
		this.setBookTitle(bookTitle);	
		}
		private String bookAuthor;
		private String description;
		private double price;
		private boolean isInStock;
		private String bookTitle;
		
	public void getDisplayText(){
		System.out.println(bookAuthor);
		System.out.println(bookTitle);
		System.out.println(description);
		}
	
	public String getBookTitle() {
		return bookTitle;
	}

		
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsInStock() {
		return isInStock;
	}

	public void setIsInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	
	
}



/*
Create a project in Eclipse called BookApplication

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, 
an overloaded constructor and a method called getDisplayText() which prints
 the author, title and description.

The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method 
you shall create an instance of a Book and print the Author, Title and Description.

Publish your solution to GitHub and submit your GitHub url as the assignment. 
 */
