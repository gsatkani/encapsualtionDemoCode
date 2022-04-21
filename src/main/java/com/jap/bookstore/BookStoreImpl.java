package com.jap.bookstore;

public class BookStoreImpl {
	public static void main(String[] args) {
		// Declare and initialize author, book and bookstore objects
		Book book = new Book();
		book.setISBNNo(12334);
		book.setBookName("Java");
		book.setGenre("fiction");
		book.setPrice(250);

		Author author = new Author();
		author.setAuthorName("Siva K");
		author.setAuthorPenName("Pen");

		book.setAuthor(author);

		// Use the get and set methods to set values to the variables

		// Display book details before discount is calculated
		System.out.println("The book details before discount : ");
		System.out.println(book.displayBookDetails());
		// Calculate discount on the books by calling the methods

		Bookstore bookstore = new Bookstore();
		float discountedPrice = bookstore.calculateDiscount(book, 25);
		book.setPrice(discountedPrice);

		// Display book details after discount is calculated
		System.out.println("The book details after discount : ");
		System.out.println(book.displayBookDetails());

	}

}
