package controllers;

import java.util.HashMap;


public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:D
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */

    public static boolean areAnagrams(String str1, String str2) {
        HashMap<Character, Integer> frecuenciasStr1 = new HashMap<>();

        for (char caracter : str1.toCharArray()) {
            int conteo = frecuenciasStr1.getOrDefault(caracter, 0);
            frecuenciasStr1.put(caracter, conteo + 1);

        }
    
        for (char caracter : str2.toCharArray()) {
            if (!frecuenciasStr1.containsKey(caracter)) {
                return false; 

            }
    
            int conteoStr1 = frecuenciasStr1.get(caracter);
            int conteoStr2 = (int) str2.chars().filter(c -> c == caracter).count();
    
            if (conteoStr1 != conteoStr2) {
                return false; 

            }
        }
        return true;

    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
