package staging_area.magical_library;

abstract class MagicalBook implements Readable{
	
	private String title;
	private String author;
	private String subject;
	private boolean isRestricted;
	
	public MagicalBook(String title, String author, String subject, boolean isRestricted) {
		super();
		this.title = title;
		this.author = author;
		this.subject = subject;
		this.isRestricted = isRestricted;
	}

	public void openBook() {
		System.out.println("Book is opened");
	}
	
	public void closeBook() {
		System.out.println("Book is closed");
	};
	
	public abstract void useBook();

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isRestricted() {
		return isRestricted;
	}
	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}
	
}

