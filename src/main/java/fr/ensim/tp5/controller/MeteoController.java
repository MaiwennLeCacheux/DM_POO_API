package fr.ensim.tp5.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp5.model.geo.Feature;
import fr.ensim.tp5.model.openweathermap.MeteoFeature;




@Controller
public class MeteoController {
	
	private final static String API_KEY = "4a28a8adad666a688fe2435619f1fbfe";
	
	/*
	@GetMapping("/meteo")
	public String showFormAdress(Model model) {
		return "meteo";
	}
	*/
	
	@PostMapping("/meteo")
	public String obtenirAdress(@RequestParam(name="form-adresse",required=true) String adresseRenseignee, Model model) {
		model.addAttribute("nomAdresse", adresseRenseignee);
		
		//recuperation des coordonnées GPS sur l'API 
		RestTemplate restTemplate = new RestTemplate();
	    String fooResourceUrl = "https://api-adresse.data.gouv.fr/search/?q="+adresseRenseignee;
	    ResponseEntity<Feature> response = restTemplate.getForEntity(fooResourceUrl, Feature.class);
	    
	    //recuperation des coordonnées dans la reponse
	    Feature f = response.getBody();
	    double lat = f.getFeatures(0).getGeometry().getCoordinates(0);
	    double longi = f.getFeatures(0).getGeometry().getCoordinates(1);   
	    
	    //recuperation de la meteo grace aux coordonnées GPS sur l'API OpenWeatherMap
	    fooResourceUrl = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+longi+"&appid="+API_KEY;
	    ResponseEntity<MeteoFeature> response2 = restTemplate.getForEntity(fooResourceUrl, MeteoFeature.class);
	    
	    MeteoFeature mf = response2.getBody();
	    String temps = mf.getWeather(0).getDescription();
	    float temperature = mf.getMain().getTemp();
	    
	    model.addAttribute("meteo",temps);
	    model.addAttribute("temp",temperature);
	    
		return "meteo";
	}
	
	
	
}


