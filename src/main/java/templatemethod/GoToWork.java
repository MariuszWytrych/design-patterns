package templatemethod;

public abstract class GoToWork {
    abstract void breakfast();
    abstract void transport ();

    public final void goToWork (){
        breakfast();
        transport();
    }

}
