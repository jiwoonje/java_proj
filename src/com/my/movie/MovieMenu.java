package com.my.movie;

import java.util.Scanner;

public class MovieMenu 
{
	
	
		Scanner sc = new Scanner(System.in);
		MovieMgr mg = new MovieMgr();
		Movie m = new Movie();
		
		String title ;
		String director ;
		int grade ;
		String genre;
		
		void MovieMenu()
		{
	 out: 	do {
				System.out.println("===================");
				System.out.println("1. 영화 정보 입력");
				System.out.println("2. 영화 정보 전체 검색");
				System.out.println("3. 영화명 검색");
				System.out.println("4. 영화 감독별 검색");
				System.out.println("5. 영화 장르별 검색");
				System.out.println("6. 영화 정보 삭제");
				System.out.println("0. 종료");
				System.out.println("===================");
				System.out.println("위의 정수를 입력해 주세요>>>");
				int a = sc.nextInt();

				switch (a) {
					case 1: {
						System.out.println("1. 영화 정보 입력 메뉴입니다.");
						System.out.println("영화의 제목을 입력하세요.");
						m.setTitle(sc.next());
						System.out.println("감독의 이름을 입력하세요.");
						m.setDirector(sc.next());
						System.out.println("영화의 등급을 입력하세요.");
						m.setGrade(sc.nextInt());
						System.out.println("영화의 장르를 입력하세요.");
						m.setGenre(sc.next());
						
						mg.add(m);
						
						break;	
					}case 2: {
						mg.search();
						break;	
					}case 3:{
						mg.search(sc.next());
						break;	
					}case 4: {
						mg.searchDirector(sc.next());
						break;	
					}case 5: {
						mg.searchGenre(sc.next());
						break;	
					}case 6: {
						mg.delete(sc.nextInt());
						break;	
					}case 7: {
						break out;	
					}
						
		  		} 	
		  	}while(true);
		}
		
		
 
	
}
