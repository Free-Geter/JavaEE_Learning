package com.homework;

public class extends_sample extends javaBean_sample{
    private String school;
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    void printinfo(){
        System.out.println(this.getSex());
        System.out.println(this.getAge());
        System.out.println(this.getName());
        System.out.println(this.getSchool());
    }

}
