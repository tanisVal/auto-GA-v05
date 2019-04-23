package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Adidas adidas;
    private String priceTenis;

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

    @And("^select option 'Hombre' on 'Adidas' page$")
    public void selectOptionHombreOnAdidasPage() {
        adidas.hoverOption();
    }

    @And("^select on the column 'Tenis' suboption 'Futbol' on 'Adidas' page$")
    public void selectOnTheColumnTenisSuboptionFutbolOnAdidasPage() {
        adidas.clickOptionFutbol();
    }

    @Then("^verify that title \"([^\"]*)\" is in the list of 'Adidas' page$")
    public void verifyThatTitleIsInTheListOfAdidasPage(String titleProductWaited) throws Throwable {
        String titleProductActual = adidas.getTitleProduct();
        Assert.assertEquals(titleProductActual, titleProductWaited);
    }

    @And("^get first Price \"([^\"]*)\" on list of 'Adidas' page$")
    public void getFirstPriceOnListOfAdidasPage(String arg0) {
        priceTenis = adidas.getPriceFirst();
    }

    @And("^click \"([^\"]*)\" on list of 'Adidas' page$")
    public void clickOnListOfAdidasPage(String arg0) {
        adidas.clickProductList();
    }

    @And("^select of talla on list \"([^\"]*)\" of the form product cart$")
    public void selectOfTallaOnListOfTheFormProduct(String size) {
        adidas.selectListSizeOption(size);
    }

    @And("^click in 'aniadir al carrito' of the form product cart$")
    public void clickInAniadirAlCarritoOfTheFormProductCart() {
        adidas.clickAddCart();
    }

    @Then("^verify that 'cantidad' is the same that \"([^\"]*)\" on the 'cart modal'$")
    public void verifyThatCantidadIsTheSameThatOnTheModalCart(String quantityWaited) {
        String quantityActual = adidas.getQuantityCurrently();
        Assert.assertEquals(quantityActual, quantityWaited);
    }

    @And("^click on 'Ver Carrito link' on the 'cart modal'$")
    public void clickOnVerCarritoLinkOnTheCartModal() {
        adidas.clickLookCartLink();
    }

    @Then("^verify that title product \"([^\"]*)\" is displayed on 'cart show' page$")
    public void verifyThatTitleProductIsDisplayedOnCartShowPage(String titleProductWaited) {
        String titleProductActual = adidas.getTitleProductCartShow();
        Assert.assertEquals(titleProductActual, titleProductWaited);
    }

    @Then("^verify that price partial product is \"([^\"]*)\" on 'cart show' page$")
    public void verifyThatPricePartialProductIsOnCartShowPage(String priceProductPartialWaited) {
        String priceProductPartialCurrently = adidas.getPricePartialProduct();
        Assert.assertEquals(priceProductPartialCurrently, priceProductPartialWaited);
    }

    @Then("^verify that price total product is \"([^\"]*)\" on 'cart show' page$")
    public void verifyThatPriceTotalProductIsOnCartShowPage(String priceProductTotalWaited) {
        String priceProductTotalCurrently = adidas.getPriceTotalProduct();
        Assert.assertEquals(priceProductTotalCurrently, priceProductTotalWaited);
    }

}
