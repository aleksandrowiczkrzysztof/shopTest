package pl.b2b.shopTest;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	private List<Integer> lista = new ArrayList<Integer>();
public Utils(List<Integer> lista) {
	this.lista  = lista;
	
}
	public int zliczIloscElementow() {
		int licznik = 0;
		for (Integer zmienna : lista) {
			if (zmienna % 2 == 0) {
				licznik++;
			}
		}
		return licznik;
	}
	public int iloscElementowWiekszaOd4() {
		int licznik = 0;
		for (Integer zmienna : lista) {
			int liczbaJednostek = zmienna % 10;
			int liczbaDziesiatek = zmienna / 10;
			int suma = liczbaJednostek + liczbaDziesiatek;
			if (suma > 4) {
				licznik++;
			}
		}
				return licznik;
}
}
