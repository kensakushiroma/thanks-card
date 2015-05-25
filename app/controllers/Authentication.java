package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.authentication.*;



public class Authentication extends Controller {
    public static class Login {
        public String username;
        public String password;


        public String validate() {
            if (authenticate(username, password)) {
                return null;
            }
            return "Invalid username and password";
        }

        private Boolean authenticate(String username, String password) {
            return (username.equals("gongo") && password.equals("pizza"));
        }
    }



    public static Form<Login> loginForm = Form.form(Login.class);

    public static Result index() {
        return ok(index.render(loginForm));
    }

    public static Result authenticate() {
    	Form<Login> form = loginForm.bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Login login = form.get();
            return ok("ようこそ " + login.username + " さん!!");
        }

    }
}