package com.my.movie;

import java.util.Scanner;

public class MovieMenu extends MovieMgr
{
	
		MovieMgr mg = new MovieMgr();
		Scanner sc = new Scanner(System.in);
		
		String title ;
		String director ;
		int grade = 0;
		String genre;
		int select = 0;
		
		MovieMenu(){}
		
		void MovieMenu() {
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
				select = sc.nextInt();

				switch (select) {
					case 1: {
						Movie m1 = new Movie();
						System.out.println("1. 영화 정보 입력 메뉴입니다.");
						System.out.println("영화의 제목을 입력하세요.");
						m1.setTitle(sc.next());
						System.out.println("감독의 이름을 입력하세요.");
						m1.setDirector(sc.next());
						System.out.println("영화의 등급을 입력하세요.");
						m1.setGrade(sc.nextInt());
						System.out.println("영화의 장르를 입력하세요.");
						m1.setGenre(sc.next());
						
						mg.add(m1);
						break;	
					}case 2: {
						mg.search();
						break;	
					}case 3:{
						System.out.println("검색할 영화의 제목을 입력하세요.");
						mg.search(sc.next());
						break;	
					}case 4: {
						System.out.println("검색할 감독의 이름을 입력하세요.");
						mg.searchDirector(sc.next());
						break;	
					}case 5: {
						System.out.println("검색할 장르를 입력하세요.");
						genre = sc.next();
						break;	
					}case 6: {
						System.out.println("검색할 영화 제목을 입력하세요.");
						mg.delete(sc.next());
						break;	
					}case 7: {
						break out;	
					}
						
		  		} 	
		  	}while(true);
		}
		
		
 
	
}
