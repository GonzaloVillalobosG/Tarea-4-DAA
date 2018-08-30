package modelo.mochila;

public class IniciarMochila {
	
	Elemento[] elementos = {
            new Elemento(1, 1),
            new Elemento(2, 2),
            new Elemento(4, 10),
            new Elemento(1, 2),
            new Elemento(12, 15)
        };
 
        Mochila m_base = new Mochila(15, elementos.length);
        Mochila m_opt = new Mochila(15, elementos.length);
	
}
