package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class KeyProcessIndicator extends Model{

	private String slug;
	private double limitPercentage; 
	private boolean trendingUp;
	
	public KeyProcessIndicator(String slug, double limitPercentage,
			boolean trendingUp) {
		super();
		this.slug = slug;
		this.limitPercentage = limitPercentage;
		this.trendingUp = trendingUp;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getSlug() {
		return slug;
	}
	public void setTrendingUp(boolean trendingUp) {
		this.trendingUp = trendingUp;
	}
	public boolean isTrendingUp() {
		return trendingUp;
	}
	public void setLimitPercentage(double limitPercentage) {
		this.limitPercentage = limitPercentage;
	}
	public double getLimitPercentage() {
		return limitPercentage;
	}
}
