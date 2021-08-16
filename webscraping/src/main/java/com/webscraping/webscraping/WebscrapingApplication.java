package com.webscraping.webscraping;



import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class WebscrapingApplication {

	public static void main(String[] args) throws IOException {
		
		String url = "https://www.imdb.com/chart/bottom";
		
		Document doc = Jsoup.connect(url).get();
		
		Element table = doc.getElementsByClass("chart full-width").first();
		
		Element tbody = table.getElementsByTag("tbody").first();
		 
	    List<Element> filmes = tbody.getElementsByTag("tr");
		
		List<Filme> filmesObjects = new ArrayList<>();
		
	    
		List<Element> tegA = new ArrayList<>();
		List<String> ListaDiretores = new ArrayList<>();
		
		
		for (Element filme: filmes) {
		
		List<Element> attributes = filme.getElementsByTag("td");
		
		
		
		 Filme filme1 = new Filme(
                 attributes.get(1).text(),
                 attributes.get(2).text()
                      
         );
		 
		 filmesObjects.add(filme1);
		
			
		}
		
		
		
		 
		 for (Filme filme1: filmesObjects) {
			 converterToJson(filme1);
		 }
		
		
	}

	private static void converterToJson(Filme filme1) throws JsonProcessingException {
	 ObjectMapper mapper = new ObjectMapper();
	 
		 String nome = filme1.getTitleColumn();
		 String nota = filme1.getRatingColumn_imdbRating();
		 System.out.println("Lista dos Piores Filmes: "+ nome + "-> Nota :"+nota );
		
		 
		
	
	}

}
