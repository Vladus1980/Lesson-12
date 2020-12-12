package Ex_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1 щоб побачити масив випадкових автомобілів");
		System.out.println("Натисніть 2 щоб заповнити масив випадкового автомобіля");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		HelmMaterial helmMaterial[] = HelmMaterial.values();
		List<HelmMaterial> helmMaterial = new ArrayList<HelmMaterial>();
			for (HelmMaterial helmMaterialValue : HelmMaterial.values()) {
				helmMaterial.add(helmMaterialValue);
		}
		

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				
				List <Auto> autoList = new ArrayList <Auto>();
//				Auto [][] AutoArrayRandom = new Auto [getRandomValues(1, 7)][getRandomValues(1, 7)];
						for (int i = 0; i < getRandomValues(1, 7); i++) {
							List<Auto> autoList2 = new ArrayList<Auto>();
							for (int ii = 0; ii < getRandomValues(1, 7); ii++) {
								autoList2.add(new Auto(getRandomValues(50, 200),
										getRandomValues(2000, 2020),
										new Helm(getRandomValues(40, 45),
												helmMaterial.get(getRandomValues(0, helmMaterial.size() - 1)).toString()),
										new Engine (getRandomValues(4, 8)))) ;
							}
					System.out.println(autoList2);
				}

				
			}

				break;
			case 2: {
				Auto a = new Auto(getRandomValues(50, 200),
						getRandomValues(2000, 2020),
						new Helm(getRandomValues(40, 45),
								helmMaterial.get(getRandomValues(0, helmMaterial.size() - 1)).toString()),
						new Engine (getRandomValues(4, 8))) ;
				
//				Auto [] AutoArrayRandom  = new Auto[getRandomValues(1, 7)];
//				Arrays.fill(AutoArrayRandom, a);
				List<Auto> AutoList3 = new ArrayList<Auto>();
				for (int i = 0; i < getRandomValues(1, 7); i++) {
				AutoList3.add(a);
				}

				System.out.println(AutoList3);
			}

				break;

			default:
				System.out.println("Ви ввели невірне значення");
				break;
			}
		}
	}
	public static int getRandomValues(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("мінімальне значення має бути меньше за максимальне");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}