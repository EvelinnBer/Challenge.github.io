package com.Conversor.Eve;

public class conversor {
  
	public static double conversionMoneda(String tipo , String monto) {
		double valor = Double.parseDouble(monto);
		
		if(tipo.equals("De pesos colombianos a Libra")) {
			return valor *0.00019;
		}
		else if(tipo.equals("De pesos colombianos a Dolar")) {
			return  valor *0.00025;
		}
        else if(tipo.equals("De pesos colombianos a Won sul-Coreano")) {
        	return  valor *0.31;
		}
        else if(tipo.equals("De pesos colombianos a Euro")) {
        	return  valor *0.00022;
		}
        else if(tipo.equals("De pesos colombianos a Yen Japonés")) {
        	return valor *0.034;
		}
        else if(tipo.equals("Dolar a pesos colombianos")) {
        	return  valor *4015.00;
        }
        else if(tipo.equals("Euros a pesos colombianos")) {
        	return valor *4515.03;
        }
        else if(tipo.equals("Libra Esterlina a pesos colombianos")) {
        	return  valor *5253.59;
        }
        else if(tipo.equals("Won a pesos colombianos")) {
        	return valor *3.18;
        }
        else if(tipo.equals("Yen japonés a pesos colombianos")) {
        	return  valor *28.97;
        }
		return 0;
	}
	public static double conversionTemperatura(String tipo , String valor) {
		int temperatura = Integer.parseInt(valor);
		if(tipo.equals("Centigrados a Kelvin")) {
			return temperatura + 273.15;
		}
		else if(tipo.equals("Centigrados a Fahrenheit")) {
			return (temperatura * 9 / 5) + 32;
		}
		else if(tipo.equals("Fahrenheit a Centigrados")) {
			return (temperatura - 32) * (5/9);
		}
		else if(tipo.equals("Kelvin a Centigrados")) {
			return temperatura - 273.15;
		}
		return 0;
	   
	}
	public static int conversionAsccii(String tipo) {
		char xd = tipo.charAt(0);
		int letra = (int)xd;
		return letra;
	}
}
