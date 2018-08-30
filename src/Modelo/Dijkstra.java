/**
 * 
 */
package Modelo;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author juan_
 *
 */
public class Dijkstra {
	
	ArrayList<Integer> lista;

	/**
	 * 
	 */
	public Dijkstra() {
		this.lista = new ArrayList<>();
	}
	
	public ArrayList<Integer> BusquedaMejorCamino(Grafo m,int fin){
		ArrayList<Integer> padres = new ArrayList<Integer>();
		
		lista.add(0);
		padres.add(0);

		for(int i = 1; i < fin+1 ; i++) {
			lista.add(1000000000);
			padres.add(-1);
		}
		PriorityQueue<Integer> pila = new PriorityQueue<>();
		pila.add(lista.get(0));
		while(!pila.isEmpty()) {
			System.out.println(pila);
			int j=pila.poll();
			for(int h=0;h<fin+1;h++) {
				if(m.getGMatriz()[j][h] != 0) {
					if(lista.get(h) > lista.get(j) + m.getGMatriz()[j][h]) {
						lista.set(h, lista.get(j) + m.getGMatriz()[j][h]);
						System.out.println(j+"->"+h+" = "+m.getGMatriz()[j][h]);
						padres.set(h, j);
						pila.add(h);
					}
				}
			}
		}
		return lista;
	}

	/**
	 * @return the lista
	 */
	public ArrayList<Integer> getLista() {
		return lista;
	}

	public String toString() {
		return ""+lista;
	}

}
