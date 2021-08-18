package validating;

public class Calculator {

    public int factorial(int num) {

        int answer = 1;
        if(num<0){
            throw new IllegalArgumentException("The number can't be negative");
        } 
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }
    
    public int binomialCoefficent(int setSize, int subsetSize) {
        int numerator = 1;
        int denominator = 1;
        
        if(setSize < 0 || subsetSize < 0 || setSize < subsetSize){
            throw new IllegalArgumentException("Check your parameters");
        }
        numerator = factorial(setSize);
        denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
