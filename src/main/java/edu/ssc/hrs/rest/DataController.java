package edu.ssc.hrs.rest;

import edu.ssc.hrs.entity.Customer;
import edu.ssc.hrs.entity.Location;
import edu.ssc.hrs.entity.service.CustomerService;
import edu.ssc.hrs.entity.service.LocationService;
import edu.ssc.hrs.utils.JsonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class DataController {
    private final CustomerService customerService;
    private final LocationService locationService;

    public DataController(CustomerService customerService, LocationService locationService) {
        this.customerService = customerService;
        this.locationService = locationService;
    }

    @GetMapping(value = "")
    public String index(Model model) {
        model.addAttribute("customerCount", customerService.count());
        model.addAttribute("locationCount", locationService.count());
        return "index";
    }

    @PostMapping("/upload")
    public String uploadAll() {

        List<Customer> customerList = JsonService.jsonToList("customer.json", Customer[].class);
        List<Location> locationList = JsonService.jsonToList("location.json", Location[].class);

        customerService.saveAll(customerList);
        locationService.saveAll(locationList);

        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteAll() {
        customerService.deleteAll();

        return "redirect:/";
    }
}