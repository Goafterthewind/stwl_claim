package com.adc.da.elk.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>T_ELK ElkEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-11-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class ElkEOPage extends BasePage {

    private String tsex;
    private String tsexOperator = "=";
    private String tage;
    private String tageOperator = "=";
    private String tname;
    private String tnameOperator = "=";
    private String tid;
    private String tidOperator = "=";

    public String getTsex() {
        return this.tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTsexOperator() {
        return this.tsexOperator;
    }

    public void setTsexOperator(String tsexOperator) {
        this.tsexOperator = tsexOperator;
    }

    public String getTage() {
        return this.tage;
    }

    public void setTage(String tage) {
        this.tage = tage;
    }

    public String getTageOperator() {
        return this.tageOperator;
    }

    public void setTageOperator(String tageOperator) {
        this.tageOperator = tageOperator;
    }

    public String getTname() {
        return this.tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTnameOperator() {
        return this.tnameOperator;
    }

    public void setTnameOperator(String tnameOperator) {
        this.tnameOperator = tnameOperator;
    }

    public String getTid() {
        return this.tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTidOperator() {
        return this.tidOperator;
    }

    public void setTidOperator(String tidOperator) {
        this.tidOperator = tidOperator;
    }

}
