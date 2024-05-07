package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CustomStack<T extends  Number> {
    private final Integer limit;
    private int index = 0;
    private List<T> elements;
    private CalculableStrategy<T> calculableStrategy;
    Integer a;
    public CustomStack(int pLimit, CalculableStrategy<T> pCalculableStratey) {
            this.limit = pLimit;
            this.elements = new ArrayList<>();
            this.calculableStrategy = pCalculableStratey;
    }

    public void push(T element) throws StackFullException {
        if(this.size() == this.limit) {
            throw new StackFullException();
        }
        this.elements.add(calculableStrategy.calculateValue(element));
        ++index;
    }

    public T pop() throws StackEmptyException {
        if(this.isEmpty()) {
            throw new StackEmptyException();
        }
        return this.elements.remove(--index);
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public T top() {
        return this.elements.get((index-1));
    }

    public int size() {
        return this.elements.size();
    }

    public Integer getLimit() {
        return limit;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public CalculableStrategy<T> getCalculableStrategy() {
        return calculableStrategy;
    }

    public void setCalculableStrategy(CalculableStrategy<T> calculableStrategy) {
        this.calculableStrategy = calculableStrategy;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
}
