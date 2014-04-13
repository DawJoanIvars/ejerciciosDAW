//Abrimos la clase
public class IslaDesierta {

	//Abrimos el main.
	public static void main(String[] args) {

		//Creamos el array.
		String equipaje[]= new String[10];
	
		//Lo iniciamos.
		for(int i=1;i<equipaje.length;i++){
			
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
			
			//Vemos el resultado.
			System.out.println("A una isla me llevaria: "+equipaje[i]);
			
		}
	}

}
