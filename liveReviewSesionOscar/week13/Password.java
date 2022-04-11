package week13;

import java.util.Scanner;

public class Password {

    public class password {
        private String password;

        public password(){

        }

        Scanner scanner = new Scanner(System.in);

        public String getPassword(){
            if(password==null){
                System.out.println("password is null. Assign a value for it");
                password=scanner.next();
            }else {
                System.out.println("It has a value, just returning it");
            }
            return password;
        }
    }

}
