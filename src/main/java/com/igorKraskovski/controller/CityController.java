package com.igorKraskovski.controller;

import com.igorKraskovski.entity.City;
import com.igorKraskovski.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CityController {

    private final CityRepository cityRepository;

    @Autowired
    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/")
    public String appPage() {
        return "app";
    }

    @GetMapping("/cityAll")
    public String getAllCities(Map<String, Object> model) {
        Iterable<City> cities = cityRepository.findAll();
        model.put("cities", cities);
        return "listCities";
    }

    @GetMapping("/city/new")
    public String addCity(Model model) {
        City city = new City();
        model.addAttribute("city", city);
        return "addCity";
    }

    @PostMapping("/city/new")
    public String createCity(City city) {
        cityRepository.save(city);
        return "redirect:/cityAll";
    }

    @GetMapping("/city/edit/{id}")
    public String editCity(@PathVariable("id") Long id, Model model) {
        model.addAttribute("city", cityRepository.getCityById(id));
        return "updateCity";
    }

    @PostMapping("/city/edit/{id}")
    public String updateCity(
            @RequestParam Long id,
            @RequestParam String cityName,
            @RequestParam String description) {
        City city = cityRepository.getCityById(id);
        if (cityName != null && !cityName.equals("")) {
            city.setCityName(cityName);
        }
        if (description != null && !description.equals("")) {
            city.setDescription(description);
        }
        cityRepository.save(city);
        return "redirect:/cityAll";
    }

    @GetMapping("/city/delete/{id}")
    @Transactional
    public String deleteCity(@PathVariable(value = "id") Long id) {
        cityRepository.deleteCityById(id);
        return "redirect:/cityAll";
    }
}
