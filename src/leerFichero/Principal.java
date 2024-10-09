package leerFichero;

import java.io.FileInputStream;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("fichero.txt")) {
			leerCaracter(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leerCaracter(FileInputStream fis) throws IOException {
		int c;
		
		while ((c = fis.read()) != -1) {
			System.out.println((char) c);
		}
	}
}
