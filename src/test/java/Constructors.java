public class Constructors {

    public static void main(String[] args) {

        //First call of default constructor
        Car c1 = new Car();

        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println(c1.speed);
        System.out.println(c1.gear);

        System.out.println("********************");

        //Call of second constructor that takes arguments
        Car c2 = new Car(10,1);

        System.out.println(c2.speed);
        System.out.println(c2.gear);


    }

}
