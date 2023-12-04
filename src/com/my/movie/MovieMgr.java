package com.my.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr extends Movie {

	private List<Movie> movies ;
	Movie m = new Movie();
	
	MovieMgr(){
		this.movies = new ArrayList<>();
	}

	void add (Movie m) {
		movies.add(m);
		System.out.println("영화 제목 : " + m.getTitle() + ", 영화 감독 : " + m.getDirector() + ", 영화 등급 : " + m.getGrade() + ", 영화 장르 : " + m.getGenre() );
	}
	
	void search() {
		for (int i = 0 ; i < movies.size(); i++ ) {
			System.out.println(movies.get(i));
		}
	}
	
	void search(String title) {
		for (int i = 0 ; i < movies.size(); i++ ) {
			if (movies.get(i).getTitle().equals(title)==true) {
				movies.get(i);
			}
		}
	}
	
	void searchDirector(String director) {
		System.out.println("찾을 영화의 감독 이름을 입력하세요 >>>");
		for (int i = 0 ; i < movies.size(); i++ ) {
			if (m.getDirector().equals(director) || m.getDirector().contains(director)) {
				movies.get(i);
			}
		}
	}
	
	void searchGenre(String genre) {
		System.out.println("찾을 영화의 장르를 입력하세요 >>>");
		for (int i = 0 ; i < movies.size(); i++ ) {
			if (m.getGenre().equals(genre) || m.getGenre().contains(genre)) {
				movies.get(i);
			}
		}
	}
	
	void delete(int i) {
		movies.remove(i);
	}
		
	
}

