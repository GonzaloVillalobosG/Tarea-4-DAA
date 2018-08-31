package Test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import modelo.Simplex;;

public class TestSimplex {
	//parametros y clases
	private double matriz_funcion_objetivo[];
	private double matriz_restricciones[][];
	private double matriz_sol[];
	private double matriz_cb [];
	private double matriz_Z[];
	private int variables;
	private int restricciones;
	private int objetivo;
	private int constante;
	private double ZJfinal;
	private double ZJ;
	Scanner teclado;
	
	@Before	
	public void before(){
		teclado= new Scanner(System.in);
		System.out.println("\n -- Ingrese numero de variables. --\n");
	
		variables = teclado.nextInt();
		
		System.out.println("\n -- Ingrese numero de restricciones. --\n ");
		restricciones = teclado.nextInt();
		
		matriz_funcion_objetivo = new double [variables];
		
		//solicitar
		
		for(int construir_matriz=0; construir_matriz<variables; construir_matriz++) {
			System.out.println("\n -- Ingrese C"+(construir_matriz+1)); //Ejemplo C1*X1+C2*X2 
			constante = teclado.nextInt();
			matriz_funcion_objetivo[construir_matriz] = constante;
		}
	
		//solicitar
		matriz_restricciones = new double [restricciones][variables];
		int f=0; int columna=0; 
		
		for(int iteraciones=0; iteraciones<(restricciones*variables); iteraciones++) {
			System.out.println("\n -- Ingrese Y"+(f+1)+(columna+1)+"X"+(columna+1)); //Ejemplo YijX1+YijX2 
																					//         Yijx1+Yijx2
			constante = teclado.nextInt();
			
			matriz_restricciones [f][columna] = constante;
			if(columna==(restricciones-1)) {
				f++; columna=0;
			}
			else {
				columna++;
			}
		}
		//solicitar
		//Xbi
		matriz_sol = new double [restricciones];
		
		for(int a=0; a<restricciones;a++) {
			System.out.println("\n ingrese Xb"+(a+1));
			constante = teclado.nextInt();
			matriz_sol[a]=constante;
		}
		
		//imprimir
		System.out.println("Max Z: ");
		for(int construir_matriz=0; construir_matriz<variables; construir_matriz++) {
			System.out.print(matriz_funcion_objetivo[construir_matriz]+"X"+(construir_matriz+1));
			
			if(construir_matriz!=(variables-1)) {
			System.out.print("+");	
			}
		}
		
		System.out.println("\nS.a:");
		f=0; int columnaa=0;
		
		for(int iteraciones=0;iteraciones<restricciones*variables;iteraciones++) {
			System.out.print(matriz_restricciones[f][columnaa]+"X"+(columnaa+1));
			
			if(columnaa==(restricciones-1)) {
				System.out.println("<="+matriz_sol[f]);
				f++;columnaa=0;
			}
			else {
				columnaa++;
				System.out.print("+");	
			}
		}
		for(int x=0;x<restricciones;x++) {
			System.out.print("X"+(x+1));
			if(x==(restricciones-1)) {
				System.out.print(">=0");
			}
			else {
				System.out.print(",");
			}
		}
		System.out.println("\n\n");		
		
		matriz_cb = new double [restricciones];
		for(int c=0;c<restricciones;c++) {
			matriz_cb [c]= 0;
		}
		
		matriz_Z = new double [variables];
		ZJ=0; ZJfinal=0;
	
		for(int e=0;e<variables;e++) {
			for(int g=0;g<restricciones;g++) {
				ZJ= matriz_cb[g]*matriz_restricciones[g][e];
				ZJfinal=ZJfinal+ZJ;
				
				matriz_Z[e]=ZJfinal-matriz_funcion_objetivo[e];
			}
		}
		
	}
	@Test
	public void test() {
		Simplex a = new Simplex();
		a.Simplex(matriz_Z,restricciones,variables,matriz_funcion_objetivo, matriz_restricciones, matriz_sol,matriz_cb);
		try{
			Thread.sleep(900000);
		}catch(Exception e){}	
	}

}
/*----------------------------------------------------------------------------------------------------------------------------------*/