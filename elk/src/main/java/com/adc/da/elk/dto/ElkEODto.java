package com.adc.da.elk.dto;

import com.adc.da.excel.annotation.Excel;

/**
 * @program: eikEODto
 * @description: 用于文件导入导出操作
 * @author: 王成信
 * @create: 2018-11-19 16:32
 * @version: 2.0.0
 **/
/*
* 关于orderNum的补充说明，orderNum默认为0，数值越大优先级越低，
* 同一优先级下会按照输入顺序导入excel表格中.
* */
public class ElkEODto {

    @Excel(name="性别", orderNum="2")
    private String tsex;

    @Excel(name="年龄", orderNum="2")
    private Long tage;

    @Excel(name="姓名", orderNum="1")
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

