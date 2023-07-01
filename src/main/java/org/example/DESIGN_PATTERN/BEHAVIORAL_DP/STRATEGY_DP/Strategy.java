package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.STRATEGY_DP;

public class Strategy {

    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }
    public void sortData(int [] data){
        strategy.sort(data);
    }

}
