package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class KPIData extends Model{

	
	
	private int weekReference;
	private double expected;
	private double actual;
	
	 @ManyToOne
	 public KeyProcessIndicator kpi;

	
	public KPIData(KeyProcessIndicator kpi, int weekReference, double expected, double actual) {
		super();
		this.kpi = kpi;
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
