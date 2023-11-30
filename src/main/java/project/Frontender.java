package project;

public abstract class Frontender extends Developer implements FrontendAction {
    @Override
    public void front() {
        System.out.println("FrontEnd working");
    }
}
