package day34_Static_Garbage_AccesModifiers;

public class StaticMembers { // outher class

    static class class1 { // inner class can be static, NOT the outer class

    }

    public static int num = 100; // variable

    public static void method() { // method

    }

    static { // Block

    }

}


class A{ // outer class

        static class B{ // inner class

            public static void method1(){

            }

        }

}



class C{
    public static void main(String[] args) {

        A.B.method1();
    }
}


