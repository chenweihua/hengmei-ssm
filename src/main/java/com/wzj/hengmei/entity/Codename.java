package com.wzj.hengmei.entity;

public class Codename extends CodenameKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.field_explain
     *
     * @mbggenerated
     */
    private String fieldExplain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.disp_order
     *
     * @mbggenerated
     */
    private Integer dispOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.del_flg
     *
     * @mbggenerated
     */
    private String delFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_codename.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.field_explain
     *
     * @return the value of b_codename.field_explain
     *
     * @mbggenerated
     */
    public String getFieldExplain() {
        return fieldExplain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.field_explain
     *
     * @param fieldExplain the value for b_codename.field_explain
     *
     * @mbggenerated
     */
    public void setFieldExplain(String fieldExplain) {
        this.fieldExplain = fieldExplain == null ? null : fieldExplain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.name
     *
     * @return the value of b_codename.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.name
     *
     * @param name the value for b_codename.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.disp_order
     *
     * @return the value of b_codename.disp_order
     *
     * @mbggenerated
     */
    public Integer getDispOrder() {
        return dispOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.disp_order
     *
     * @param dispOrder the value for b_codename.disp_order
     *
     * @mbggenerated
     */
    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.del_flg
     *
     * @return the value of b_codename.del_flg
     *
     * @mbggenerated
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.del_flg
     *
     * @param delFlg the value for b_codename.del_flg
     *
     * @mbggenerated
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_codename.remark
     *
     * @return the value of b_codename.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_codename.remark
     *
     * @param remark the value for b_codename.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}