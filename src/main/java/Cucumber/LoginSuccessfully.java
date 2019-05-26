package Cucumber;

import org.openqa.selenium.By;

import static Cucumber.Utils.assertTextMessage;

public class LoginSuccessfully
{
    LoadProp loadProp=new LoadProp();
    private By _loginSuccessMessage=By.linkText("Log out");

    public void verifyUserSeeLoginSuccessfulMessage()
    {


        assertTextMessage("Log out",_loginSuccessMessage);
    }
}
