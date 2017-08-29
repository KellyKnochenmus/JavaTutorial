package NewPackage;

import java.sql.SQLException;

public class ExceptionsDemo {

    public static void main(String[] args) {
        Account acc = new Account();
        try {
            System.out.println("1st line in Try");
            acc.withdraw(5);
            System.out.println("2nd line after trying the withdraw method");
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Try again later");
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
