package my_test01;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr extends Movie {

	int index = 0 ;
	
	List<Movie> movies = new ArrayList<>();
	
	MovieMgr(){}

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
		System.out.println("검색할 영화의 제목을 입력하세요.");
		for (int i = 0 ; i < movies.size(); i++ ) {
			if (movies.get(i).getTitle().equals(title)==true) {
				System.out.println(movies.get(i));
			}
		}
	}
	
	void searchDirector(String director) {
		System.out.println("찾을 영화의 감독 이름을 입력하세요 >>>");
		for (int i = 0 ; i < movies.size(); i++ ) {
			if (movies.get(i).getDirector().equals(director)==true) {
				System.out.println(movies.get(i));
			}
		}
	}
	
	List<Movie> searchGenre(String genre) {
		List<Movie> a = new ArrayList<>();
		for ( int i = 0 ; i < movies.size(); i++) {
			if (movies.get(i).getGenre().equals(genre)) {
				a.add(movies.get(i));
			}
		}return a;
	}
	
	void delete(String title) {
		for ( int i = 0 ; i < movies.size(); i++ ) {
			if (movies.get(i).getTitle().equals(title)==true) {
				movies.remove(i);
			}
		}
	}
		
	
}

