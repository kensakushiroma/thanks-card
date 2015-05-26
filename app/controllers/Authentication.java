package controllers;

import play.data.Form;
import views.html.thankscard.*;
import play.mvc.*;
import views.html.authentication.*;



public class Authentication extends Controller {

	//ログイン認証
	public static class Login {
        public String username;
        public String password;


        public String validate() {
            if (authenticate(username, password)) {
                return null;
            }
            return "Invalid username and password";
        }

        //ユーザとパスワードの比較
        private Boolean authenticate(String username, String password) {
            return (username.equals("gongo") && password.equals("pizza"));
        }
    }


	//よくわからない
    public static Form<Login> loginForm = Form.form(Login.class);

    public static Result index() {
    	if (session("login") != null) {
           return ok("あなたは既に " + session("login") + "としてログインしています");
        }
        return ok(index.render(loginForm));
    }

    public static Result authenticate() {
    	Form<Login> form = loginForm.bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Login login = form.get();
            session("login", login.username);
         // return ok("ようこそ " + login.username + " さん!!");
            return ok(thankscard.render());

        }

    }
//ログアウト処理
    public static Result logout() {
        session().clear();
        return redirect(routes.Authentication.index());
    }
}