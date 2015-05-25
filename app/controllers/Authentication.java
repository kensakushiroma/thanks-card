package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.authentication.*;



public class Authentication extends Controller {

	 public static class Login {
	         public String username;
	         public String password;

	 public String validate() {
	        if (authenticate(username, password) == null) {
	        return "Invalid username and password";
	        	}
	        return null;
	 	    }
	 }

	 public static Result login() {
		    return ok(
		        login.render(form(Login.class))
		    );
		}

	 public static Result authenticate() {
		    Form loginForm = form(Login.class).bindFromRequest();
		    if(loginForm.hasErrors()) {
		        return badRequest(login.render(loginForm));
		    } else {
		        session("username", loginForm.get().username);
		        return redirect(
		            routes.Projects.index()
		        );
		    }
		}

	 public static Boolean authenticate(String username, String password) {
		    return find.where()
		        .eq("username", username)
		        .eq("password", password)
		        .findUnique();
		}

}