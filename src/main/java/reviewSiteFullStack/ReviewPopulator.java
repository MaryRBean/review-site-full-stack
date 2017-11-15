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

		Country england = new Country(rainy, "England", savory, bland, sweet);
		countryRepo.save(england);
		Country malaysia = new Country(hot, "Malaysia", spicy, savory);
		countryRepo.save(malaysia);
		Country cambodia = new Country(hot, "Cambodia", savory, spicy);
		countryRepo.save(cambodia);
		Country mexico = new Country(hot, "Mexico", spicy, savory);
		countryRepo.save(mexico);
	}
}
