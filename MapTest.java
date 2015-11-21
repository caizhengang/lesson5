/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javalist.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author asus1
 */
public class MapTest {
    public Map<String,Student>students;
    public MapTest(){
        this.students = new HashMap<String,Student>();
    }
    public void testPut(){
        Scanner console = new Scanner(System.in);
        int i =0;
        while(i<3){
            System.out.println("请输入学生ID:");
            String ID = console.next();
            Student st =students.get(ID);
            if(st == null){
                System.out.println("请输入学生姓名：");
                String name =console.next();
                Student newStudent =new Student(ID,name);
                students.put(ID,newStudent);
                System.out.println("成功添加学生;"+students.get(ID).name);
                i++;
            }else{
                System.out.println("该学生ID已被占用");
                continue;
            }
            
        }
    }
    public void testRemove(){
        Scanner console =new Scanner(System.in);
        while(true){  System.out.println("请输入要删除的学生ID");
            String ID = console.next();
        Student st = students. get(ID);
        if(st == null){
            System.out.println("该ID不存在");
            continue;
        }
        students.remove(ID);
        System.out.println("成功删除学生："+st.name);
        break;
    }
    }

    public static void main(String[] args){
        MapTest mt =new MapTest();
        mt.testPut();
        mt.testRemove();
        
    }
    
}
