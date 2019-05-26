package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    HomePage homePage= new HomePage();

    LoginPage loginPage=new LoginPage();

     @Given("^user is on hompage$")
    public void userIsOnHompage() {
        homePage.userIsOnHomepage();
    }

    @When("^user click on \"([^\"]*)\" link$")
    public void userClickOnLink(String link) throws Throwable
    {
        homePage.clcikOnCatogaryLink(link);
     }

    @Then("^user should be able to navigate to all \"([^\"]*)\"   Successfully$")
    public void userShouldBeAbleToNavigateToAllSuccessfully(String catogary) throws Throwable
    {

        Utils.assertURLtext(catogary);

    }



    @Given("^user click on loginpage$")
    public void userClickOnLoginpage() {
        homePage.clickOnLogin();
    }


    @When("^user enter  invalid \"([^\"]*)\" and/or \"([^\"]*)\"$")
    public void userEnterInvalidAndOr(String emailid, String password) throws Throwable {
        loginPage.userEnterLoginDetail(emailid,password);
             }

    @Then("^user should able to see\"([^\"]*)\"$")
    public void userShouldAbleToSee(String errormessage) throws Throwable {
        boolean b;
      if (errormessage.contains("No customer account found")||errormessage.contains("The credentials provided are incorrect"))
      {
          b=true;
      }
      else
      {
          b=false;
      }

      Assert.assertTrue(b);
    }

}
