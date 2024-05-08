package javaCollectionFramework;

import java.util.List;
import java.util.Vector;

class Board {
	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}

public class VectorExample {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();

		list.add(new Board("제목1", "내용1", "글쓴이1")); // [0]
		list.add(new Board("제목2", "내용2", "글쓴이2")); // [1]
		list.add(new Board("제목3", "내용3", "글쓴이3")); // [2] 제거
		list.add(new Board("제목4", "내용4", "글쓴이4")); // [3] → [2] 
		list.add(new Board("제목5", "내용5", "글쓴이5")); // [4] → [3] 제거

		list.remove(2); // "제목3~글쓴이3" 제거
		list.remove(3); // "제목5~글쓴이5" 제거
		

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
