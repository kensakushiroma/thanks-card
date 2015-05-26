package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ThanksCard extends Model {

	@Id
	public Integer ThanksCard_ID;
	public Integer CardMaker_ID;
	public String Maker_post;
	public String Maker_name;
	public java.sql.Date Transmission_date;
	public java.sql.Date Help_date;
	public Integer Helpcategory_ID;
	public String Help;
	public String Thanks;
	public Integer Address_ID;
	public String Address_post;
	public String Address_name;

}
