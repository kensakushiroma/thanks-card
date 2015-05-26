package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.thankscard.*;



public class ThanksCard extends Controller {

	public static Result index () {
		return ok(thankscard.render());
	}
}