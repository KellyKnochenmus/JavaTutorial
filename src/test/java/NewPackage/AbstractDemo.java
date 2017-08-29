package NewPackage;

//To call the abstract class
public class AbstractDemo extends AbstractClassTest{

    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(10);
    }

    public void engineStart(String keyType, int numCyls) {
        System.out.println("This is the BMW Engine start");
    }

    //public void engineStart() {
       // super.engineStart();
      //  System.out.println("BMWs have keyless engine starter");
   // }
}
