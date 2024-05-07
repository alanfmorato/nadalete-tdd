package br.edu.fatec.sjc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class NumberAscOrderTest {

    @Test
    void testSortWithSixRandomNumbers() throws StackEmptyException, StackFullException {
        // Criando uma pilha personalizada mockada
        CustomStack<Integer> customStack = mock(CustomStack.class);

        // Criando uma lista de seis números aleatórios
        List<Integer> randomNumbers = Arrays.asList(5, 2, 7, 1, 9, 3);

        // Configurando o comportamento do mock
        when(customStack.size()).thenReturn(6);
        when(customStack.getElements()).thenReturn(randomNumbers);

        // Chamando o método sort() da classe NumberAscOrder
        NumberAscOrder numberAscOrder = new NumberAscOrder();
        List<? extends Number> sortedNumbers = numberAscOrder.sort(customStack);

        // Verificando se a lista ordenada é igual à lista original ordenada
        Collections.sort(randomNumbers);
        assertEquals(randomNumbers, sortedNumbers);
    }

    @Test
    void testSortWithEmptyList() {
        CustomStack<Integer> customStack = mock(CustomStack.class);
        when(customStack.isEmpty()).thenReturn(true);

        NumberAscOrder numberAscOrder = new NumberAscOrder();
        assertThrows(StackEmptyException.class, () -> {
            numberAscOrder.getSortedNumbers(customStack);
        });
    }

}
