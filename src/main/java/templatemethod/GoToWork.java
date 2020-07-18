package templatemethod;

import java.util.logging.SocketHandler;

public abstract class GoToWork {
    abstract void breakfast();
    abstract void transport ();

    public final void goToWork (){
        breakfast();
        transport();
        accesToDoor();
    }

    private void accesToDoor() {
        System.out.println("Door opened.");
    }

}
