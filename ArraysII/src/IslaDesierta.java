//Abrimos la clase
public class IslaDesierta {

	//Abrimos el main.
	public static void main(String[] args) {

		//Creamos el array.
		String equipaje[]= new String[10];
		
		//Le damos un valor a cada uno.
		equipaje[0]="Agua";
		equipaje[1]="Comida";
		equipaje[2]="Smarthphone de gama alta a poder ser";
		equipaje[3]="Pistola con municion";
		equipaje[4]="Cuchillos";
		equipaje[5]="Cuerdas";
		equipaje[6]="Brujula";
		equipaje[7]="Radio";
		equipaje[8]="Ropa";
		equipaje[9]="Tienda de campaña";
		int j=0;
		for(int i=0;i<equipaje.length;i++){
			//Vemos el resultado.
			j=i+1;
			System.out.println("A una isla me llevaria: "+j+"."+equipaje[i]);
			
		}
	
	}
}
