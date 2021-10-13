package constant;

public enum Regex {

	NUMBER("^\\d+"), MEMERSHIPNAME("(\\s*[a-zA-Z]+\\s*)(\\s*\\w+\\s*)"), DATETIME("(\\d{4})-(\\d{2})-(\\d{2})"),
	EMAIL("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$"), ADDRESS("\\w{1,}"),
	PHONENUMBER("^\\d{10}$");

	private String regex;

	Regex(String regex) {
		this.setRegex(regex);
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}
}
