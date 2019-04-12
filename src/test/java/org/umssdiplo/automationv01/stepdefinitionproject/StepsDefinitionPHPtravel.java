package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.OnlineStore;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private OnlineStore onlineStore;

    @Given("^'Tienda Online' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        onlineStore = LoadPage.loginPage();
    }

//    @And("^set my credentials on 'Login' page$")
//    public void setMyCredentialsOnLoginPage() throws Throwable {
//        onlineStore.setCredentials();
//    }

    @And("^click 'ver Lista' in 'card'$")
    public void clickVerListaInCard() {
        onlineStore.clickVerLista();
    }

    @And("^click 'anadir Maquinaria' in 'category list'$")
    public void clickAnadirMaquinariaInList() {
        onlineStore.clickAnadirMaquinaria();

    }

    @And("^fill 'datos de Maquinaria' in 'form'$")
    public void fillDatosMaquinariaInForm() {
        onlineStore.fillDatosMaquinaria();
    }

    @And("^click 'eliminar Maquinaria' in 'list'$")
    public void clickEliminarMaquinariaInList() {
        onlineStore.eliminarDatosMaquinaria();
    }

    @Then("^Verify que \"([^\"]*)\" se liste en un card de 'category'$")
    public void verifyQueSeListeEnUnCardDeCategory(String marcaMaquinariaEsperada) throws Throwable {
        String marcaMaquinariaActual = onlineStore.getMarcaInsertada();
        Assert.assertEquals(marcaMaquinariaActual, marcaMaquinariaEsperada);
    }
}
