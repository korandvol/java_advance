package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import ua.lviv.lgs.Time.TimeException;

public class Application {

	public static void main(String[] args) throws TimeException {
		Cinema cinema = new Cinema(null, null, null, null);
		Schedule schedule;
		Time time = new Time(10, 10);
		Movie movie = new Movie("Великий Гетсбі", new Time(20, 10));

		Seance seance = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Вітаємо у кінотеатрі!");
			System.out.println();
			System.out.println("Натисність 1 для перевірки розкладу");
			System.out.println("Натисність 2 - створити новий сеанс");
			System.out.println("Натисність 3 - додати фільм");
			System.out.println("Натисність 4 для видалення сеансу");
			System.out.println("Натисність 5 для видалення фільму");
			System.out.println("Натисність 0 для виходу");
			System.out.println();

			int i = sc.nextInt();
			switch (i) {
			case (1):
				System.out.println("Розклад: ");

				for (Days days : Days.values()) {
					System.out.println();
					System.out.println(days);
					schedule = cinema.getSchedules().get(days);
					cinema.getSchedules();
				}
				// cinema.getSchedules();
				break;

			case (2): {
				System.out.println("Ви створите новий сеанс: ");
				for (Days days : Days.values()) {
					// cinema.addMovie(movie, time);
					cinema.addSeance(seance, null);
				}
				

				break;
			}
			case 3: {
				System.out.println("Ви додасьте новий фільм до вашого сеансу: ");
				System.out.println();
				cinema.addMovie(movie, time);
				break;
			}

			case 4: {
				System.out.println("Ви видалите сеанс: ");
				System.out.println();
				for (Days days : Days.values()) {

					cinema.removeSeance(seance, null);
					break;
				}

			}

			case 5: {
				System.out.println("Ви видалите фільм з сеансу:  ");
				System.out.println();
				cinema.removeMovie(movie);
				break;
			}
			case 0: {
				System.out.println("Дякуємо, що користуєтесь нашим кінотеатром!");
				System.exit(0);
				break;
			}
			default:
				System.err.println("Введіть цифри з 0 - 5");
				break;
			}

		}
	}

}
