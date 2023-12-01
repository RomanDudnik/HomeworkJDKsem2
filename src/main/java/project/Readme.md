### Задача:
Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
которые в состоянии писать серверный код, фронтендеры, которые могут программировать
экранные формы, и фуллстэк разработчики, совмещающие в себе обе компетенции.
Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
все его методы.
Дописать третье задание таким образом, чтобы в идентификатор типа **Developer**
записывался объект **Frontender**, и далее вызывался метод **developGUI()**,
не изменяя существующие интерфейсы, только код основного класса.
Дописать третье задание таким образом, чтобы в идентификатор типа **Developer**
записывался объект **Frontender**, и далее вызывался метод **developGUI()**,
не изменяя существующие интерфейсы, только код основного класса.

## Решение задачи:

Этот код представляет собой пример использования наследования и интерфейсов для разработки программы,
связанной с различными задачами разработки: backend, frontend и разработка пользовательского интерфейса (GUI).
Класс **Developer** является абстрактным классом, который содержит методы для работы с backend и
пользовательским интерфейсом.
Класс **Frontender** реализует интерфейс **FrontendAction** и предоставляет реализацию для разработки frontend.
Класс **Fullstacker** наследуется от класса Developer и реализует интерфейс FrontendAction,
что позволяет ему иметь методы для работы с backend, frontend и GUI.
Класс **Main** является основным классом, где создаются экземпляры классов и вызываются их методы.

### 1. Объявление интерфейсов:

    interface BackendAction {
        void back();
    }

    interface FrontendAction {
        void front();
    }

В данном коде определены два интерфейса - **BackendAction** и **FrontendAction**.

* Интерфейсы - это набор абстрактных методов, которые определяют поведение и функциональность для классов,
которые их реализуют.

Интерфейс BackendAction объявляет метод back(), а интерфейс FrontendAction объявляет метод front().

### 2. Абстрактный класс Developer:

    abstract class Developer {

        void developGUI() {
            System.out.println("GUI is working!");
        }

        void back() {
            System.out.println("Backend is working!");
        }
    }

Это абстрактный класс **Developer**, который содержит два метода - **developGUI()** и **back()**.
Метод **developGUI()** выводит сообщение "GUI работает", а метод back() выводит сообщение **"Backend is working!"**.
Абстрактные классы не могут быть инстанциированы, но они могут содержать реализацию методов,
которые могут быть унаследованы и переопределены в подклассах.

### 3. Класс Frontender:

    class Frontender implements FrontendAction {

        @Override
        public void front() {
            System.out.println("Frontend is working");
        }

    }

Класс **Frontender** является реализацией интерфейса **FrontendAction**.
Он переопределяет метод **front()**, который выводит сообщение **"Frontend is working"**.

### 4. Класс Fullstacker:

    class Fullstacker extends Developer implements FrontendAction {

        private Frontender frontender;

        void setFrontender(Frontender frontender) {
            this.frontender = frontender;
        }

        @Override
        public void front() {
            if (frontender != null) {
            frontender.front();
            } else {
                System.out.println("Frontend is not set");
            }
        }
    }

Класс **Fullstacker** наследует абстрактный класс **Developer** и реализует интерфейс **FrontendAction**.
Он также содержит приватное поле frontender типа **Frontender**.
Класс **Fullstacker** обладает методом **setFrontender()**, который устанавливает значение для поля **frontender**.

Метод **front()** класса **Fullstacker** переопределяет метод из интерфейса **FrontendAction**.
Он проверяет, присвоено ли значение переменной frontender, и если да,
то вызывает метод **front()** объекта **frontender**. В противном случае выводится сообщение **"Frontend is not set"**.

### 5. Основной класс Main:

    public class Main {

        public static void main(String[] args) {

            Fullstacker fullstacker = new Fullstacker();
            Frontender frontender = new Frontender();
            fullstacker.setFrontender(frontender);

            fullstacker.back();
            fullstacker.front();
            fullstacker.developGUI();
        }
    }

Основной класс **Main** содержит метод **main()**, который является точкой входа в программу.
В методе **main()** создается экземпляр класса **Fullstacker** и объект класса **Frontender**,
который присваивается полю frontender объекта **fullstacker** с помощью метода **setFrontender()**.
Затем вызываются методы **back(), front()** и **developGUI()** объекта fullstacker.
