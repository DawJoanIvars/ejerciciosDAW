import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EjercicioArrays extends JFrame {

	private JPanel contentPane;
	//NUMEROS A GUARDAR EN ARRAY
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private String guarda;
	//Array de numeros
	private int arrayNumeros[]=new int[3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioArrays frame = new EjercicioArrays();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public EjercicioArrays() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Posicion 1");
		lblNewLabel.setBounds(10, 11, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPosicion = new JLabel("Posicion 2");
		lblPosicion.setBounds(10, 48, 63, 14);
		contentPane.add(lblPosicion);
		
		JLabel lblPosicion_1 = new JLabel("Posicion 3");
		lblPosicion_1.setBounds(10, 76, 63, 20);
		contentPane.add(lblPosicion_1);
		
		num1 = new JTextField();
		num1.setBounds(62, 8, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(62, 45, 86, 20);
		contentPane.add(num2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(62, 76, 86, 20);
		contentPane.add(num3);
		
		//BOTON A DESARROLLAR
		JButton botonGuardar = new JButton("Guardar en array");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					arrayNumeros[0]=Integer.parseInt(num1.getText());
					arrayNumeros[1]=Integer.parseInt(num2.getText());
					arrayNumeros[2]=Integer.parseInt(num3.getText());
					guardarfichero();
					}
					catch (NumberFormatException error ){
						//A�adimos el mensaje que mostrar� si hay error.
						num1.setText("Error");
						num2.setText("Error");
						num3.setText("Error");
						
					}
			}
		});
		botonGuardar.setBounds(175, 7, 144, 89);
		contentPane.add(botonGuardar);
		
	}
	
	private void guardarfichero(){
		//Utilizamos el tipo ObjectOutputStream para poder guardar lo cojido anteriormente.
		ObjectOutputStream salida;
		try
		{
			//Le decimos que cree un archivo llamado archivo de extension .ser.
			salida= new ObjectOutputStream(new FileOutputStream("archivo.ser"));
			salida.writeObject(guarda);
			//
			if (salida !=null)	
				salida.close();
		}//Le decimos que si hay error salga un comentario.
		catch(IOException ioException){
			System.err.println("Error al abrir el archivo.");
		}
		}
	//M�todo que guarda 3 n�meros en el array
	private void guardarNumeros(int numero1,int numero2, int numero3){
		//Aqui va el contenido
		numero1=arrayNumeros[0];
		numero2=arrayNumeros[1];
		numero3=arrayNumeros[2];
	
	}
}
