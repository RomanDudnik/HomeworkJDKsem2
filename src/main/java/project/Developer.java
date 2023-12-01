package project;
/*
    Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
  которые в состоянии писать серверный код, фронтендеры, которые могут программировать
  экранные формы, и фуллстэк разработчики, совмещающие в себе обе компетенции.
  Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
  все его методы.
    Дописать третье задание таким образом, чтобы в идентификатор типа Developer
  записывался объект Frontender, и далее вызывался метод developGUI(),
  не изменяя существующие интерфейсы, только код основного класса.
 */
public abstract class Developer {
    void developGUI() {
        System.out.println("GUI is working!");
    }
    public void back() {
        System.out.println("Backend is working!");
    }
}
