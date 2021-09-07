package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Enums.UrlEnum;
import Runner.BaseTest;
import Selenium.SeleniumUtils;
import io.cucumber.datatable.DataTable;

public class ValidateEditAndUpdateDataInPreview  extends SeleniumUtils {
	
	@Given("the application URL and browser")
	public void the_application_url_and_browser(DataTable dataTable) {
	  String browser=dataTable.asMaps().get(0).get("browser");
	  String appUrl=UrlEnum.urls.BASE_URL.getLabel();
	  startup(browser,appUrl); 
	}

	@Given("Click on Tab \"Component References")
	public void click_on_tab_component_references() {
	   
	}

	@When("User search {string} in quickfind")
	public void user_search_in_quickfind(String string) {
	
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
	   
	}

	@When("select {string} from the dropdown")
	public void select_from_the_dropdown(String string) {
	
	}

	@When("Click on the run button")
	public void click_on_the_run_button() {
	 
	}

	@When("under the section {string} update the values for all rows in colum {int}")
	public void under_the_section_update_the_values_for_all_rows_in_colum(String string, Integer int1, DataTable dataTable) {
	   
	}

	@Then("Validate the data has been updated")
	public void validate_the_data_has_been_updated() {
	  
	}

}
