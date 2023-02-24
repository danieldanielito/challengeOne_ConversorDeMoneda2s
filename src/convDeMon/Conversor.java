package convDeMon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class Conversor {
	public static void main(String[] args) {
		int salida = 0;
		int m = 0;

		do {
			try {

				String[] opciones = { "conversor de monedas", "conversor de kilometros" };
				String n = (String) JOptionPane.showInputDialog(null, "elija el conversor", "conversor",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				if (n.equalsIgnoreCase("conversor de monedas")) {
					Double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto a cambiar"));

					// Map<String, CambioNombre> montocambiado = new HashMap<>();
					Curso1 curso = new Curso1();

					curso.addAlumno("de peso a dolar", new CambioNombre(monto / 377, "dolares"));
					curso.addAlumno("de dolar a peso", new CambioNombre(monto * 377, "pesos"));
					curso.addAlumno("de peso a euro", new CambioNombre(monto / 400, "euros"));
					curso.addAlumno("de euro a peso", new CambioNombre((monto * 400), "pesos"));
					curso.addAlumno("de peso a libras esterlinas", new CambioNombre(monto / 234.77, "libras"));
					curso.addAlumno("de libra esterlina a peso", new CambioNombre((monto * 234.77), "pesos"));
					curso.addAlumno("de peso a yen", new CambioNombre(monto / 1.44, "yenes"));
					curso.addAlumno("de yen a peso", new CambioNombre(monto * 1.44, "pesos"));
					curso.addAlumno("de peso a wun", new CambioNombre(monto * 6.64, "wun"));
					curso.addAlumno("de wun a peso", new CambioNombre(monto / 6.64, "pesos"));
                    
                    
					for (HashMap.Entry<String, CambioNombre> entry : curso.getCambMap().entrySet()) {
						System.out.printf(entry.getKey() + " " + entry.getValue() + "\n");
																			
					}

					ArrayList<String> curso5 = new ArrayList();
					curso5 = (ArrayList<String>) curso.getCamb();
					m = curso5.size();
					String[] cambios = new String[m];
					for (int i = 0; i < curso5.size(); i++) {

						// System.out.println(curso5.get(i));
						cambios[i] = curso5.get(i);

						// System.out.println(cambios[i]);
					}

					/*
					 * cambios =
					 * {"de dolar a peso","de peso a dolar","de euro a peso","de peso a euro",
					 * "de libra esterlina a peso", "de peso a libras esterlinas","de yen a peso",
					 * "de peso a yen","de wun a peso","de peso a wun" };
					 */
					String mone = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar", "cambio",
							JOptionPane.QUESTION_MESSAGE, null, cambios, cambios[0]);

					//montocambiado.get(mone);
					//System.out.println(montocambiado.get(mone));
					JOptionPane.showMessageDialog(null, "son " + curso.getCambMap().get(mone));

				} else {
					Double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese los kilometros a cambiar"));

					Curso1 curso = new Curso1();

					curso.addAlumno("de kilometro a metro ", new CambioNombre(monto * 1000, "metros"));
					curso.addAlumno("de kilometro a centimetro ", new CambioNombre(monto * 100000, "centimetros"));
					curso.addAlumno("de kilometro a milimetro ", new CambioNombre(monto * 1000000, "milimetros"));
					curso.addAlumno("de kilometro a decimetro ", new CambioNombre(monto * 10000,"decimetros"));

					ArrayList<String> curso5 = new ArrayList();
					curso5 = (ArrayList<String>) curso.getCamb();
					m = curso5.size();
					String[] cambios = new String[m];
					for (int i = 0; i < curso5.size(); i++) {

						// System.out.println(curso5.get(i));
						cambios[i] = curso5.get(i);

						// System.out.println(cambios[i]);
					}

					// String[] cambios = {"de kilometro a metro ","de kilometro a centimetro ","de
					// kilometro a milimetro "};
					String mone = (String) JOptionPane.showInputDialog(null, "elija el cambio a realizar", "cambio",
							JOptionPane.QUESTION_MESSAGE, null, cambios, cambios[0]);

					JOptionPane.showMessageDialog(null, "son " + curso.getCambMap().get(mone));
				}
				salida = JOptionPane.showConfirmDialog(null, " desea volver al menu?");

			} catch (Exception e) {
				System.out.println(e.getMessage());
				salida = JOptionPane.showConfirmDialog(null,
						"ud ha decidido cancelar la operacion, desea volver al menu?");
			}
		} while (salida == 0);

		JOptionPane.showMessageDialog(null, "salir");

	}
}
