package staging_area.magical_library;

public class LibraryUser {
	private String name;
	private Role role;
		
	public LibraryUser(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public void borrowBook(MagicalBook book) {
		if(book.isRestricted() && role == Role.STUDENT) {
			System.out.println(name + " you are not allowed to borrow this " + book.getTitle() + " book.");
		}
		else {
			System.out.println(name + " has borrowed the " + book.getTitle() + " book.");
			book.openBook();
		}
	}
}
