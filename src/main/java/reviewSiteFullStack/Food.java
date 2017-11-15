package reviewSiteFullStack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Food {
	
	@Id
	@GeneratedValue
	private Long id;

	private String foodType;
	
	protected Food() {
	}

	@ManyToMany(mappedBy = "foodType")
	private Set<Country> countryByFood; // used for individual pages ex: author.html, genre.html

	// constructors
	public Food(String foodType) {
		this.foodType = foodType;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getFoodType() {
		return foodType;
	}

	public Set<Country> getCountryByFood() {
		return countryByFood;
	}

	// setters
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return foodType;
	}

}
