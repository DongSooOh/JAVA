package javaProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		// YYYY: ��, yyyy: ������ �⵵
		// DD: '�� �� ��'(������ ���ۺ��� ���� ��¥������ ���� �� ��), dd: '�� �� ��'(���� �������� ��¥)
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
		// A, a: ��ҹ��� ���� ���� ����, ���ĸ� ��Ÿ��
		// HH: 24�ð� �������� �ð�, MM: ��, SS: '�� �� ��'(1����� 365�ϱ����� ���ڷ� ǥ��)
		// hh: �ð�, mm: ��, ss: ��		
		System.out.println("���� ��¥�� " + date.format(today) + "�Դϴ�.");
		System.out.println("���� �ð��� " + time.format(today) + "�Դϴ�.");
	}
}

