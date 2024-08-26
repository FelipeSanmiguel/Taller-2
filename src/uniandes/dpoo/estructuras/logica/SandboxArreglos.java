package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        return arregloEnteros.clone();
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return arregloCadenas.clone();
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int nuevoLen = arregloEnteros.length + 1;
    	int [] copiaArregloEnteros = new int[nuevoLen];
    	copiaArregloEnteros[arregloEnteros.length] = entero;
    	
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
	    	copiaArregloEnteros[i] = arregloEnteros[i];
	    }
    	
    	arregloEnteros = copiaArregloEnteros;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int nuevoLen = arregloCadenas.length + 1;
    	String [] copiaArregloCadenas = new String[nuevoLen];
    	copiaArregloCadenas[arregloCadenas.length] = cadena;
    	
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		copiaArregloCadenas[i] = arregloCadenas[i];
	    }
    	
    	arregloCadenas = copiaArregloCadenas;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int nuevoTamaño = 0;
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i] != valor) {
    			nuevoTamaño = nuevoTamaño + 1;
    		}
    	}
    	
    	int[] copiaArregloEnteros = new int[nuevoTamaño];
    	int desfaze = 0;
    	
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i] != valor) {
    			copiaArregloEnteros[i-desfaze] = arregloEnteros[i];
    		}
    		else {
    			desfaze ++;
    		}
    	}
    	
    	arregloEnteros = copiaArregloEnteros;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int nuevoTamaño = 0;
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		if (arregloCadenas[i] != cadena) {
    			nuevoTamaño = nuevoTamaño + 1;
    		}
    	}
    	
    	String[] copiaArregloCadenas = new String[nuevoTamaño];
    	int desfaze = 0;
    	
    	
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		if (arregloCadenas[i] != cadena) {
    			copiaArregloCadenas[i-desfaze] = arregloCadenas[i];
    		}
    		else {
    			desfaze ++;
    		}
    	}
    	
    	arregloCadenas = copiaArregloCadenas;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	
    	int largoArray = arregloEnteros.length;
    	
    	if (largoArray == 0) {
    		agregarEntero(entero);
    	}
    	else {
    		
    		int nuevoLen = arregloEnteros.length + 1;
        	int [] copiaArregloEnteros = new int[nuevoLen];
    		
	    	if (posicion > largoArray-1) {
	    		agregarEntero(entero);
	    	}
	    	else if(posicion < 0) {
	    		
	    		for(int i = 0; i < arregloEnteros.length; i++) {
	    	    	copiaArregloEnteros[i+1] = arregloEnteros[i];
	    	    }
	    		
	    		copiaArregloEnteros[0] = entero;
	    		arregloEnteros = copiaArregloEnteros;
	    	}
	    	else {
	    		
	    		
	    		for(int i = 0; i < posicion; i++) {
	    	    	copiaArregloEnteros[i] = arregloEnteros[i];
	    	    }
	    		
	    		copiaArregloEnteros[posicion] = entero;
	    		
	    		for(int i = posicion; i < arregloEnteros.length; i++) {
	    	    	copiaArregloEnteros[i+1] = arregloEnteros[i];
	    	    }
	    		
	    		arregloEnteros = copiaArregloEnteros;
	    	}
    	}
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int nuevoLen = arregloEnteros.length - 1;
    	int [] copiaArregloEnteros = new int[nuevoLen];
    	
    	if(posicion <= arregloEnteros.length -1 && posicion>=0) {

    		for(int i = 0; i < arregloEnteros.length; i++) {
    	    	
    			if(i < posicion) {
    				copiaArregloEnteros[i] = arregloEnteros[i];
    			}
    			
    			else if(i > posicion) {
    				copiaArregloEnteros[i-1] = arregloEnteros[i];
    			}
    	    }
    		
    		arregloEnteros = copiaArregloEnteros;
    		
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] copiaArregloEnteros = new int[valores.length];
    	
    	for(int i = 0; i < copiaArregloEnteros.length; i ++) {
    		copiaArregloEnteros[i] = (int)valores[i];
    	}
    	
    	arregloEnteros = copiaArregloEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] copiaArregloCadenas = new String[objetos.length];
    	
    	for(int i = 0; i < copiaArregloCadenas.length; i ++) {
    		copiaArregloCadenas[i] = (objetos[i]).toString();
    	}
    	
    	arregloCadenas = copiaArregloCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] < 0) {
    			arregloEnteros[i] = -1 * arregloEnteros[i];
    		}
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	if(arregloEnteros.length != 0) {
    		Arrays.sort(arregloEnteros);	
    	}
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int contador = 0;
        for(int i = 0; i < arregloEnteros.length; i++) {
        	if(arregloEnteros[i] == valor) {
        		contador ++;
        	}
        }
    	
    	return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int contador = 0;
        for(int i = 0; i < arregloCadenas.length; i++) {
        	if(arregloCadenas[i].toLowerCase().equals(cadena.toLowerCase())) {
        		contador ++;
        	}
        }
    	
    	return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        
    	int contador = 0;
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			contador++;
    		}
    	}
    	
    	int [] arregloInstancias = new int[contador];
    	
    	int pos = 0;
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			arregloInstancias[pos] = i;
    			pos++;
    		}
    	}
    	
    	
    	return arregloInstancias;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	
    	int[] Rango = new int[2];
    	int[] RangoVacio = new int[]{};
    	
        if(arregloEnteros.length != 0) {
        	
        	
        	int min = arregloEnteros[0];
            int max = arregloEnteros[0];
        	
        	for(int i = 0; i < arregloEnteros.length; i++) {
            	if(arregloEnteros[i] < min) {
            		min = arregloEnteros[i];
            	}
            	
            	if(arregloEnteros[i] > max) {
            		max = arregloEnteros[i];
            	}
            }
        	
        	Rango[0] = min;
        	Rango[1] = max;
        	
        }
        
        else {
        	Rango = RangoVacio;
        }
        
    	return Rango;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	
    	HashMap<Integer, Integer> mapa = new HashMap<>();
    	
    	int cantidad;
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		
    		if(!mapa.containsKey(arregloEnteros[i])) {
    			mapa.put(arregloEnteros[i], 1);
    		}
    		else {
    			cantidad = mapa.get(arregloEnteros[i]);
    			cantidad++;
    			mapa.replace(arregloEnteros[i], cantidad);
    		}
    		
    	}
        return mapa;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> mapa = calcularHistograma();
    	int contador = 0;
    	
    	for(int key: mapa.keySet()) {
    		if(mapa.get(key) >= 2) {
    			contador++;
    		}
    	}
    	
    	return contador;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean iguales = false;
    	
        if(otroArreglo.length == arregloEnteros.length) {
        	iguales = true;
        	for(int i = 0;i < arregloEnteros.length; i++) {
            	if(arregloEnteros[i] != otroArreglo[i]) {
            		iguales = false;
            	}
            }
        }
    	
    	return iguales;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
        int [] copiaArregloEnteros = arregloEnteros.clone();
        int [] copiaOtroArreglo = otroArreglo.clone();
        
        Arrays.sort(copiaArregloEnteros);
        Arrays.sort(copiaOtroArreglo);
        
        boolean iguales;
        
        if(copiaArregloEnteros.length != copiaOtroArreglo.length) {
        	iguales = false;
        }
        else {
        	iguales = Arrays.equals(copiaArregloEnteros, copiaOtroArreglo);
        }
        
    	return iguales;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoArreglo = new int[cantidad];
    	int numRand;
    	
    	for(int i = 0; i < nuevoArreglo.length; i++) {
    		
    		numRand = minimo + (int)(Math.random() * ((maximo - minimo) + 1));
    		
    		nuevoArreglo[i] = numRand;
    	}
    	
    	arregloEnteros = nuevoArreglo;
    }

}
