package day34_Static_Garbage_AccesModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }


    static {
        System.out.println("Static Block"); // Always runs FIRST, and runs ONLY one time, it can be MORE than ONE, CANNOT be called,
    }

}
