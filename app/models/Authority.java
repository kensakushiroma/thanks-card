package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Authority extends Model {

	@Id
	public Integer Authority_ID;
	public String Authority;

}
