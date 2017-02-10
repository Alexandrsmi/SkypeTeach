package skype.teach.task.lesson3;

public class RefTask {
    public static void main(String[] args) {
        Integer value = 1; // инициализируем пременную value типа Integer
       RefTask.change(value); //вызываем метод change класса RefTask, в качестве входного параметра
        // передаем значение value
        System.out.println(value); // вывод значения value в командной строке
    }

    public static Integer change(Integer that) { // создаем метод change с входящим аргументом that типа Integer
        // метод void поэтому данный метод ничего не возвращает
        that++;
        return that;
    }
}
