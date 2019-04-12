package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class OnlineStore extends BasePage {
    @FindBy(css = "mat-card:nth-of-type(1) button")
    private WebElement verListaBtn;

    @FindBy(css = "div.main-container > button")
    private WebElement anadirMaquinariaBtn;

//    @FindBy(formcontrolname = "marca")
    @FindBy(css = "input[formcontrolname='marca']")
    private WebElement marcaInputField;

//    @FindBy(name = "modelo")
    @FindBy(css = "input[formcontrolname='modelo']")
    private WebElement modeloInputField;

//    @FindBy(name = "anio")
    @FindBy(css = "input[formcontrolname='anio']")
    private WebElement anioInputField;

//    @FindBy(name = "horas_uso")
    @FindBy(css = "input[formcontrolname='horas_uso']")
    private WebElement horasUsoInputField;

//    @FindBy(name = "capacidad")
    @FindBy(css = "input[formcontrolname='capacidad']")
    private WebElement capacidadInputField;

//    @FindBy(name = "caja")
    @FindBy(css = "mat-select")
    private WebElement cajaSelect; // Objeto select

//    @FindBy(name = "motor")
    @FindBy(css = "input[formcontrolname='motor']")
    private WebElement motorInputField;

//    @FindBy(name = "torre")
    @FindBy(css = "input[formcontrolname='torre']")
    private WebElement torreInputField;

//    @FindBy(name = "precio")
    @FindBy(css = "input[formcontrolname='precio']")
    private WebElement precioInputField;

//    @FindBy(css = "button:contains('Subir imagen')")
//    private WebElement subirImagenBtn;

    @FindBy(css = "input[type='file']")
    private WebElement imageInputField;

    @FindBy(css = "button.mat-button[type='submit']")
    private WebElement aceptarBtn;

    @FindBy(css = "div.main-container mat-card mat-card-header button")
    private WebElement eliminarMaquinariaBtn;

    public void clickVerLista() {
        CommonEvents.clickButton(verListaBtn);
    }

    public void clickAnadirMaquinaria() {
        CommonEvents.clickButton(anadirMaquinariaBtn);
    }

    public void fillDatosMaquinaria() {
        String marca = PropertyAccessor.getInstance().getMarca();
        String modelo = PropertyAccessor.getInstance().getModelo();
        String anio = PropertyAccessor.getInstance().getAnio();
        String horas_uso = PropertyAccessor.getInstance().getHorasUso();
        String capacidad = PropertyAccessor.getInstance().getCapacidad();
        By caja = PropertyAccessor.getInstance().getCaja();
        String motor = PropertyAccessor.getInstance().getMotor();
        String torre = PropertyAccessor.getInstance().getTorre();
        String precio = PropertyAccessor.getInstance().getPrecio();
        String image = "C:\\Users\\Tania\\Desktop\\tractor846.jpg";

        CommonEvents.setInputField(marcaInputField, marca);
        CommonEvents.setInputField(modeloInputField, modelo);
        CommonEvents.setInputField(anioInputField, anio);
        CommonEvents.setInputField(horasUsoInputField, horas_uso);
        CommonEvents.setInputField(capacidadInputField, capacidad);
        CommonEvents.selectDropDown(cajaSelect, caja);
        CommonEvents.setInputField(motorInputField, motor);
        CommonEvents.setInputField(torreInputField, torre);
        CommonEvents.setInputField(precioInputField, precio);
        CommonEvents.setInputField(imageInputField, image);
//        CommonEvents.jsClickElement(imageInputField);

        CommonEvents.clickButton(aceptarBtn);
    }

    public String getMarcaInsertada() {
        String marca = PropertyAccessor.getInstance().getMarca();
        return marca;
    }

    public void eliminarDatosMaquinaria() {
        CommonEvents.clickButton(eliminarMaquinariaBtn);
    }



}
