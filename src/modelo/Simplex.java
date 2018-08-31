package modelo;

public class Simplex {
	double Z;
	double aux;
	public void Simplex (double[] matriz_Z, int restricciones,int variables, double[] matriz_funcion_objetivo,double[][] matriz_restricciones,double[] matriz_sol,double[] matriz_cb) {
		System.out.println("Matriz inicial");
		Simplex_imprimir(matriz_Z,restricciones,variables,matriz_funcion_objetivo,matriz_restricciones,matriz_sol,matriz_cb);
		//OPERAR
		double min=matriz_Z[0];
		int index_c=0;
		//busco minimo en matriz_Z
		for(int i=1;i<matriz_Z.length;i++){
		     if(matriz_Z[i]<min){
		                  min=matriz_Z[i];
		                  index_c=i;
		      }
		}
		
	
		while(min<0) {
			//busco minimo entre xbi/Yij
			min=matriz_sol[0]/matriz_restricciones[0][index_c];
			int index_f=0;
		
			for(int j=1;j<restricciones;j++) {
		
				if(matriz_sol[j]/matriz_restricciones[j][index_c]<min) {
					min=matriz_sol[j]/matriz_restricciones[j][index_c];
					index_f=j;
				}
			}
			//modifico matriz_funcion_objetivo y matriz_cb
			double Auxiliar;
			Auxiliar=matriz_cb[index_f];
			matriz_cb[index_f]=matriz_funcion_objetivo[index_c];
			matriz_funcion_objetivo[index_c]=Auxiliar;
		
			double pivote= matriz_restricciones[index_f][index_c];
			
			//caso 4 otros search fila
			for(int o=0;o<restricciones;o++) {
				if(index_f!=o) {
					matriz_sol[o]=(matriz_sol[o])-(((matriz_sol[index_f])*(matriz_restricciones[o][index_c]))/pivote);
				}
			}
		
			for(int m=0;m<restricciones;m++) {
				//search col
				for(int n=0;n<variables;n++) {
					if(m!=index_f && n!=index_c) {
						matriz_restricciones[m][n] = matriz_restricciones[m][n]-( (matriz_restricciones[index_f][n])*(matriz_restricciones[m][index_c])/pivote);
					}
				}
			}
			
			//caso 2 fil
			matriz_sol[index_f]=(matriz_sol[index_f]/pivote);
			for(int k=0;k<variables;k++) {
				if(k!=index_c) {
					matriz_restricciones[index_f][k]=(matriz_restricciones[index_f][k]/pivote);
				}
			}
		
			//caso 3 col
			for(int l=0;l<restricciones;l++) {
				if(l!=index_f) {
					matriz_restricciones[l][index_c]=matriz_restricciones[l][index_c]/-pivote;
				}
			}
			
			//caso 1 piv
			matriz_restricciones[index_f][index_c]=1/matriz_restricciones[index_f][index_c];
			//matriz ZJ-CJ
			double aux_2;
			double auxx;
			for(int z=0;z<variables;z++) {
				aux_2=0;
				auxx = 0;
				for(int y=0;y<restricciones;y++) {
					auxx=(matriz_cb[y]*matriz_restricciones[y][z]);
					aux_2=aux_2+auxx;
				}
				matriz_Z[z]=aux_2-(matriz_funcion_objetivo[z]);
			}
		}
		Simplex_imprimir(matriz_Z,restricciones,variables,matriz_funcion_objetivo,matriz_restricciones,matriz_sol,matriz_cb);
		//OPERAR
		min=matriz_Z[0];
		index_c=0;
		//busco minimo en matriz_Z
		for(int i=1;i<matriz_Z.length;i++){
			if(matriz_Z[i]<min){
				min=matriz_Z[i];
				index_c=i;
			}
		}
	}
	
	public void Simplex_imprimir (double[] matriz_Z, int restricciones,int variables, double[] matriz_funcion_objetivo,double[][] matriz_restricciones,double[] matriz_sol,double[] matriz_cb) {
		System.out.print("Matriz_funcion_objetivo:|");
		for(int a=0;a<variables;a++) {
			System.out.print(matriz_funcion_objetivo[a]+"|");
		}
		System.out.println("");
		System.out.println("Matriz B^-1:");
		for(int b=0;b<restricciones;b++) {
			for(int c=0;c<variables;c++) {
				System.out.print(matriz_restricciones[b][c]+"|");
			}
			System.out.println("");
		}
		System.out.println("Matriz constantes variables basicas:");
		for(int d=0;d<restricciones;d++) {
			System.out.println( matriz_cb[d]);
		}
		System.out.println("Matriz solucion:");
		for(int e=0;e<restricciones;e++) {
			System.out.println(matriz_sol[e]);
		}
		System.out.print("Matriz Zj-Cj:|");
		for(int f=0;f<variables;f++) {
			System.out.print(matriz_Z[f]+"|");
		}
		Z=0;aux=0;
		for(int g=0;g<restricciones;g++) {
			aux=matriz_cb[g]*matriz_sol[g];
			Z=Z+aux;
		}
		System.out.println("\nZ = "+Z+"\n\n");
		
	}
}
