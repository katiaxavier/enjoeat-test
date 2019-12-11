package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

	private WebDriver navegador;

	public MenuPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void detalhes_restaurante() {
		navegador.findElement(By.id("detail")).findElement(By.xpath(""));
	}

}
