package com.kuang.springcloud.pojo;


import java.io.Serializable;

public class Dept implements Serializable {

    private  long deptno;//主键
    private String dname;
    //一个服务对应一个数据库 同一个信息可能存在不同的数据库
    private String db_source;

    public  Dept(String dname){
        this.dname = dname;
    }

    public Dept() {
    }

    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
