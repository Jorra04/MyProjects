package Optionals;
import java.util.*;
public class main {
	public static void main(String[] args) {
		List<String> ICountries= new ArrayList();
		String[] countries = new String[] {
				"Canada","United States",
				"Mexico",null,
				"Italy",null,
				"India",null
		};
		Optional<String> checker;
		for(String country : countries) {
			checker = Optional.ofNullable(country);
			if(checker.isPresent()) {
				if(country.startsWith("I")) {
					ICountries.add(country);
				}
			}
		}
		System.out.println(ICountries);
		//Null pointer nonesense
//		List<String> ICountries = new ArrayList();
//		String[] countries = new String[] {
//				"Canada","United States",
//				"Mexico",null,
//				"Italy",null,
//				"India",null
//		};
//		Optional<String> checker;
//		for(String country : countries) {
//			if(country.startsWith("I")) {
//				ICountries.add(country);
//			}
//		}
//		System.out.println(ICountries);
	}
}
