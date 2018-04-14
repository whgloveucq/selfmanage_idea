package com.whg.vo;

import java.io.Serializable;

public class Emp implements Serializable {
private String ename ="xyzf";
    private String eno ="xy";

    private String eno2 ="xydd";

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEno2() {
        return eno2;
    }

    public void setEno2(String eno2) {
        this.eno2 = eno2;
    }
}
