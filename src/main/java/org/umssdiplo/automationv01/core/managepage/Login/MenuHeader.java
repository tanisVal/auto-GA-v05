package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class MenuHeader extends BasePage {

    @FindBy(css = ".inner___3Nvdx.main-menu___GkftT > div")
    private WebElement menuOption;

    Actions action = new Actions(webDriver);


    public void hoverOption() {
        action.moveToElement(menuOption).build().perform();
    }


}
