package reviewSiteFullStack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Weather {
	@Id
	@GeneratedValue
	private Long id;

	private String weather;

	@OneToMany(mappedBy = "weather")
	private Set<Country> countryByWeather; // used for individual pages ex: author.html, genre.html

	// constructors
	protected Weather() {
	}

	public Weather(String weather) {
		this.weather = weather;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getWeather() {
		return weather;
	}

	public Set<Country> getCountryByWeather() {
		return countryByWeather;
	}

	// setters
	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return weather;
	}

}
