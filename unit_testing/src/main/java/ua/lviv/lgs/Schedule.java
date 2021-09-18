package ua.lviv.lgs;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {

Set<Seance> seances = new TreeSet<>();

	public Schedule(Set<Seance> seances) {
		super();
		this.seances = seances;
	}
	
	public void addSeance(Seance seance) {
		//Iterator<Seance> iterator = seances.iterator();
		//while (iterator.hasNext()) {
			//Seance seance2 = (Seance) iterator.next();
			//System.out.println("Додано сеанс: "+ seances);
		//}
		seances.add(seance);
	}
	
	public void removeSeance(Seance seance) {
		//Iterator<Seance> iterator = seances.iterator();
		//while (iterator.hasNext()) {
			//Seance seance2 = (Seance) iterator.next();
			//System.out.println("Сеанс видалено: "+ seances);
		//}
		seances.remove(seance);
	}

	@Override
	public String toString() {
		return "Schedule [seances=" + seances + "]";
	}
	
	
}
