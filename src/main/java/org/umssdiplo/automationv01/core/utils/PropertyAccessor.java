package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl";
    private static final String MARCA = "marca";
    private static final String MODELO = "modelo";
    private static final String ANIO = "anio";
    private static final String HORAS_USO = "horas_uso";
    private static final String CAPACIDAD = "capacidad";
    private static final By CAJA = new By.ByCssSelector("mat-option[value='Mecanica']");
    private static final String MOTOR = "motor";
    private static final String TORRE = "torre";
    private static final String PRECIO = "precio";

    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor(){
        try(FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (FileNotFoundException fe){
            throw new RuntimeException(fe);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance(){
        if(PropertyAccessor == null){
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    public int getImplicitTimeWait() {
        return Integer.parseInt(getDataProperty("implicitTimeWait"));
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getExplicitTimeWait() {
        return Integer.parseInt(getDataProperty("explicitTimeWait"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() {
        return getDataProperty(BASE_URL);
    }

    public String getMarca() {
        return getDataProperty(MARCA);
    }

    public String getModelo() {
        return getDataProperty(MODELO);
    }

    public String getAnio() {
        return getDataProperty(ANIO);
    }

    public String getHorasUso() {
        return getDataProperty(HORAS_USO);
    }

    public String getCapacidad() {
        return getDataProperty(CAPACIDAD);
    }

    public By getCaja() {
        return CAJA;
    }

    public String getMotor() {
        return getDataProperty(MOTOR);
    }

    public String getTorre() {
        return getDataProperty(TORRE);
    }

    public String getPrecio() {
        return getDataProperty(PRECIO);
    }
}
