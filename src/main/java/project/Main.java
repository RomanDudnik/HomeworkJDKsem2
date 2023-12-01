package project;
/*
  Дописать третье задание таким образом, чтобы в идентификатор типа Developer
  записывался объект Frontender, и далее вызывался метод developGUI(),
  не изменяя существующие интерфейсы, только код основного класса.
 */
public class Main {
    public static void main(String[] args) {
        Fullstacker fullstacker = new Fullstacker();
        Frontender frontender = new Frontender();
        fullstacker.setFrontender(frontender); // Присваиваем объект Frontender

        fullstacker.back();
        fullstacker.front();
        fullstacker.developGUI(); // Вызываем метод developGUI()
    }
}
