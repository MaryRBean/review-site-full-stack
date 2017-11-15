package reviewSiteFullStack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	@Resource
	WeatherRepository weatherRepo;

	@Resource
	CountryRepository countryRepo;

	@Resource
	FoodRepository foodRepo;

	@RequestMapping("/")
	public String getAllCountriesIndex(Model model) {
		model.addAttribute("countries", countryRepo.findAll());
		return "countries-home";
	}

	@RequestMapping("/countries-home")
	public String getHomePage(Model model) {
		model.addAttribute("countries", countryRepo.findAll());
		return "countries-home";
	}

	@RequestMapping("/countries")
	public String getAllCountries(Model model) {
		model.addAttribute("countries", countryRepo.findAll());
		return "countries";
	}

	@RequestMapping("/country")
	public String getOneCountry(@RequestParam Long id, Model model) {
		model.addAttribute("country", countryRepo.findOne(id));
		return "country";
	}

	@RequestMapping("/foods")
	public String getAllFoods(Model model) {
		model.addAttribute("foods", foodRepo.findAll());
		return "foods";
	}

	@RequestMapping("/food")
	public String getOneFood(@RequestParam Long id, Model model) {
		model.addAttribute("food", foodRepo.findOne(id));
		return "food";
	}

	@RequestMapping("/allweather")
	public String getAllWeather(Model model) {
		model.addAttribute("allWeather", weatherRepo.findAll());
		return "allWeather";
	}

	@RequestMapping("/weather")
	public String getOneWeather(@RequestParam Long id, Model model) {
		model.addAttribute("weather", weatherRepo.findOne(id));
		return "weather";
	}

}
