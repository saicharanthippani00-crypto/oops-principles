interface car{
    void start();
    void brake();
    void acclerate();
    void stopEngine();
}
class sportscar implements car{
    String brand;
    String mode;
    int currSpeed = 0;
    boolean engineOn = false;
    public sportscar(String brand,String mode){
        this.brand = brand;
        this.mode = mode;
    }
    @Override
    public void start(){
        engineOn = true;
        System.out.println("THE CAR IS STARTED");
    }
    @Override
    public void brake(){
        if(currSpeed<0){
            currSpeed = 0;
        }
        currSpeed-=20;
        System.out.println("THE CAR IS SLOWING");
    }
    @Override
    public void acclerate(){
    currSpeed+=20;
    System.out.println("this is acclearring mode");
    }
    @Override
    public void stopEngine(){
    currSpeed = 0;
    System.out.println("stopped");
    }

}
class bike{
    private int model;
    private int speed;
    private String name;
    public void setNmae(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void starts(){
        System.out.println("THE BIKE START");
    }
    public void stop(){
        System.out.println("the bike stops");
    }
    public void acclerate(){
        System.out.println("acclearting");
    }
}
public class Abstraction {
    public static void main(String[] args){
    car mycar = new sportscar("raor","running");
    mycar.start();
    mycar.brake();
    mycar.acclerate();
    mycar.stopEngine();
    bike bh = new bike();
    }
}
