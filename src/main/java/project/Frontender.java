package project;

public class Frontender extends Developer implements FrontendAction {
    @Override
    public void front() {
        System.out.println("Frontend is working");
    }
}
