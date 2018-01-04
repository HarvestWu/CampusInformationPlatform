package org.wing.entity;

import java.util.Date;

/**
 * Create by ~JH~ on 2018/1/3
 * 计算机二级分数
 */
public class ComputerGradeTwo {
    private Integer id;
    private String KC;//批次
    private String ZKZH;//准考证号
    private String XM;//姓名
    private Integer XB;//性别 男1 女2
    private String SFZH;//身份证号
    private String XH;//学号
    private String XQ;//校区
    private String JBYYIM;//考试次数
    private String JBYYMC;//考试科目
    private Integer ZZBSCJ;//笔试成绩
    private Integer ZZSJCJ;//上机成绩
    private String ZSBH;//证书编号
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKC() {
        return KC;
    }

    public void setKC(String KC) {
        this.KC = KC;
    }

    public String getZKZH() {
        return ZKZH;
    }

    public void setZKZH(String ZKZH) {
        this.ZKZH = ZKZH;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public Integer getXB() {
        return XB;
    }

    public void setXB(Integer XB) {
        this.XB = XB;
    }

    public String getSFZH() {
        return SFZH;
    }

    public void setSFZH(String SFZH) {
        this.SFZH = SFZH;
    }

    public String getXH() {
        return XH;
    }

    public void setXH(String XH) {
        this.XH = XH;
    }

    public String getXQ() {
        return XQ;
    }

    public void setXQ(String XQ) {
        this.XQ = XQ;
    }

    public String getJBYYIM() {
        return JBYYIM;
    }

    public void setJBYYIM(String JBYYIM) {
        this.JBYYIM = JBYYIM;
    }

    public String getJBYYMC() {
        return JBYYMC;
    }

    public void setJBYYMC(String JBYYMC) {
        this.JBYYMC = JBYYMC;
    }

    public Integer getZZBSCJ() {
        return ZZBSCJ;
    }

    public void setZZBSCJ(Integer ZZBSCJ) {
        this.ZZBSCJ = ZZBSCJ;
    }

    public Integer getZZSJCJ() {
        return ZZSJCJ;
    }

    public void setZZSJCJ(Integer ZZSJCJ) {
        this.ZZSJCJ = ZZSJCJ;
    }

    public String getZSBH() {
        return ZSBH;
    }

    public void setZSBH(String ZSBH) {
        this.ZSBH = ZSBH;
    }
}
