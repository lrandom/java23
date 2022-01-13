package com.niit.java23;

import com.niit.java23.domains.User;

import java.util.ArrayList;

public interface ICRUD<T>{
    public ArrayList<T> getList();
    public void addObject(T user);
    public void updateObject(T user);
    public void deleteObject(T user);
}
