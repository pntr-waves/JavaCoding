package tools;

import constant.UnitMetric;

public interface Tools {
  default double floor(double num) {
    return Math.floor(num * 1000) / 1000;
  }
  default double convertArea(double area, UnitMetric unit) {
    return area * unit.getConvertValue() * unit.getConvertValue();
  }
}
