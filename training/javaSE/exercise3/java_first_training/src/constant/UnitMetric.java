package constant;

public enum UnitMetric {

  CM("cm", 1), INCH("inch", 2.54);

  private String title;
  private double convertValue;

  UnitMetric(String title, double convertValue) {
    this.title = title;
    this.convertValue = convertValue;
  }

  public String getTitle() {
    return this.title;
  }

  public double getConvertValue() {
    return this.convertValue;
  }
}
