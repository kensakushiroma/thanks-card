package models;

import play.db.ebean.Model;
import javax.persistence.Entity;

@Entity
public class Member extends Model {
	@Member_ID
	public Integer Member_ID;
	
}
