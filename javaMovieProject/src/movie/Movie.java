package movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// ��ȭ ���� ����, ��ȭ�� ���� ������� ���
public class Movie {
					
	List<String> movies = new ArrayList<>();
	List<Long> movieStamps = new ArrayList<>();
	List<String> genres = new ArrayList<>();
	
	public void defaultMovies() {
	    long currentTimeInSeconds = System.currentTimeMillis() / 1000;
	    movies.clear(); 
	    
	    movies.add("��");
	    movieStamps.add(currentTimeInSeconds); 
	    genres.add("��Ÿ��");
	    
	    movies.add("�Ĺ�");
	    movieStamps.add(currentTimeInSeconds + 1);
	    genres.add("������");
	    
	    movies.add("��Ǫ�Ҵ�");
	    movieStamps.add(currentTimeInSeconds + 2);
	    genres.add("�ִϸ��̼�");
	    
	    movies.add("���˵���");
	    movieStamps.add(currentTimeInSeconds + 3);
	    genres.add("�׼�");
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
	        System.out.println("��ȭ ������ ���Ϸ� �����߽��ϴ�.");
	    } catch (IOException e) {
	        System.out.println("��ȭ ������ ���Ϸ� �����ϴ� ���� ������ �߻��߽��ϴ�." + e.getMessage());
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
	        System.out.println("���Ͽ��� ��ȭ ������ �ҷ��Խ��ϴ�.");
	    } catch (FileNotFoundException e) {
	        System.out.println("��ȭ ������ �ҷ����� ���� ������ ã�� �� �����ϴ�." + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("���Ͽ��� ��ȭ ������ �ҷ����� ���� ������ �߻��߽��ϴ�." + e.getMessage());
	    }
	}
}
