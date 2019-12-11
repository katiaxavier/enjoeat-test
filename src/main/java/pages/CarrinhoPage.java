package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoPage {

	private WebDriver navegador;

	public CarrinhoPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public String total() {
		return navegador.findElement(By.xpath("//th[text()=\"Total:\"]/following-sibling::td")).getText();
	}

	public String carrinho(Map<String, Integer> map) {

		String resultado = null;
		for (String produto : map.keySet()) {

			resultado = navegador
					.findElement(By.xpath("//th[contains(text(),'(" + map.get(produto) + "x) " + produto + "')]"))
					.getText();

		}
		return resultado;
	}
}
