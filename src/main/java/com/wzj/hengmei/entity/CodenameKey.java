package com.wzj.hengmei.entity;

public class CodenameKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.field_name
     *
     * @mbggenerated
     */
    private String fieldName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.field_name
     *
     * @return the value of b_codename.field_name
     *
     * @mbggenerated
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.field_name
     *
     * @param fieldName the value for b_codename.field_name
     *
     * @mbggenerated
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.code
     *
     * @return the value of b_codename.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.code
     *
     * @param code the value for b_codename.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}