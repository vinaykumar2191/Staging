package staging_area.magical_library;

public class SpellBook extends MagicalBook{
	
	public SpellBook(String title, String author) {
		super(title, author, "Spells", false);
	}
	
	@Override
	public void useBook() {
		System.out.println("Using the SpellBook....");
	}
	
	@Override
	public void summarizeContent() {
		System.out.println("This book contains various number of spells for magic...!");
	}
	
	@Override
	public void bookmarkPage(int pageNumber) {
		System.out.println("The required spell is at " + pageNumber + " page in SpellBook.");
	}
}
