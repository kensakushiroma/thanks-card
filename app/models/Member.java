package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member extends Model {
	@Id
	public Integer Member_ID;
	
}
