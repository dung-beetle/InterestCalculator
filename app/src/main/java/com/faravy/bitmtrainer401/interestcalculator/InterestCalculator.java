package com.faravy.bitmtrainer401.interestcalculator;

/**
 * Created by BITM Trainer 401 on 2/25/2016.
 */
public class InterestCalculator {
    double principalAmount;
    float interestRate;
    float timePeriod;

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(float timePeriod) {
        this.timePeriod = timePeriod;
    }
    public  double calculateInterest(){

      return (interestRate*timePeriod*principalAmount)/100;

    }
}
