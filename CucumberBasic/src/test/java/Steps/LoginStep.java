package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("^: I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
    }

    @And("^: I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
    }

    @And("^: I click the login button$")
    public void iClickTheLoginButton() {
    }

    @Then("^: I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
    }


    @And("^: I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
     /* List<List<String>> data=  table.raw();*/

        List<User> users= new ArrayList<User>();
        users= table.asList(User.class);
        for (User user: users
             ) {
            System.out.println("the username is: "+user.username);
            System.out.println("the username is: "+user.password);

        }
    }

    @And("^: I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable{
        System.out.println("username: "+userName);
        System.out.println("password: "+password);

    }


    public class User {

        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
