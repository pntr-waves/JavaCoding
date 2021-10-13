package constant;

public enum Gender {
	MALE("Male", "M"), FEMALE("Female", "F");

	private String title;
	private String value;

	Gender(String title, String value) {
		this.setTitle(title);
		this.setValue(value);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
