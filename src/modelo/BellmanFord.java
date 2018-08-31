package modelo;

import java.util.LinkedList;

public class BellmanFord {

	private static LinkedList<Aristas> aristas;
	private static Grafo m;
    private static float etiquetas[];
    private static int predecesor[];
    private static int numeroVertices, totalAristas, nodoOrigen;
    private final int INFINITY = 999;
    
    private static class Aristas {
    	int origen, destino;
        float coste;
 
        public Aristas(int a, int b, float c) {
            origen = a;
            destino = b;
            coste = c;
        }
 
        @Override
        public String toString() {
            return "Aristas{" + "origen=" + (origen+1) + ", destino=" + (destino+1) + ", coste=" + coste + '}';
        }
    }
    
    /**
     * 
     * @param grafo
     * @param inicial
     * @return
     */
    public String BusquedaMejorCamino(Grafo grafo, int inicial){
    	String Salida = ""; 
    	numeroVertices = grafo.getN();
    	nodoOrigen = inicial;
    	m = grafo;
    	
    	BellmanFord bellman = new BellmanFord();
	    Salida = bellman.relajoArista()+"\n\n";
	    
	    if (bellman.ciclo()) {
	        for (int i = 0; i < bellman.numeroVertices; i++) {
	            System.out.println("Coste desde " + bellman.nodoOrigen + " a " + (i) + " =>" + bellman.etiquetas[i]);
	            Salida = Salida + "Coste desde " + bellman.nodoOrigen + " a " + (i) + " =>" + bellman.etiquetas[i]+"\n";
	        }
	    } else {
	        System.out.println("Hay un ciclo negativo");
	    }
	    
	    return Salida;
    }
    
    /**
     * 
     * @param m
     * @param incial
     */
	public BellmanFord(){
		aristas = new LinkedList<Aristas>();
        
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (i != j) {
                   // if (m.getGMatriz()[i][j] != 0) {
                        aristas.add(new Aristas(i, j, m.getGMatriz()[i][j]));
                    //}
                }
            }
        }
        totalAristas = aristas.size();
        etiquetas = new float[numeroVertices];
        predecesor = new int[numeroVertices];
	}
	
	/**
	 * 
	 */
	public String relajoArista() {
		String Resultado = "";
        int i, j;
        for (i = 0; i < numeroVertices; ++i) {
            etiquetas[i] = INFINITY;
        }
        etiquetas[nodoOrigen] = 0;
        for (i = 0; i < numeroVertices -1; ++i) {
            for (j = 0; j < totalAristas; ++j) {
                System.out.println(aristas.get(j));
                Resultado = Resultado + aristas.get(j)+"\n";
                if (etiquetas[aristas.get(j).origen] + aristas.get(j).coste < etiquetas[aristas.get(j).destino]) {
                    etiquetas[aristas.get(j).destino] = etiquetas[aristas.get(j).origen] + aristas.get(j).coste;
                    predecesor[aristas.get(j).destino] = aristas.get(j).origen;
                }
            }
            for (int p = 0; etiquetas.length < p; p++) {
                System.out.println("\t" + etiquetas[p]);
            }
        }
        
        return Resultado;
    }
	
	/**
	 * 
	 * @return
	 */
	public boolean ciclo() {
        int j;
        for (j = 0; j < totalAristas; ++j) {
            if (etiquetas[aristas.get(j).origen] + aristas.get(j).coste < etiquetas[aristas.get(j).destino]) {
            	return false;
            }
        }
        return true;
    }
}
