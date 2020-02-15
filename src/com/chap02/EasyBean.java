package com.chap02;

public class EasyBean implements java.io.Serializable {

    private String fieldValue;

    private Integer numA;

    private Integer numB;

    private String matheval;

    private Integer result;


    public String getFieldValue() {
        return fieldValue;
    }


    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Integer getNumA() {
        return numA;
    }

    public void setNumA(Integer numA) {
        this.numA = numA;
    }

    public Integer getNumB() {
        return numB;
    }

    public void setNumB(Integer numB) {
        this.numB = numB;
    }

    public String getMatheval() {
        return matheval;
    }

    public void setMatheval(String matheval) {
        this.matheval = matheval;
    }

    public Integer getResult() {

        if("add".equals(matheval))
            result = numA + numB;
        if ("multiply".equals(matheval))
            result = numA * numB;

        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}