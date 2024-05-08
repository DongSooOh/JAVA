package java16;

class Test3 {
	private String msg;
	Test3(String m){
			msg = m;
	}
	
	@Deprecated
	String getMsg() {
			return msg;
	}
}

public class Code273 {
	public static void main(String[] args) {
		Test3 t = new Test3("hello");
		System.out.println(t.getMsg());
	}
}
