package staging_area.magical_library;

public class HogwartsSchool {

	public static void main(String[] args) {
		
		SpellBook spellBook = new SpellBook("The Standard Book of Spells", "Viany B");
		PotionBook potionBook = new PotionBook("Book of Potions", "Jaishi R");
		DarkArtsBook darkArtsBook = new DarkArtsBook("Secrets Of Dark", "Vinshu");
		
		Library library = new Library();
		library.addBook(spellBook);
		library.addBook(potionBook);
		library.addBook(darkArtsBook);
		
		library.listAllBooks();
		
		String searchResult = library.searchBookByTitle("Secrets Of Dark");
		System.out.println(searchResult);
		
		LibraryUser student = new LibraryUser("Ron Weasley", Role.STUDENT);
		LibraryUser professor = new LibraryUser("Dumbledore", Role.PROFESSOR);
		
		student.borrowBook(darkArtsBook);
		professor.borrowBook(darkArtsBook);
		
	}
}
