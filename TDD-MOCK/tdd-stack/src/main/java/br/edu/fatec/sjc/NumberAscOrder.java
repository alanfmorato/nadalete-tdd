package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberAscOrder {
    public List<? extends Number> sort(CustomStack<? extends Number> stack) throws StackEmptyException, StackFullException {
        List<? extends Number> sortedNumbers = new ArrayList<>(stack.getElements());
        Collections.sort(sortedNumbers, new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                double value1 = num1.doubleValue();
                double value2 = num2.doubleValue();
                return Double.compare(value1, value2);
            }
        });
        return sortedNumbers;
    }

    public List<? extends Number> getSortedNumbers(CustomStack<? extends Number> stack) throws StackEmptyException, StackFullException {
        if (stack.isEmpty()) {
            throw new StackEmptyException();
        }

        if (stack.size() > 6) {
            throw new StackFullException();
        }

        List<? extends Number> sortedNumbers = new ArrayList<>(sort(stack));
        return sortedNumbers;
    }
}
