
import javax.swing.JOptionPane;

public class ConversorDeMonedas {

	
	public static void main(String[] args) {

		 do {
		        String[] options = {"Conversor de Monedas", "Conversor de Temperatura"};
		        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
		        		"Seleccione una opción:", "Menu Inicial",
		        		JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		        if (opcionSeleccionada != null) {
		            if (opcionSeleccionada.equals("Conversor de Monedas")) {
		                ingresarCantidad();
		            } else if (opcionSeleccionada.equals("Conversor de Temperatura")) {
		                ingresarCantidadTemp();
		            }
		        }
		    } while (continuar());

	}
	/*METODO PARA CONTINUAR O SALIR */
	public static boolean continuar() {
	    int response = JOptionPane.showConfirmDialog(null,
	    		"¿Desea realizar otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
	    return response == JOptionPane.YES_OPTION;
	}
	/*INGRESAR LA CANTIDAD A CONVERTIR */
	public static double ingresarCantidad() {
	    double cantidad = 0;
	    String input = JOptionPane.showInputDialog(null, 
	    		"Ingrese la cantidad a convertir:", "Ingresar Cantidad", JOptionPane.PLAIN_MESSAGE);
	    if (input != null) {
	        try {
	            cantidad = Double.parseDouble(input);
	            convertirMoneda(cantidad);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, 
	            		"Error: La cantidad ingresada no es un número válido.", 
	            		"Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    return cantidad;
	}
	/*INGRESAR GRADOS DE TEMPERATURA A CONVERTIR*/
	public static double ingresarCantidadTemp() {
	    double cantidad = 0;
	    String input = JOptionPane.showInputDialog(null, 
	    		"Ingrese Grados a convertir:", "Ingresar Cantidad", JOptionPane.PLAIN_MESSAGE);
	    if (input != null) {
	        try {
	            cantidad = Double.parseDouble(input);
	            convertirTemperatura(cantidad);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, 
	            		"Error: La cantidad ingresada no es un número válido.", 
	            		"Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    return cantidad;
	}
	/* CONVERSIÓN */
	public static void convertirMoneda(double cantidad) {
		String[] monedas = {"Dólar USD a Peso MXN","Dólar USD a Euros", 
				"Dólar USD a Libras Esterlinas",
				"Dólar USD a Yen Japones",
				"Dólar USD a Rublo Ruso",
				"******","Peso MXN a Dólar USD",
				"Euros a Dólar USD", 
				"Libras Esterlinas a Dólar USD",
				"Yen Japones a Dólar USD",
				"Rublo Ruso a Dólar USD"};	
		String monedaDestino = (String) JOptionPane.showInputDialog(null, 
				"Seleccione una opción:", 
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);
	    
		if (monedaDestino != null) {
	                switch (monedaDestino) {
	                	case "Dólar USD a Peso MXN":
	                		double conversionPesoMnx = cantidad * 18.11;
	                		JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                				" USD son " + conversionPesoMnx + 
	                				" Peso MXN", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                		break;
	                    case "Dólar USD a Euros":
	                        double conversionEuros = cantidad * 0.91;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" USD son " + conversionEuros + 
	                        		" EUR", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dólar USD a Libras Esterlinas":
	                        double conversionLibras = cantidad * 0.80;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" USD son " + conversionLibras + 
	                        		" GBP", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dólar USD a Yen Japones":
	                        double conversionYen = cantidad * 131.77;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" USD son " + conversionYen + 
	                        		" JPY", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Dólar USD a Rublo Ruso":
	                        double conversionWon = cantidad * 79.30;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" USD son " + conversionWon + 
	                        		" RUB", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                        
	                        /* SECCION DE DIVISA */
	                        
	                    case "Peso MXN a Dólar USD":
	                    	double resultadoMxn = cantidad * 0.055; // 1 Dólar USD = 18.11 Peso MXN
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" Peso MXN son " + resultadoMxn + 
	                        		" Dólar USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Euros a Dólar USD":
	                    	double resultado = cantidad * 1.10; // 1 Euro = 1.10 Dólar USD
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" EUR son " + resultado + 
	                        		"Dólar USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Libras Esterlinas a Dólar USD":
	                        double conversionED = cantidad * 1.25;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" GBP son " + conversionED + 
	                        		"Dólar USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Yen Japones a Dólar USD":
	                        double conversionJD = cantidad * 0.00764;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" JPY son " + conversionJD + 
	                        		"Dólar USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    case "Rublo Ruso a Dólar USD":
	                        double conversionWD = cantidad * 0.013;
	                        JOptionPane.showMessageDialog(null, "$" + cantidad + 
	                        		" RUB Ruso son " + conversionWD + 
	                        		" Dólar USD", "Resultado", JOptionPane.PLAIN_MESSAGE);
	                        break;
	                    default:
	                        JOptionPane.showMessageDialog(null, "Error: Algo salio mal.", "Error", JOptionPane.ERROR_MESSAGE);
	              }
		}
	}
	/* Convertir a distintas escalas de temperatura*/
	public static void convertirTemperatura(double cantidad) {
		String[] temp = {"De Celsius a Fahrenheit", "De Celsius a Kelvin",
							"De Fahrenheit a Celsius","De Fahrenheit a Kelvin",
							"De Kelvin a Celsius","De Kelvin a Fahrenheit"
						};	
		String tempSelec = (String) JOptionPane.showInputDialog(null, 
				"Seleccione una opción:", "Monedas", JOptionPane.PLAIN_MESSAGE, null, temp, temp[0]);
	    
		if (tempSelec != null) {
           switch (tempSelec) {
               case "De Celsius a Fahrenheit":
                   double conversionCF = ( 9*cantidad )/5 + 32;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " C° son " + conversionCF + " F°", 
                		   "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Celsius a Kelvin":
                   double conversionCK = cantidad + 273.15;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " C° son " + conversionCK + 
                		   " K°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Celsius":
                   double conversionFC = (5*( cantidad -32) )/9 ;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " F° son " + conversionFC + 
                		   " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Fahrenheit a Kelvin":
                   double conversionFK =( (5*( cantidad -32) )/9 )+273.15;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " F° son " + conversionFK + 
                		   " K°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
              case "De Kelvin a Celsius":
                   double conversionKC = cantidad - 273.15;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " K° son " + conversionKC + 
                		   " C°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
               case "De Kelvin a Fahrenheit":
                   double conversionKF = ((cantidad - 273.15)* 9/5)+32;
                   JOptionPane.showMessageDialog(null, cantidad + 
                		   " K° son " + conversionKF + 
                		   " F°", "Resultado", JOptionPane.PLAIN_MESSAGE);
                   break;
           }
           
		}
	}

}
