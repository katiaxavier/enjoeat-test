package teste;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.MasterPage;
import suporte.Web;
import util.ChaveValorUtil;

public class CarrinhoTest {
	private WebDriver navegador;
	private MasterPage masterPage;

	@BeforeEach
	public void setup() {
		navegador = Web.createChrome("https://enjoeat-sp5.herokuapp.com/restaurants/bread-bakery/menu");
		masterPage = new MasterPage(navegador);

	}

	@AfterEach
	public void quit() {
		navegador.quit();
	}

	@Test
	public void deve_adicionar_uma_unidade() {

		masterPage.getCardapioPage().adicionar_produto(ChaveValorUtil.getCupCake());

		assertAll(
				() -> assertEquals("(1x) Cup Cake", masterPage.getCarrinhoPage().carrinho(ChaveValorUtil.getCupCake())),
				() -> assertEquals("R$ 8,70", masterPage.getCarrinhoPage().total()));

	}
}