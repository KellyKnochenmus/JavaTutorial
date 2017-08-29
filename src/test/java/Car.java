public class Car {
    private String make;
    int speed;
    int gear;

    //Constructor #1 (default)
    public Car() {
        this(10, 2);        //this calls the Constructor #2 from within Constructor #1
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing constructor without arguments");
    }

    //Contructor #2
    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with arguments");
    }

    // "this" refers to the instance of the class (object)
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
