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

    /**
     * Calcula el factorial de un número entero dado.
     *
     * @param numero El número entero para el cual se calculará el factorial.
     * @return El factorial del número dado.
     */
    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    /**
     * Verifica si un número entero dado es primo.
     *
     * @param numero El número entero que se verificará.
     * @return true si el número es primo, false si no lo es.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
