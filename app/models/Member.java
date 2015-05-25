package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member extends Model {
	@Id
	public Integer Member_ID;
	public Integer Post_ID;
	public String Member_name;
	public String Logint_password;
	public Integer Authority_ID;

}
