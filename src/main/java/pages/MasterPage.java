package pages;

import org.openqa.selenium.WebDriver;

public class MasterPage {

	private RestaurantesPage restaurantesPage;

	public MasterPage(WebDriver navegador) {
		this.restaurantesPage = new RestaurantesPage(navegador);
	}

	public RestaurantesPage getRestaurantesPage() {
		return restaurantesPage;
	}
}
