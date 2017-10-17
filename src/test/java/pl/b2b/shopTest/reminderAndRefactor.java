package pl.b2b.shopTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class reminderAndRefactor {
	private List<Integer> lista = new ArrayList<Integer>();

	@Before
	public void inicjalizacjaListy() {
		lista = new ArrayList<Integer>();
		lista.add(22);
		lista.add(30);
		lista.add(63);

	}

	@Test
	public void iloscElementowParzystychWZadanejLiscie() {
		Utils utils = new Utils(lista);
		int licznik = utils.zliczIloscElementow();

		assertEquals(2, licznik);
	}

	@Test
	public void iloscElementowWZadanejLiscieKtorychSumaCyferJestWiekszaOd4() {

		Utils utils = new Utils(lista);
		int licznik = utils.iloscElementowWiekszaOd4();

		assertEquals(1, licznik);
	}
}
