package com.chap02;

public class ConditionalClass {

    private String typename;
    public static String[] javaTypes = new String[8];

    public ConditionalClass() {
        javaTypes[0] = "byte";
        javaTypes[1] = "short";
        javaTypes[2] = "int";
        javaTypes[3] = "long";
        javaTypes[4] = "float";
        javaTypes[5] = "double";
        javaTypes[6] = "boolean";
        javaTypes[7] = "char";
    }

    public static boolean isPrimitive(String value) {

        boolean returnValue = false;

        for (String javaType : javaTypes) {
            if (javaType.equalsIgnoreCase(value)) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    /**
     * @return the typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename the typename to set
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }
}
