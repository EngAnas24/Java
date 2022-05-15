  package tr2;
class Hayvan {
    private String name;
    private double boy;
    private double kilo;

    public Hayvan(String name, double boy, double kilo) {
        this.name = name;
        this.boy = boy;
        this.kilo = kilo;
    }
 public void harakete_gec(int hiz ){
     System.out.println("hayvan "+hiz+"ile haraket edyor....");
 }
  void bligi(){
        System.out.println("name"+getName()+"\nboy"+getBoy()+"\nkilo"+getKilo());
    }
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
     * @return the boy
     */
    public double getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(double boy) {
        this.boy = boy;
    }

    /**
     * @return the kilo
     */
    public double getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(double kilo) {
        this.kilo = kilo;
    }
    
}
    
    
      



