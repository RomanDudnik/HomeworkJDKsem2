package project;

public class Fullstacker extends Developer implements BackendAction, FrontendAction {
    private final Frontender frontender = new Frontender() {
        @Override
        public void developGUI() {
            System.out.println("Frontender is developing the GUI");
        }
        @Override
        public void back() {
            System.out.println("Frontender working");
        }
    };

    @Override
    public void back() {
        System.out.println("Fullstacker working");
    }

    @Override
    public void front() {
        frontender.developGUI();
    }

    @Override
    public void developGUI() {
        frontender.developGUI();
    }
}
