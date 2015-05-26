package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.management.*;



public class Management extends Controller {

    public static Result index() {
        return ok(management.render());
    }
}