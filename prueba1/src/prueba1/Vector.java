package prueba1;

public class Vector {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int n=5, resultado=0;
		int a[]= new int[n];
		for (int i=0; i<n;i++)
			a[i]=(i+1) * 10;
		// visualizamos el vector 
		for (int i=0;i<n;i++)
			System.out.printf("Elemento %d=%d\n",i,a[i], args);
		for (int i=0;i<n;i++)
			resultado +=a[i];
		//visualizamos la media de los valores calculados
		System.out.println("La media es = " + resultado/n);
		
	}

}
