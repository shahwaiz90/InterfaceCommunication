package polymorphism;

import interfaces.IDisplaysMessages;

class BackendTasks{
    private IDisplaysMessages iDisplaysMessages;

    BackendTasks(){
        System.out.println("BackendTasks Constructor");
    }

    // Any class that is implementing IDisplaysMessages interface.
    void setListener(IDisplaysMessages iDisplaysMessages){
        this.iDisplaysMessages = iDisplaysMessages;
    }

    void startTask() {
        System.out.println("Task has been started");
        iDisplaysMessages.showTaskStartedMessage();
    }

    void stopTask() {
        System.out.println("Task has been Stopped");
        iDisplaysMessages.showTaskStoppedMessage();
    }
}
