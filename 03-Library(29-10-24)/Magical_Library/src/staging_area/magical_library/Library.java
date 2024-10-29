package staging_area.magical_library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<MagicalBook> magicalBooks;
		
	public Library() {
		magicalBooks = new ArrayList<>();
	}

	public void addBook(MagicalBook book) {
		magicalBooks.add(book);
		System.out.println(book.getTitle() + " added to the library.");
	}
	
	public void removeBook(MagicalBook book) {
		magicalBooks.remove(book);
		System.out.println(book.getTitle() + " remove from the library.");
	}
	
	public void listAllBooks() {
		System.out.println("All the books from the library");
		for(MagicalBook book : magicalBooks) {
			System.out.println("- " + book.getTitle());
		}
	}
	
	public String searchBookByTitle(String title) {
		for(MagicalBook book : magicalBooks) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book.getTitle();
			}
		}
		return "Book not Found...!";
	}
}
