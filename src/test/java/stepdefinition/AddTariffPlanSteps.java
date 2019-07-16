package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepository.AddTariffPlanPage;

public class AddTariffPlanSteps {

	@When("the user fill in valid tariff plan details {string}, {string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String monthRent, String freeLocal, String freeInter,
			String freeSMS, String localCharges, String InterCharges, String smsCharges) {

		AddTariffPlanPage addtarif = new AddTariffPlanPage();

		addtarif.getMonthRent().sendKeys(monthRent);
		addtarif.getFreeloc_min().sendKeys(freeLocal);
		addtarif.getFreeinter_min().sendKeys(freeInter);
		addtarif.getFreesms().sendKeys(freeSMS);
		addtarif.getLocalmin_char().sendKeys(localCharges);
		addtarif.getInt_char().sendKeys(InterCharges);
		addtarif.getSms_char().sendKeys(smsCharges);

	}

	@When("the user clicks submit button in add tariff plan page")
	public void the_user_clicks_submit_button_in_add_tariff_plan_page() {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		addtarif.getBtn_submit().click();
	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		Assert.assertTrue(addtarif.getSucessmsg().isDisplayed());
	}
}
