package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class ThanksCard extends Model {

	@Id
	public Integer ThanksCard_ID;
	public Integer CardMaker_ID;

	public Integer Helpcategory_ID;
	public String Help;
	public String Thanks;
	public Integer Address_ID;

}
