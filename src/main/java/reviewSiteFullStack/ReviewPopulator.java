package reviewSiteFullStack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner  {
	
	@Resource
	private WeatherRepository weatherRepo;

	@Resource
	private CountryRepository countryRepo;

	@Resource
	private FoodRepository foodRepo;

	@Override
	public void run(String... args) throws Exception {
		Weather rainy = new Weather("Rainy");
		weatherRepo.save(rainy);
		Weather hot = new Weather("Hot");
		weatherRepo.save(hot);

		Food spicy = new Food("Spicy");
		foodRepo.save(spicy);
		Food bland = new Food("Bland");
		foodRepo.save(bland);
		Food sweet = new Food("Sweet");
		foodRepo.save(sweet);
		Food savory = new Food("Savory");
		foodRepo.save(savory);

		//String countryName, String img, String reviewCategory, String reviewContent, Weather weather, Food... countryFood
		//(1993,"England", "/images/england.jpg", "Europe", "Temperate weather, rains every three days. Food can be bland, so use curry.");
		Country england = new Country( "England", "/images/england.jpg", "Europe", "Temperate weather, rains every three days. Food can be bland, so use curry.",rainy, savory, bland, sweet);
		countryRepo.save(england);
		Country malaysia = new Country("Malaysia", "/images/malaysia.jpg", "Asia", "Hot and humid, constant sweating, amazing mix of Indian, Chinese and Thai influence on the food.",hot, spicy, savory);
		countryRepo.save(malaysia);
		Country cambodia = new Country("Cambodia", "/images/cambodia.jpg", "Asia", "Hot and humid. Lots of cute kids running the streets, the occasional monkey and horse.",hot, savory, spicy);
		countryRepo.save(cambodia);
		Country mexico = new Country("Mexico","/images/mexico.jpg", "N.America", "Hot weather, amazing spicy food, watch out for cow tongue tacos. 10/10 recommend this country.",hot, spicy, savory);
		countryRepo.save(mexico);
	}
}
