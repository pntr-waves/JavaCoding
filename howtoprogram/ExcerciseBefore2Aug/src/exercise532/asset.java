package exercise532;

public enum asset {
	
	HOUSE("house"), FOOD("food"), EDUCATION("education");
	
	private String title;
	
	asset(String title){
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
