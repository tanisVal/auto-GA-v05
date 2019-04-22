package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Login.MenuHeader;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Adidas adidas;
    private MenuHeader menu;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() {
        adidas = LoadPage.adidasPage();
    }

    @And("^select option 'Tenis' on 'Adidas' page$")
    public void selectOptionTenisOnAdidasPage() {
        menu.hoverOption();
    }
}
