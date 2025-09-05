package movie;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MovieService {

	ArrayList<Movie> movies = new ArrayList<Movie>();

	public ArrayList<Movie> addMovie(String name, String genre, double rating) {
		Movie movie = null;
//	    1. 영화 등록 (예외 처리)
//	    throw new~ 이부분 배운적이있었나???
//		
		try {
			if (name == null || name.isBlank()) {
				throw new IllegalArgumentException("제목이 비어있습니다.");
			}
			if (rating < 0.0 || rating > 10.0) {
				throw new IllegalArgumentException("평점은 0.0~10.0 사이여야 합니다.");
			}
			movie = new Movie(name, genre, rating);
		} catch (Exception e) {
			System.out.println("입력값 오류: " + e.getMessage());
			return null;
		}

		movies.add(movie);
		return movies;
	}

//	 2. 전체 영화 목록 출력 (forEach)
//	질문2.forEach가 반복문임은 인지하고있는데 어떻게 내가원하는걸 
//	객체를 걸러내거나 바꿀까 ? 람다식 표현방식 관련이였던거같은데 
	void printMoives() {
		movies.forEach(m -> {
			System.out.println(m);
		});
	}

//	3. 입력된 특정 장르만 필터링 (filter)
//	두개의 메소드중 어떤게 더 상황에맞는 메소드 인가 ????

//	public ArrayList<Movie> inPutGenrefindTitle1(String inPutGenre) {
//		ArrayList<Movie> findMovie = new ArrayList<Movie>();
//		for (Movie m : movies) {
//			if (inPutGenre.equals(m.getGenre())) {
//				findMovie.add(m);
//			}
//		}
//	if (findMovie.isEmpty()) {
//	System.out.println("해당 장르의 영화가 없습니다");
//	return null;
//}
//		return findMovie;
//	}

	public ArrayList<Movie> inPutGenrefindTitle(String inPutGenre) {
		ArrayList<Movie> findMovies = (ArrayList<Movie>) movies.stream().filter(m -> m.getGenre().equals(inPutGenre))
				.collect(Collectors.toList());

		return findMovies;

	}

//		배열을 stream으로 변환 후 바로 위 두개의 람다식 모드 (m =movies의 무비를 하나씩 꺼내서 비교) 이라는 값을가져와서 비교하는데 위에껀 문자열과 비교하고 아래껀 
//		 실수와 비교하는데 아무런 문제없이 작동함 람다식의 특징인가? stream의 특징?  
//	4. 평점 8.0 이상 영화 목록 (filter)
	public ArrayList<Movie> findOverRate() {
		ArrayList<Movie> overMovies = (ArrayList<Movie>) movies.stream().filter(m -> m.getRating() > 8.0)
				.collect(Collectors.toList());
		return overMovies;
	}

//	5. 영화 제목 리스트로만 추출 (map)
	public ArrayList<String> printTitle() {
		ArrayList<String> printTitle = (ArrayList<String>) movies.stream().map(m -> m.getTitle())
				.collect(Collectors.toList());
		return printTitle;
	}

	// 6. 최고 평점 영화 반환
	public Movie findBestMovie() {
		Movie bestMovie = movies.get(0);
		for (Movie m : movies) {
			if (m.getRating() > bestMovie.getRating()) {
				bestMovie = m;
			}
		}
		return bestMovie;
	}

	// 7. 영화 삭제
	// 영화 제목으로 찾아서 삭제
	public ArrayList<Movie> deleteMovie(String title) {
		ArrayList<Movie> updataMovie = new ArrayList<Movie>();
		for (Movie m : movies) {
			if (title.equals(m.getTitle())) {
				continue;
			}

			updataMovie.add(m);
		}
		return updataMovie;
	}

	// 8.영화 제목에 "어벤져스"가 포함된 영화만 필터링
	public ArrayList<Movie> findMovie(String title) {
		ArrayList<Movie> findMovie = new ArrayList<Movie>();
		for (Movie m : movies) {
			if (m.getTitle().contains(title)) {
				findMovie.add(m);

			}

		}
		return findMovie;
	}
	//영화 개수 출력
	void countMovies() {
		System.out.println("영화 갯수:"+movies.size());
	}
	//전체 평균 평점 계산
	void getAverageRate() {
		double total=0;
		for (Movie m : movies) {
			total+=m.getRating();
		}
		double result =(double)total/movies.size();
		System.out.println(String.format("전체 평점 평균은 %.1f", result));
	}
	

}

//6. 최고 평점 영화 반환
//평점이 가장 높은 영화 반환
//
//7. 영화 삭제
//영화 제목으로 찾아서 삭제
//영화 제목에 "어벤져스"가 포함된 영화만 필터링
//
//영화 개수 출력
//
//전체 평균 평점 계산
