package pl.comarch.szkolenia.kolejki;

import java.util.NoSuchElementException;

public class LifoTest {
    public static void main(String[] args) {
        Lifo kolejkaLiczb = new Lifo();
        kolejkaLiczb.push(5);
        if (kolejkaLiczb.size() != 1) {
            throw new IllegalStateException("Długość kolejki powienna być jeden");
        }
        if (kolejkaLiczb.pop() != 5) {
            throw new IllegalStateException("Elemnet kolejki powienien wynosić 5");
        }
        boolean isCorectExeption = false;
        try {
            kolejkaLiczb.pop();
        }
        catch (NoSuchElementException e) {
            isCorectExeption = true;
        }
        catch (Exception e) {
            System.out.println("Nie właściwy wyjątek");
        }
        if(!isCorectExeption) {
            throw new IllegalStateException("Nie właściwy wyjątek");
        }
        kolejkaLiczb.push(3);
        kolejkaLiczb.push(1);
        kolejkaLiczb.push(2);
        if (kolejkaLiczb.pop() != 2) {
            throw new IllegalStateException("Element kolejki  powinien wynosić 2");
        }
        if (kolejkaLiczb.pop() != 1 && kolejkaLiczb.size() != 1) {
            throw new IllegalStateException("Element kolejki oraz jej wielkość powinny wynosić 1");
        }
        if (kolejkaLiczb.pop() != 3) {
            throw new IllegalStateException("Element kolejki  powinien wynosić 3");
        }
        System.out.println("Wszystkie testy przebiegły poprawnie");
    }
}
