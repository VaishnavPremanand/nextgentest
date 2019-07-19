package Loginfunction;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userlogin {
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
		System.out.println("user must be registered");

	}

	@When("^user logs in with below credentials$")
	public void user_logs_in_with_below_credentials(DataTable arg1) throws Throwable {
		List<Map<String,String>> cred=arg1.asMaps(String.class,String.class);
		for (int i=0;i<cred.size();i++){
		System.out.println(cred.get(i).get("username")+"\t"+cred.get(i).get("password"));
	}
	}
	@Then("^User is directed to the home page$")
	public void user_is_directed_to_the_home_page() throws Throwable {
		System.out.println("User is directed to the home page");
	}
}
