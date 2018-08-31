package Test;

import org.junit.Test;

import Modelo.BellmanFord;
import Modelo.Grafo;

public class TestBellmanFord {

	@Test
	void Test{
		BellmanFord BF = new BellmanFord();
		Grafo m = new Grafo(3);
		m.matriz_azar_sin_ciclos();
		System.out.println(BF.BusquedaMejorCamino(m, 0));
	}
}
