package reviewSiteFullStack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Country {

	@Id
	@GeneratedValue
	private Long id;
	
	private String countryName;
	private String img;
	private String reviewCategory;
	private String reviewContent;

	@ManyToOne
	private Weather weather;

	@ManyToMany
	private Set<Food> countryFood; // used for individual pages ex: author.html, weather.html

	// constructors
	protected Country() {
	}

	public Country(String countryName, String img, String reviewCategory, String reviewContent, Weather weather, Food... countryFood) {
		this.countryName= countryName;
		this.img= img;
		this.reviewCategory= reviewCategory;
		this.reviewContent = reviewContent;
		this.weather = weather; 
		this.countryFood = new HashSet(Arrays.asList(countryFood));
	}

	public Country(Weather hot, String string, Food spicy, Food savory) {
		
	}

	public Country(Weather rainy, String string, Food savory, Food bland, Food sweet) {

	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public void setReviewCategory(String reviewCategory) {
		this.reviewCategory = reviewCategory;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	// getters
	public Long getId() {
		return id;
	}

	public Weather getWeather() {
		return weather;
	}

	public String getCountryName() {
		return countryName;
	}

	public Set<Food> getCountryFood() {
		return countryFood;
	}

	// setters
	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setCountryFood(Set<Food> countryFood) {
		this.countryFood = countryFood;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return countryName + ""+ img + "" + reviewCategory + "" + reviewContent + "" + weather + "" + countryName + "" + countryFood;
	}
}
