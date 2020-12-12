package Ex_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void menu() {
		System.out.println("Натисніть 1 щоб додати значення");
		System.out.println("Натисніть 2 щоб видалити значення");

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
				System.out.println("Додайте нове значення");
				myArray.add(sc.next());
				{
					MAL.addListElement();
					menu();

				}

				System.out.println("Значення: " + myArray);

			}

				break;
			case "2": {
				System.out.println("Вкажіть індекс значення, яке бажаєте видалити, від 0 до " + (myArray.size() - 1));
				boolean flag;
				flag = false;
				
				if (0 <= (myArray.size() - 1)){
					myArray.remove(sc.nextInt());
					menu();
					flag = true;
				System.out.println("Значення: " + myArray);
				}if (!flag) {
					System.out.println("Ви ввели невірний індекс");
				}
			}

				break;

			default:
				System.out.println("Невірне значення");
				break;
			}

		}

	}

}
