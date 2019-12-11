package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardapioPage {

	private WebDriver navegador;

	public CardapioPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void detalhes_restaurante() {
		navegador.findElement(By.id("detail")).findElement(By.xpath(""));
	}

	public void adicionar_produto(Map<String, Integer> map) {

		for (String produto : map.keySet()) {
			for (int i = 0; i < map.get(produto); i++) {
				navegador.findElement(By.xpath("//span[text()=\"" + produto + "\"]/following-sibling::a")).click();
			}
		}

	}
	
	

}
