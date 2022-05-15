/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composation;

/**
 *
 * @author dell
 */
class Hardware {
    private int Ram;
    private int Hhd;
    private String ScreenCard_size;
    private String Greneration;
    private int SSD;

    @Override
    public String toString() {
        return "Hardware{" + "Ram=" + Ram + ", Hhd=" + Hhd + ", ScreenCard_size=" + ScreenCard_size + ", Greneration=" + Greneration + ", SSD=" + SSD + '}';
    }

    public Hardware(int Ram, int Hhd, String ScreenCard_size, String Greneration, int SSD) {
        this.Ram = Ram;
        this.Hhd = Hhd;
        this.ScreenCard_size = ScreenCard_size;
        this.Greneration = Greneration;
        this.SSD = SSD;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public int getHhd() {
        return Hhd;
    }

    public void setHhd(int Hhd) {
        this.Hhd = Hhd;
    }

    public String getScreenCard_size() {
        return ScreenCard_size;
    }

    public void setScreenCard_size(String ScreenCard_size) {
        this.ScreenCard_size = ScreenCard_size;
    }

    public String getGreneration() {
        return Greneration;
    }

    public void setGreneration(String Greneration) {
        this.Greneration = Greneration;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }
    
}
