package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Adidas extends BasePage {
    @FindBy(css = ".inner___3Nvdx.main-menu___GkftT > div")
    private WebElement menuOption;

//    @FindBy(name = "password")
//    private WebElement passwordInputField;
//
//    @FindBy(css = ".btn-primary.btn-block")
//    private WebElement loginBtn;
//
//    @FindBy(partialLinkText = "")
//    private WebElement testing;

    public void setCredentials() {
//        String username = PropertyAccessor.getInstance().getUser();
//        String password = PropertyAccessor.getInstance().getPassword();
//        CommonEvents.setInputField(usernameInputField, username);
//        CommonEvents.setInputField(passwordInputField, password);
//        CommonEvents.clickButton(loginBtn);
    }

    public void selectOptionTenis() {

    }
}
