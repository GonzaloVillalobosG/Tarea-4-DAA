/**
 * 
 */
package Test;

import org.junit.Test;
import modelo.Grafo;

/**
 * @author juan_
 *
 */
class TestGrafo {

	@Test
	void test() {

		Grafo m = new Grafo(6);
		m.matriz_azar_sin_ciclos();
		System.out.println(m.getGMatriz()[0][3]);
	}

}
