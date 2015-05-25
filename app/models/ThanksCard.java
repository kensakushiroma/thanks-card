package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

public class ThanksCard extends Model {

	@Id
	public Integer ThanksCard_ID;
	public Integer CardMaker_ID;
	public java.sql.Date Transmission_date;
	public java.sql.Date Help_date;
	public Integer Helpcategory_ID;
	public String Help;
	public String Thanks;
	public Integer Address_ID;

}
