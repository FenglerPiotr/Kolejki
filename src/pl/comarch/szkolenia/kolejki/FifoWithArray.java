package pl.comarch.szkolenia.kolejki;

public class FifoWithArray implements Queue{
    private Integer[] numbersArray = new Integer[10];

    private int counter = 0;

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void push(Integer queueItem) {
        if(counter == numbersArray.length) {
            Integer[] tempArray = new Integer[counter * 2];
            for(int i = 0; i < numbersArray.length; i++) {
                tempArray[i] = numbersArray[i];
            }
            numbersArray = tempArray;
        }
        numbersArray[counter] = queueItem;
        counter++;
    }

    @Override
    public Integer pop() {
        if (counter == 0) {
            throw new IllegalArgumentException("Brak elementów w kolejce.");
        }
        counter--;
        int result = numbersArray[0];
        if(counter > 0) {
            Integer[] tempArray = new Integer[numbersArray.length];
            for (int i = 1; i < numbersArray.length; i++) {
                tempArray[i - 1] = numbersArray[i];
            }
            numbersArray = tempArray;
        }
        return result;
    }
}
