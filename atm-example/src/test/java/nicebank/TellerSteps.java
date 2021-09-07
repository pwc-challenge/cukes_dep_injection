package nicebank;

import cucumber.api.java.en.When;

public class TellerSteps {

    private KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper){
        this.helper = helper;
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
}
