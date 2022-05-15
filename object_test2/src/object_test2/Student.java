/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_test2;

/**
 *
 * @author dell
 */
public class Student {
    
        private String name;
        private String aparment;
        private int level;
        private double Stu_num;
        private int number;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the aparment
     */
    public String getAparment() {
        return aparment;
    }

    /**
     * @param aparment the aparment to set
     */
    public void setAparment(String aparment) {
        this.aparment = aparment;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        if(level ==0){
            System.out.println("u cant study right now");
        }
          
            else {
             this.level=level;
    }
    }

    /**
     * @return the Stu_num
     */
    public double getStu_num() {
        return Stu_num;
    }

    /**
     * @param Stu_num the Stu_num to set
     */
    public void setStu_num(double Stu_num) {
        this.Stu_num = Stu_num;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

  

    
    
}


