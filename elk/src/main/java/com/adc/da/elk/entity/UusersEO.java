package com.adc.da.elk.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>UUSERS UusersEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-11-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class UusersEO extends BaseEntity {

    private String uupassword;
    private String uuname;
    private String uuid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>uupassword -> uupassword</li>
     * <li>uuname -> uuname</li>
     * <li>uuid -> uuid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "uupassword": return "uupassword";
            case "uuname": return "uuname";
            case "uuid": return "uuid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>uupassword -> uupassword</li>
     * <li>uuname -> uuname</li>
     * <li>uuid -> uuid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "uupassword": return "uupassword";
            case "uuname": return "uuname";
            case "uuid": return "uuid";
            default: return null;
        }
    }
    
    /**  **/
    public String getUupassword() {
        return this.uupassword;
    }

    /**  **/
    public void setUupassword(String uupassword) {
        this.uupassword = uupassword;
    }

    /**  **/
    public String getUuname() {
        return this.uuname;
    }

    /**  **/
    public void setUuname(String uuname) {
        this.uuname = uuname;
    }

    /**  **/
    public String getUuid() {
        return this.uuid;
    }

    /**  **/
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
