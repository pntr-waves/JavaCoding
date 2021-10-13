package truong.exercise1000.e823.constant;

public enum Gender {
	MALE(1, "Male"), FEMALE(2, "Female");

	private int value;
	private String name;

	Gender(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
