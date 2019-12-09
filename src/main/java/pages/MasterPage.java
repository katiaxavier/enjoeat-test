package pages;

import org.openqa.selenium.WebDriver;

public class MasterPage {

	private RestaurantesPage restaurantesPage;
	private MenuPage menuPage;

	public MasterPage(WebDriver navegador) {
		this.restaurantesPage = new RestaurantesPage(navegador);
		this.menuPage = new MenuPage(navegador);
	}

	public RestaurantesPage getRestaurantesPage() {
		return restaurantesPage;
	}

	public MenuPage getMenuPage() {
		return menuPage;
	}
}
