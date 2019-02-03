package polymorphism;


import interfaces.IDisplaysMessages;

public class MainApp implements IDisplaysMessages {

    MainApp(){
        System.out.println("Main App Constructor");
    }

    //This method is overridden from IDisplays Messages, so contract has been completed between this class and the Interface.
    //It is being called from another class which has reference of IDisplaysMessages Interface
    @Override
    public void showTaskStartedMessage() {
        System.out.println("Task Started :D :D!!!!");
    }

    //This method is overridden from IDisplays Messages
    //It is being called from another class which has reference of IDisplaysMessages Interface
    @Override
    public void showTaskStoppedMessage() {
        System.out.println("Task Stopped :( :( !!!");
    }

    public void someLocalClass(){
        System.out.println("someLocalClass (It won't be called from BackendTasks) !!!");
    }

    public static void main(String[] args) {

        MainApp mainApp = new MainApp();
        BackendTasks backendTasks = new BackendTasks();

        //Here we are passing reference of this class to BackendTasks class.
        //But their (BackendTasks class) we are getting it via Interface reference
        backendTasks.setListener(mainApp);

        //After setting this class reference (So next class can callback), we will call designated methods.
        backendTasks.startTask();
        backendTasks.stopTask();
    }
}
