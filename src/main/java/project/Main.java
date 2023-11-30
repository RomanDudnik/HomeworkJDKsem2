package project;
/*
  Дописать третье задание таким образом, чтобы в идентификатор типа Developer
  записывался объект Frontender, и далее вызывался метод developGUI(),
  не изменяя существующие интерфейсы, только код основного класса.
 */
public class Main {
    public static void main(String[] args) {
        Fullstacker fullstacker = new Fullstacker();
        fullstacker.front(); // Вызов метода front
        fullstacker.back(); // Вызов метода back

        // Вызов метода developGUI на объекте типа Frontender
        fullstacker.developGUI();
    }
}
