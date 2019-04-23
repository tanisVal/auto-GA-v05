package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {

    @FindBy(css = "a[href='/hombre']")
    private WebElement menuOption;

    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement futbolOption;

    @FindBy(css = "div[title='Calzado de Fútbol X 18.3 TF']")
    private WebElement titleProduct;

    @FindBy(css = "div[class*='gl-dropdown']")
    private WebElement listOfSizes;

    @FindBy(css = "button[aria-label='Añadir al carrito']")
    private WebElement addCart;

    @FindBy(css = "span[data-auto-id='add-to-bag-product-info-qty']")
    private WebElement quantityModal;

    @FindBy(css = "a[data-auto-id='view-bag-desktop']")
    private WebElement lookCartLink;

    @FindBy(css = "a[title='Calzado de Fútbol X 18.3 TF']")
    private WebElement titleProductCartShow;

    @FindBy(css = "div[data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement pricePartialProductCartShow;

    @FindBy(css = "div[data-ci-test-id='orderTotalCartValue']")
    private WebElement priceTotalProductCartShow;

    public void hoverOption() {
        Actions action = new Actions(webDriver);
        action.moveToElement(menuOption).perform();
    }

    public void clickOptionFutbol() {
        CommonEvents.clickButton(futbolOption);
    }

    public String getTitleProduct() {
        String titleProductActual = CommonEvents.getTextContent(titleProduct);
        return titleProductActual;
    }

    public String getPriceFirst() {
        WebElement priceProduct = titleProduct.findElement(By.xpath("following-sibling::div//span[contains(@class,'gl-price__value--sale')]"));
        return CommonEvents.getTextContent(priceProduct);
    }

    public void clickProductList() {
        CommonEvents.clickButton(titleProduct);
    }

    public void selectListSizeOption(String size) {
        By optionListSelect = new By.ByCssSelector("button[title='" + size + "']");
        CommonEvents.selectDropDown(listOfSizes, optionListSelect);
    }

    public void clickAddCart() {
        CommonEvents.clickButton(addCart);
    }

    public String getQuantityCurrently() {
        CommonEvents.forceWait(1000);
        String quantity = CommonEvents.getTextContent(quantityModal);
        return quantity;
    }

    public void clickLookCartLink() {
        CommonEvents.clickButton(lookCartLink);
    }

    public String getTitleProductCartShow() {
        String titleProductDisplay = CommonEvents.getTextContent(titleProductCartShow);
        return titleProductDisplay.toUpperCase();
    }

    public String getPricePartialProduct() {
        String pricePartialProduct = CommonEvents.getTextContent(pricePartialProductCartShow);
        return pricePartialProduct;
    }

    public String getPriceTotalProduct() {
        String priceTotalProduct = CommonEvents.getTextContent(priceTotalProductCartShow);
        return priceTotalProduct;
    }
}
