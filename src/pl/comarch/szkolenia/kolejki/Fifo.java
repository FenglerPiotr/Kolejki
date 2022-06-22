package pl.comarch.szkolenia.kolejki;

import java.util. * ;

public class Fifo implements Queue {

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
        return numbers.removeFirst();
    }
}