package util;

public abstract class Algoritmos {
	/**
     * Calcula el número de Fibonacci para un número entero dado.
     *
     * @param numero El número entero para el cual se calculará el número de Fibonacci.
     * @return El número de Fibonacci para el número dado.
     */
    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

   
}
