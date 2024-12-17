package io.github.guilhermemelo01.channel;

public class InsertionSort {

    public static void main(String[] args) {
        Integer[] array = {4, 5, 8, 1, 2};

        Integer[] sortedArray = insertionSort(array);

        for (Integer i : sortedArray) {
            System.out.print(i + " ");
        }
    }

    public static Integer[] insertionSort(Integer[] array){
        for(int j = 1; j < array.length; j++){
            int chave = array[j];
            int i = j - 1;
            while(i >= 0 && array[i] > chave){
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = chave;
        }

        return array;
    }
}
