package WebExercise;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();

    @Given("user is on homepage")
    public void userIsOnHomepage()
    {
        homePage.verifyUserIsOnHomePage();
    }

    @When("user enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String Username, String Password)
    {
        homePage.enterUsername(Username, Password);
    }

    @And("user clicks on Login")
    public void userClicksOnLogin()
    {
        homePage.clickOnLogin();
    }

    @Then("user should see {string}")
    public void userShouldSee(String ErrorMessage)
    {
        homePage.loginErrorMsg(ErrorMessage);
    }
}
