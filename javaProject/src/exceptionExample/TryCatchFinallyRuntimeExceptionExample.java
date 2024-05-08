package exceptionExample;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) { // �迭�� �ε����� ����� ��ġ�� �����Ϸ��� �� �� �߻��ϴ� ����(�迭�� ���� �ʰ�)
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) { // ���ڿ��� ���ڷ� ��ȯ�Ϸ��� �� �� �߻��ϴ� ����(Integer.parseInt()�� ���� �޼ҵ带 ����� �� ���� ���)
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
