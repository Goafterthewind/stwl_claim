package com.adc.da.elk.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>T_ELK ElkEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-11-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ElkEO extends BaseEntity {

    private String tsex;
    private Long tage;
    private String tname;
    private String tid;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>tsex -> tsex</li>
     * <li>tage -> tage</li>
     * <li>tname -> tname</li>
     * <li>tid -> tid</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "tsex": return "tsex";
            case "tage": return "tage";
            case "tname": return "tname";
            case "tid": return "tid";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>tsex -> tsex</li>
     * <li>tage -> tage</li>
     * <li>tname -> tname</li>
     * <li>tid -> tid</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "tsex": return "tsex";
            case "tage": return "tage";
            case "tname": return "tname";
            case "tid": return "tid";
            default: return null;
        }
    }
    
    /**  **/
    public String getTsex() {
        return this.tsex;
    }

    /**  **/
    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    /**  **/
    public Long getTage() {
        return this.tage;
    }

    /**  **/
    public void setTage(Long tage) {
        this.tage = tage;
    }

    /**  **/
    public String getTname() {
        return this.tname;
    }

    /**  **/
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**  **/
    public String getTid() {
        return this.tid;
    }

    /**  **/
    public void setTid(String tid) {
        this.tid = tid;
    }

}
