/**
 * 
 */
package Test;

import org.junit.Test;
import modelo.Dijkstra;
import modelo.Grafo;

/**
 * @author juan_
 *
 */
class TestDijkstra {

	@Test
	void test() {
		Grafo m = new Grafo(10);
		m.matriz_azar_sin_ciclos();
		Dijkstra d = new Dijkstra();
		d.BusquedaMejorCamino(m, 3);
		System.out.println(d.getLista());
		System.out.println(d.toString());
	}

}
