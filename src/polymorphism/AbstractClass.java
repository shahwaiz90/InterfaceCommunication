package polymorphism;

public abstract class AbstractClass extends BackendTasks {

    private int flag;
    protected int count = 1;

    AbstractClass(){
        System.out.println("Abstract Class Constructor");
    }

    //Non abstract method
    private void someMethod(){
        System.out.println("Some private Method");
    }

    //Non abstract method
    protected void someProtectedMethod(){
        System.out.println("Some protected Method");
    }

    //Non abstract method
    public void somePublicMethod(){
        System.out.println("Some public Method");
    }

    //Non abstract method
    public static void someStaticMethod(){
        System.out.println("Some public static Method");
    }



}
