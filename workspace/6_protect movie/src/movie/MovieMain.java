package movie;

public class MovieMain {

	public static void main(String[] args) {
		MovieService service = new MovieService();
		service.addMovie("어벤져스", "히어로", 8.5);
		service.addMovie("스파이더 맨","히어로", 6.8);
		service.addMovie("국제시장", "감동", 7.0);
		service.addMovie("극한직업", "개그", 8.9);
		service.addMovie("타짜","도박", 9.9);
		service.addMovie("타짜3","도박", 3.5);
		
//		service.printMoives();
//		System.out.println(service.inPutGenrefindTitle("히어로")); 
//		System.out.println(service.inPutGenrefindTitle1("살인"));
//		System.out.println(service.findOverRate());
//		System.out.println(service.printTitle());
//		System.out.println(service.findBestMovie());
//		System.out.println(service.deleteMovie("타짜"));
//		System.out.println(service.findMovie("타"));
//		service.countMovies();
		service.getAverageRate();
	}
}
