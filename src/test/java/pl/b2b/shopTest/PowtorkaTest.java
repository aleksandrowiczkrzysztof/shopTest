package pl.b2b.shopTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PowtorkaTest {

	private List<Integer> lista = new ArrayList<Integer>();
	private Utils utils;

	@Before
	public void init() {
		lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(32);
		lista.add(34);
		lista.add(36);
		utils = new Utils(lista);

	}

	@Test
	public void sprawdzCzyIloscElementowParzystychJestWiekszaOd2() {
		int licznik = utils.zliczIloscElementow();
		boolean actual = licznik > 2;
		assertEquals(true, actual);
	}

	@Test
	public void czyIloscElementowKtorychSumaCyfrJestWiekszaOd4JestWiekszaOd2() {
		int licznik = utils.iloscElementowWiekszaOd4();
		boolean actual = licznik > 2;
		assertEquals(true, actual);
	}
}
