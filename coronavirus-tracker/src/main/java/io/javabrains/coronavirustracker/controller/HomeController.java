package io.javabrains.coronavirustracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.javabrains.coronavirustracker.CoronavirusTrackerApplication;
import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.service.CoronavirusTrackerService;

@Controller
public class HomeController {

	@Autowired
	private CoronavirusTrackerService service;
	
	
	@GetMapping("/")
	public String home(Model model) {
		
		List<LocationStats> allstStats = service.getAllStats();
		
		long totalcases = allstStats.stream().mapToLong(stat -> stat.getConfirmedCases()).sum();
		long totalNewcases = allstStats.stream().mapToLong(stat -> stat.getDiffromprevday()).sum();
		model.addAttribute("locationStats", allstStats);
		model.addAttribute("totalcases", totalcases);
		model.addAttribute("totalNewcases", totalNewcases);
		return "home";
	}
	
}
