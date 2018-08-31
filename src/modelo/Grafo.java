/**
 * 
 */
package modelo;

import java.util.Random;

/**
 * @author juan_
 *
 */
public class Grafo {

	private int n;
	private int[][] GMatriz;
	
	public Grafo(int n) {
		this.n = n;
		GMatriz = new int[this.n][this.n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				GMatriz[i][j]=0;
			}
		}
	}
	
	public void add_peso(int i,int j,int d) {
		GMatriz[i][j]=d;
	}
	
	public void del_peso(int i, int j) {
		GMatriz[i][j]=-1;
	}
	
	public void matriz_azar_sin_ciclos() {
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.n;j++) {
				if(i==j) {
					GMatriz[i][j] = 0;
				}else{
					GMatriz[i][j] = new Random().nextInt(10);
				}
			}
		}
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.n;j++) {
				System.out.print(GMatriz[i][j]+" ");
			}
			System.out.println("");
		}
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @return the gMatriz
	 */
	public int[][] getGMatriz() {
		return GMatriz;
	}
	

}
