package HomeWork37.Task1;

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
import java.util.List;

public class Task_01 {

    public List list(List list1, List list2) {
        list1.retainAll(list2);
        return list1;
    }
}
