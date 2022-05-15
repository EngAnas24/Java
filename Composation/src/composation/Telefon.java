/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composation;


class Telefon {
    private String name;
    private int Number;
    private String Oraginzation;
    private Hardware hardware;

    Telefon(String anas, int i, String software, Hardware hardware) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    @Override
    public String toString() {
        return "Telefon{" + "name=" + name + ", Number=" + Number + ", Oraginzation=" + Oraginzation + ", hardware=" + hardware + '}';
    }

  

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getOraginzation() {
        return Oraginzation;
    }

    public void setOraginzation(String Oraginzation) {
        this.Oraginzation = Oraginzation;
    }

    public Telefon(String name, int Number, String Oraginzation,Hardware hardware) {
        this.name = name;
        this.Number = Number;
        this.Oraginzation = Oraginzation;
        this.hardware = hardware;
    }
}
