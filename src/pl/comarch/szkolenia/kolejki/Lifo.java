package pl.comarch.szkolenia.kolejki;

import com.sun.xml.internal.bind.v2.TODO;
import pl.comarch.szkolenia.kolejki.Queue;

import java.util.LinkedList;

public class Lifo implements Queue {

    private LinkedList<Integer> numbers = new LinkedList<>();

    public int size() {
        return numbers.size();
    }

    @Override
    public void push(Integer queueItem) {
        numbers.addLast(queueItem);
    }

    @Override
    public Integer pop() {
        return numbers.removeLast();
    }
}
