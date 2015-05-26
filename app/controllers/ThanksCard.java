package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.authentication.*;



public class ThanksCard extends Controller {

	public static Result index () {
		return ok(thankscard.render());
	}
}