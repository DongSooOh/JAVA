package javaCollectionFramework;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // �ߺ��̶� �� ���� �Ұ�
		set.add("iBATIS");

		int size = set.size(); // ����Ǿ� �ִ� ��ü ��ü �� ���� 
		System.out.println("�� ��ü ��: " + size); // �ߺ��� �� ���� 4

		// Iterator<> iterator(): ����� ��ü�� �ѹ��� �������� �ݺ��� ����
		Iterator<String> iterator = set.iterator(); 
		while (iterator.hasNext()) { // hasNext(): ������ ��ü�� ������ 'true' ������ 'false' ����
			String element = iterator.next(); // next(): �÷��ǿ��� �ϳ��� ��ü�� ������
			System.out.println("\t" + element);
		}

		set.remove("JDBC"); // remove(): Set �÷��ǿ��� ��ü�� ����
		set.remove("iBATIS");

		System.out.println("�� ��ü ��: " + set.size());

		for (String element : set) { // set�� ������ �߻��� �� ������ iterator() ��� ����
			System.out.println("\t" + element);
		}

		set.clear(); // ����� ��� ��ü ����
		if (set.isEmpty()) { // isEmpty(): �÷����� ����ִ��� ����
			System.out.println("��� ����");
		}
	}
}
