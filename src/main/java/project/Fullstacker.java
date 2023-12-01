package project;

public class Fullstacker extends Developer implements BackendAction, FrontendAction {
    private Frontender frontender; // Добавляем объект типа Frontender

    void setFrontender(Frontender frontender) {
        this.frontender = frontender;
    }

    @Override
    public void front() {
        if (frontender != null) {
            frontender.front(); // Вызываем метод developFrontend() у объекта Frontender
        } else {
            System.out.println("Frontend is not set");
        }
    }
}


