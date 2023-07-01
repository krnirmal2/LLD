package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.STRATEGY_DP;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] data) {
         sort(data);
        System.out.println("bubbleSort ");
    }
}
