/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javalist.list;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asus1
 */
public class Student {
    public String id;
    public String name;
    public Set courses;
    public Student (String id,String name){
       this.id =id;
       this.name = name;
       this.courses = new HashSet();
    }
}
