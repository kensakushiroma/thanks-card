package models;

import play.db.ebean.Model;
import javax.persistence.Entity;

@Entity
public class Member extends Model {
	@Id
	public Integer Member_ID;
	
}
