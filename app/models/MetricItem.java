package models;

public class MetricItem {

	private int weekReference;
	private double expected;
	private double actual;
	
	public MetricItem(int weekReference, double expected, double actual) {
		super();
		this.weekReference = weekReference;
		this.expected = expected;
		this.actual = actual;
	}
	
	public void setWeekReference(int weekReference) {
		this.weekReference = weekReference;
	}
	public int getWeekReference() {
		return weekReference;
	}
	public void setExpected(double expected) {
		this.expected = expected;
	}
	public double getExpected() {
		return expected;
	}
	public void setActual(double actual) {
		this.actual = actual;
	}
	public double getActual() {
		return actual;
	}
	
}
