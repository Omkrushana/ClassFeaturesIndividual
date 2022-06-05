package TestCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

	@Given("^Browser is opned$")
	public void openFacebookPage() {
		System.out.println("executed code for opening browser");
	}

	@When("^Enter correct credentials & clicked login button$")
	public void enterCorrectCredentialsNNavigate() {
		System.out.println("executed code for entering correct credentials");
	}

	@Then("^Application should be navigated to home page$")
	public void verify() {
		System.out.println("executed code for navigating to home page");
	}

}
