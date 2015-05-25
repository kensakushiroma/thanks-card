package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Read extends Model {

	@Id
	public Integer Read_ID;
	public String Read;

}
