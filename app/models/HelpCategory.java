package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class HelpCategory extends Model {

	@Id
	public Integer HelpCategory_ID;
	public String HelpCategory;

}
