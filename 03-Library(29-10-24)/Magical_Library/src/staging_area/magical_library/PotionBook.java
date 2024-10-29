package staging_area.magical_library;

public class PotionBook extends MagicalBook{

	public PotionBook(String title, String author) {
		super(title, author, "Potions", false);
	}
	
	@Override
	public void useBook() {
		System.out.println("Using the PotionBook....");
	}
	
	@Override
	public void summarizeContent() {
		System.out.println("This book contains various number of potion recepies for magic...!");
	}
	
	@Override
	public void bookmarkPage(int pageNumber) {
		System.out.println("The required potion reciepe is at " + pageNumber + " page in PotionBook.");
	}
}
