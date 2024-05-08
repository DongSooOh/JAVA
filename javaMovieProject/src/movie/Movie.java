package movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// 영화 정보 관리, 영화의 파일 입출력을 담당
public class Movie {
					
	List<String> movies = new ArrayList<>();
	List<Long> movieStamps = new ArrayList<>();
	List<String> genres = new ArrayList<>();
	
	public void defaultMovies() {
	    long currentTimeInSeconds = System.currentTimeMillis() / 1000;
	    movies.clear(); 
	    
	    movies.add("듄");
	    movieStamps.add(currentTimeInSeconds); 
	    genres.add("판타지");
	    
	    movies.add("파묘");
	    movieStamps.add(currentTimeInSeconds + 1);
	    genres.add("스릴러");
	    
	    movies.add("쿵푸팬더");
	    movieStamps.add(currentTimeInSeconds + 2);
	    genres.add("애니메이션");
	    
	    movies.add("범죄도시");
	    movieStamps.add(currentTimeInSeconds + 3);
	    genres.add("액션");
	}
	
	public void addMovie(String movieName, String movieGenre) {
		movies.add(movieName);
		genres.add(movieGenre);
	}
	
	public void removeMovie(String movieName) {
		movies.remove(movieName);
	}
	
	public List<String> getAllMovies(){
		return movies;
	}
	
	public boolean containsMovie(String movieName) {
		return movies.contains(movieName);
	}
	
	public void saveMoviesToFile() {
	    String fileName = "movies.txt";
	    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
	        for (int i = 0; i < movies.size(); i++) {
	            writer.println(movies.get(i) + "," + movieStamps.get(i) + "," + genres.get(i));
	        }
	        System.out.println("영화 정보를 파일로 저장했습니다.");
	    } catch (IOException e) {
	        System.out.println("영화 정보를 파일로 저장하는 도중 오류가 발생했습니다." + e.getMessage());
	    }
	}
	
	public void loadMoviesFromFile() {
	    String fileName = "movies.txt";
	    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 3) {
	                movies.add(parts[0]);
	                movieStamps.add(Long.parseLong(parts[1]));
	                genres.add(parts[2]);
	            }
	        }
	        System.out.println("파일에서 영화 정보를 불러왔습니다.");
	    } catch (FileNotFoundException e) {
	        System.out.println("영화 정보를 불러오는 도중 파일을 찾을 수 없습니다." + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("파일에서 영화 정보를 불러오는 도중 오류가 발생했습니다." + e.getMessage());
	    }
	}
}
