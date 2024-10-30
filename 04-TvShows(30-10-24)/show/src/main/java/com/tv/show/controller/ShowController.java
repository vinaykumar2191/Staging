package com.tv.show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tv.show.model.Show;
import com.tv.show.service.ShowService;

@Controller
@RequestMapping("/shows")
public class ShowController {

	@Autowired
	private ShowService showService;
	
	@GetMapping
	public String getAllShows(Model model) {
		List<Show> show = showService.getAllShows();
		model.addAttribute("shows", show);
		return "show_list";
	}
	
	@GetMapping("/add")
	public String addShowForm(Model model) {
		model.addAttribute("show", new Show());
		return "add_show";
	}
	
	@PostMapping("/add")
	public String addShow(@ModelAttribute Show show) {
		Show apiShow = showService.fetchShowDetails(show.getTitle());
		
		if(apiShow != null) {
			show.setGenres(apiShow.getGenres());
			show.setSummary(apiShow.getSummary());
			show.setPremiered(apiShow.getPremiered());
			showService.addShow(show);
		}
		
		return "redirect:/shows";
	}
	
	@GetMapping("/{id}")
	public String viewShowDetails(@PathVariable Long id, Model model) {
		Show show = showService.getShowById(id);
		model.addAttribute("show", show);
		return "show_detail";
	}
	
	@GetMapping("/{id}/edit")
	public String eidtShowForm(@PathVariable Long id, Model model) {
		Show show = showService.getShowById(id);
		model.addAttribute("show", show);
		return "show_form";
	}
	
	@PostMapping("/{id}/edit")
	public String editShow(@ModelAttribute Show show) {
		showService.updateShow(show);
		return "redirect:/shows";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteShow(@PathVariable Long id) {
		showService.deleteShowById(id);
		return "redirect:/shows";
	}
}
