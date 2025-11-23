package Project2;

public abstract class Media {
	// properties.
	private String title;
	private int copiesAvailbale;

	// Generate non argument constructor.
	public Media() {
		super();
	}

	// Generate an argument constructor.
	public Media(String title, int copiesAvailbale) {
		super();
		this.title = title;
		this.copiesAvailbale = copiesAvailbale;
	}

	// Generate setters and getters.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopiesAvailbale() {
		return copiesAvailbale;
	}

	public void setCopiesAvailbale(int copiesAvailbale) {
		this.copiesAvailbale = copiesAvailbale;
	}

	public boolean equals(Object o) {// Equals method ( return true if the two names are equal ).
		return this.title == ((Media) o).getTitle();

	}

	public abstract String toString();// Override toString.

}
