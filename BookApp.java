public class BookApp {
	public static void main(String[] args) {
		Book b= new Book("Good day");
		b.setBookAuthor("Mr Good");
		b.setDescription("It is a book about how Mr good had a good day.");
		b.setIsInStock(true);
		b.setPrice(20.00);
		b.getDisplayText();
	}

}
