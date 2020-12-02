package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public  boolean addDept(Dept dept);

    public  Dept queryById(long id);

    public List<Dept> queryAll();

}
