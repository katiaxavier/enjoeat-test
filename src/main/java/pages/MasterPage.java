package pages;

import org.openqa.selenium.WebDriver;

public class MasterPage {

	private RestaurantesPage restaurantesPage;
	private CardapioPage cardapioPage;
	private CarrinhoPage carrinhoPage;

	public MasterPage(WebDriver navegador) {
		this.restaurantesPage = new RestaurantesPage(navegador);
		this.cardapioPage = new CardapioPage(navegador);
		this.carrinhoPage = new CarrinhoPage(navegador);
	}

	public RestaurantesPage getRestaurantesPage() {
		return restaurantesPage;
	}

	public CardapioPage getCardapioPage() {
		return cardapioPage;
	}

	public CarrinhoPage getCarrinhoPage() {
		return carrinhoPage;
	}
}
