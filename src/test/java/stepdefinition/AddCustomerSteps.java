package stepdefinition;

import java.util.Map;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerPage;

public class AddCustomerSteps {

	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
		AddCustomerPage addcust = new AddCustomerPage();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust.getRdo_done().click();
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAdress"));
		addcust.getTxt_adress().sendKeys(customerDetailsMap.get("adress"));
		addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNum"));

	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomerPage addcust = new AddCustomerPage();
		addcust.getBtn_submit().click();
	}

}
