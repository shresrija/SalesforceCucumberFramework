import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

/**
 * Created by Owner on 24/06/2015.
 */
public class StefDef {

    @Given("^I am on Home Page$")
    public void I_am_on_Home_Page() throws Throwable {
    }

    @When("^I select Login$")
    public void I_select_Login() throws Throwable {
    }

    @Then("^I should visit to Login Page$")
    public void I_should_visit_to_Login_Page() throws Throwable {
    }

    @Given("^I am on Login page$")
    public void I_am_on_Login_page() throws Throwable {
    }

    @When("^I enter the usename as 'shresrija@gmail.com'$")
    public void I_enter_the_usename_as_shresrija_gmail_com() throws Throwable {
    }

    @And("^I enter the password as 'cukes(\\d+)'$")
    public void I_enter_the_password_as_cukes_(int arg1) throws Throwable {
    }

    @And("^I select 'Log in to Salesforce'$")
    public void I_select_Log_in_to_Salesforce() throws Throwable {
    }

    @Then("^I should visit to 'Getting Started' page$")
    public void I_should_visit_to_Getting_Started_page() throws Throwable {
    }
}
