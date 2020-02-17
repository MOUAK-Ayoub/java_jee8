package com.chap03;

import javax.enterprise.context.*;
import javax.faces.application.*;
import javax.faces.context.*;
import javax.faces.model.*;
import javax.inject.*;
import java.io.*;
import java.util.*;

@Named
@SessionScoped
public class CalculationController implements Serializable {

    private int num1;
    private int num2;
    private Integer result;
    private String calculationType;
    private static final String ADDITION = "Addition";
    private static final String SUBTRACTION = "Subtraction";
    private static final String MULTIPLICATION = "Multiplication";
    private static final String DIVISION = "Division";
    List<SelectItem> calculationList;

    /**
     * Creates a new instance of CalculationController
     */
    public CalculationController() {
// Initialize variables
        num1 = 0;
        num2 = 0;
        result = 0;
        calculationType = null;
// Initialize the list of values for the SelectOneMenu
        populateCalculationList();
        System.out.println("initialized the bean!");
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * @return the calculationType
     */
    public String getCalculationType() {
        return calculationType;
    }

    /**
     * @param calculationType the calculationType to set
     */
    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public List<SelectItem> getCalculationList() {
        return calculationList;
    }

    private void populateCalculationList() {
        calculationList = new ArrayList<>();
        calculationList.add(new SelectItem(ADDITION));
        calculationList.add(new SelectItem(SUBTRACTION));
        calculationList.add(new SelectItem(MULTIPLICATION));
        calculationList.add(new SelectItem(DIVISION));
    }

    public void performCalculation() {
        switch (getCalculationType()) {
            case ADDITION:
                setResult(num1 + num2);
                break;
            case SUBTRACTION:
                setResult(num1 - num2);
                break;
            case MULTIPLICATION:
                setResult(num1 * num2);
                break;
            case DIVISION:
                try {
                    setResult(num1 / num2);
                } catch (Exception ex) {
                    setResult(null);
                    FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Invalid Calculation", "Invalid Calculation");
                    FacesContext.getCurrentInstance().addMessage(null, facesMsg);
                }
                break;
            default:
                break;
        }
    }
}