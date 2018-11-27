package com.adc.da.elk.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>T_EXCELDATA ExceldataEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-11-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ExceldataEO extends BaseEntity {

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdate;
    private String carbody;
    private String gearbox;
    private String fuelconsumption;
    private String cc;
    private String manufacturerprice;
    private String dealerprice;
    private String caryear;
    private String carname;
    private String carid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>createdate -> createdate</li>
     * <li>carbody -> carbody</li>
     * <li>gearbox -> gearbox</li>
     * <li>fuelconsumption -> fuelconsumption</li>
     * <li>cc -> cc</li>
     * <li>manufacturerprice -> manufacturerprice</li>
     * <li>dealerprice -> dealerprice</li>
     * <li>caryear -> caryear</li>
     * <li>carname -> carname</li>
     * <li>carid -> carid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "createdate": return "createdate";
            case "carbody": return "carbody";
            case "gearbox": return "gearbox";
            case "fuelconsumption": return "fuelconsumption";
            case "cc": return "cc";
            case "manufacturerprice": return "manufacturerprice";
            case "dealerprice": return "dealerprice";
            case "caryear": return "caryear";
            case "carname": return "carname";
            case "carid": return "carid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>createdate -> createdate</li>
     * <li>carbody -> carbody</li>
     * <li>gearbox -> gearbox</li>
     * <li>fuelconsumption -> fuelconsumption</li>
     * <li>cc -> cc</li>
     * <li>manufacturerprice -> manufacturerprice</li>
     * <li>dealerprice -> dealerprice</li>
     * <li>caryear -> caryear</li>
     * <li>carname -> carname</li>
     * <li>carid -> carid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "createdate": return "createdate";
            case "carbody": return "carbody";
            case "gearbox": return "gearbox";
            case "fuelconsumption": return "fuelconsumption";
            case "cc": return "cc";
            case "manufacturerprice": return "manufacturerprice";
            case "dealerprice": return "dealerprice";
            case "caryear": return "caryear";
            case "carname": return "carname";
            case "carid": return "carid";
            default: return null;
        }
    }
    
    /**  **/
    public Date getCreatedate() {
        return this.createdate;
    }

    /**  **/
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**  **/
    public String getCarbody() {
        return this.carbody;
    }

    /**  **/
    public void setCarbody(String carbody) {
        this.carbody = carbody;
    }

    /**  **/
    public String getGearbox() {
        return this.gearbox;
    }

    /**  **/
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    /**  **/
    public String getFuelconsumption() {
        return this.fuelconsumption;
    }

    /**  **/
    public void setFuelconsumption(String fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    /**  **/
    public String getCc() {
        return this.cc;
    }

    /**  **/
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**  **/
    public String getManufacturerprice() {
        return this.manufacturerprice;
    }

    /**  **/
    public void setManufacturerprice(String manufacturerprice) {
        this.manufacturerprice = manufacturerprice;
    }

    /**  **/
    public String getDealerprice() {
        return this.dealerprice;
    }

    /**  **/
    public void setDealerprice(String dealerprice) {
        this.dealerprice = dealerprice;
    }

    /**  **/
    public String getCaryear() {
        return this.caryear;
    }

    /**  **/
    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }

    /**  **/
    public String getCarname() {
        return this.carname;
    }

    /**  **/
    public void setCarname(String carname) {
        this.carname = carname;
    }

    /**  **/
    public String getCarid() {
        return this.carid;
    }

    /**  **/
    public void setCarid(String carid) {
        this.carid = carid;
    }

    public void setId(String s) {
    }
}
