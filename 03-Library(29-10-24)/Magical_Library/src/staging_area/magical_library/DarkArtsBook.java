package staging_area.magical_library;

public class DarkArtsBook extends MagicalBook{

	public DarkArtsBook(String title, String author) {
		super(title, author, "Dark Arts Magic", true);
	}
	
	@Override
	public void useBook() {
		System.out.println("Using the DarkArtsBook....");
	}
	
	@Override
	public void summarizeContent() {
		System.out.println("The dark magic you have never seen before be carefull...!");
	}
	
	@Override
	public void bookmarkPage(int pageNumber) {
		System.out.println("The required dark magic is at " + pageNumber + " page in DarkArtsBook.");
	}
}
