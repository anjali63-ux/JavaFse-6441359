import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundExcep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

private static void testAddCountry() {
    LOGGER.info("Start");

    Country country = new Country();
    country.setCoCode("ZZ");
    country.setCoName("Zootopia");

    countryService.addCountry(country);

    try {
        Country result = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Added Country: {}", result);
    } catch (CountryNotFoundExcep e) {
        LOGGER.error("Error: {}", e.getMessage());
    }

    LOGGER.info("End");
}
