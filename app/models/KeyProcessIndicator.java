package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class KeyProcessIndicator extends Model{

	private String slug;
	public KeyProcessIndicator(String slug) {
		this.slug = slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getSlug() {
		return slug;
	}
}
