package day34_Static_Garbage_AccesModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Blok");
    }


    public Constructor_vs_StaticBlock(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

    }


}
