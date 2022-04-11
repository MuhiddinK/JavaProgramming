package day34_Static_Garbage_AccesModifiers;

public class AccessModifiers {

/*
Access Modifiers: define the accessibility

		public > protected > default > private

	private: ONLY reachable within the same class

	default: ONLY reachable within the same package

	public: ALWAYS rechable

 */

    public static int publicData = 100;
    static int defaultDeta = 200;
    private static int privateData = 300;



    // public method
    public static void method1(){
        System.out.println("Public");
    }


    // default method
    static void method2(){ // default method
        System.out.println("default");
    }



    // private method
    private static void method3(){
        System.out.println("private");
    }



    public static void main(String[] args) {

        System.out.println(publicData); // public is always reachable
        System.out.println(defaultDeta); // default is not reachable outside the same package
        System.out.println(privateData); // private is not reachable outside the same class

    }

}
