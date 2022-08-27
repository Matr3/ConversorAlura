package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a Dólar": 
		monedas.ConvertirPesosArgentinoDolares(valor);
		break;
	
	case "De Pesos a Euro": 
		monedas.ConvertirPesosArgentinoEuros(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		monedas.ConvertirPesosArgentinoLibra(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		monedas.ConvertirPesosArgentinoYen(valor);
		break;
		
	case "De Pesos a Won sub-coreano":
		monedas.ConvertirPesosArgentinoWon(valor);
		break;
	
	case "De Dólar a Pesos":
		monedas.ConvertirDolaresPesosArgentino(valor);
		break;
		
	case "De Euro a Pesos":
		monedas.ConvertirEurosPesosArgentino(valor);
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.ConvertirLibraPesosArgentino(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		monedas.ConvertirYenPesosArgentino(valor);
		break;
		
	case "De Won sub-coreano a Pesos":
		monedas.ConvertirWonPesosArgentino(valor);
		break;
	}
	}

}
