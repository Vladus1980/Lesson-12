package Ex_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void menu() {
		System.out.println("�������� 1 ��� ������ ��������");
		System.out.println("�������� 2 ��� �������� ��������");

	}

	public static void main(String[] args) {
		menu();
		MyArrayList MAL = new MyArrayList(10);
		List myArray = new ArrayList<>();
		{

		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			switch (sc.next()) {
			case "1": {
				System.out.println("������� ���� ��������");
				myArray.add(sc.next());
				{
					MAL.addListElement();
					menu();

				}

				System.out.println("��������: " + myArray);

			}

				break;
			case "2": {
				System.out.println("������ ������ ��������, ��� ������ ��������, �� 0 �� " + (myArray.size() - 1));
				boolean flag;
				flag = false;
				
				if (0 <= (myArray.size() - 1)){
					myArray.remove(sc.nextInt());
					menu();
					flag = true;
				System.out.println("��������: " + myArray);
				}if (!flag) {
					System.out.println("�� ����� ������� ������");
				}
			}

				break;

			default:
				System.out.println("������ ��������");
				break;
			}

		}

	}

}
