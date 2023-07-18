package com.Conversor.Eve;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ConversorApp {
	
	public static void main(String[] args) {
		// ventana de bienvenida
		 JOptionPane.showMessageDialog(null, "¡Bienvenido al programa!", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
		 programa();
		 metodoRecursivo(JOptionPane.YES_OPTION);
	}
	
	public static void metodoRecursivo(int shi) {
		// Mostrar ventana de confirmación
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        // Obtener respuesta del usuario
        if (respuesta == JOptionPane.YES_OPTION) {
        	JOptionPane.showMessageDialog(null, "Saliendo del programa", null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("El usuario seleccionó 'Sí'.");
            // Aquí puedes incluir el código para realizar la acción de salida
        } else {
        	programa();
        	metodoRecursivo(respuesta);
            System.out.println("El usuario seleccionó 'No'.");
            // Aquí puedes incluir el código para continuar con la ejecución del programa
        }
	}
	public static void programa() {
		//ventana de escoger que quiere utilizar el conversor
		 String[] opciones = {"Conversor de ASCCII", "Conversor de Temperatura", "Conversor de Moneda"};
		 JComboBox<String> comboBox = new JComboBox<>(opciones);
		 JOptionPane.showMessageDialog(null, comboBox, "Selecciona una opción", JOptionPane.QUESTION_MESSAGE);
		 String opcionSeleccionada = (String) comboBox.getSelectedItem();
		 if(opcionSeleccionada.equals("Conversor de Moneda")) {
			 String[] convertirMoneda = {"De pesos colombianos a Libra", "De pesos colombianos a Dolar","De pesos colombianos a Won sul-Coreano",
					 "De pesos colombianos a Euro","De pesos colombianos a Yen Japonés","Dolar a pesos colombianos","Euros a pesos colombianos","Libra Esterlina a pesos colombianos",
					 "Won a pesos colombianos","Yen japonés a pesos colombianos"};
			 JComboBox<String> comboBoxMoneda = new JComboBox<>(convertirMoneda);
			 JOptionPane.showMessageDialog(null, comboBoxMoneda, "Selecciona una opción", JOptionPane.QUESTION_MESSAGE);
			 String seleccion = (String) comboBoxMoneda.getSelectedItem();
			 String input = JOptionPane.showInputDialog(null, "Ingrese un valor:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
			double resultado = conversor.conversionMoneda(seleccion, input);
			 JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		 }
		 else if(opcionSeleccionada.equals("Conversor de Temperatura")) {
			 String[] convertirTemp = {"Centigrados a Kelvin", "Centigrados a Fahrenheit","Fahrenheit a Centigrados",
					 "Kelvin a Centigrados"};
			 JComboBox<String> comboBoxTemp = new JComboBox<>(convertirTemp);
			 JOptionPane.showMessageDialog(null, comboBoxTemp, "Selecciona una opción", JOptionPane.QUESTION_MESSAGE);
			 String seleccionT = (String) comboBoxTemp.getSelectedItem();
			 String inputT = JOptionPane.showInputDialog(null, "Ingrese un valor:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
			double resultado = conversor.conversionTemperatura(seleccionT, inputT);
			 JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		 }
		 else if(opcionSeleccionada.equals("Conversor de ASCCII")) {
			 String input = JOptionPane.showInputDialog(null, "Ingrese una letra:", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
			 int dato = conversor.conversionAsccii(input);
			 JOptionPane.showMessageDialog(null, "El resultado es: " + dato, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		 }
	}
}
