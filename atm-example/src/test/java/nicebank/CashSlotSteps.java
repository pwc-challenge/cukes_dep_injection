package nicebank;

import cucumber.api.java.en.Given;
import org.junit.Assert;

public class CashSlotSteps {

    private KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper){
        this.helper = helper;
    }

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                helper.getCashSlot().getContents());
    }
}
