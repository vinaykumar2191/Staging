package com.tv.show.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tv.show.model.Show;
import com.tv.show.model.ShowResponse;
import com.tv.show.repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	private ShowRepository show_repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String TVMAZE_API_URL = "https://api.tvmaze.com/search/shows?q="; 
	
	public List<Show> getAllShows(){
		return show_repo.findAll();
	}
	
	public Show getShowById(Long id) {
		return show_repo.findById(id).get();
	}
	
	public Show addShow(Show show) {
		return show_repo.save(show);
	}
	
	public Show updateShow(Show show) {
		return show_repo.save(show);
	}
	
	public void deleteShowById(Long id) {
		show_repo.deleteById(id);
	}
	
	public Show fetchShowDetails(String showName) {
		String showUrl = TVMAZE_API_URL + showName;
		ShowResponse[] response = restTemplate.getForObject(showUrl, ShowResponse[].class);
		
		if(response != null) {
			Show showDetail = response[0].getShow();
			Show show = new Show();
			show.setTitle(showDetail.getTitle());
			show.setPremiered(showDetail.getPremiered());
			show.setGenres(showDetail.getGenres());
			show.setSummary(showDetail.getSummary());
			
			return show;
		}
		
		return null;
	}
}
