package usebookpkg;

public class Usebook {

	public static void main(String[] args) {
		bookpkg.Book bk = new bookpkg.Book(101, "Java", 25000);
		bk.printBookInfo(); // 다른 패키지에 있는 것을 이용하기 위해 패키지명.클래스명 작성
		System.out.println("code : " + bk.getCode());
	}

}
/* 상단에 import bookpkg.Book; or import bookpkg.*;를 작성해두면
   클래스명에 'bookpkg.Book'이 아닌 그냥 'Book'으로 사용해도 됨.
   import 패키지명.*;는 해당 패키지 아래에 있는 모든 클래스
 */
  
