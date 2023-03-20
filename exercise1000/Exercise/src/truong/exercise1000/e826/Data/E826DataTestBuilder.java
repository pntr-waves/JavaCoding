package truong.exercise1000.e826.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e826.model.MilkBottle;

public class E826DataTestBuilder {
	public static List<MilkBottle> getListMilkBottle() {
		List<MilkBottle> listMilkBottle = new ArrayList<>();
		listMilkBottle.add(new MilkBottle("JAX", 300, LocalDate.of(2020, 01, 26	), LocalDate.of(2023, 5, 23)));
		listMilkBottle.add(new MilkBottle("GALIO", 450, LocalDate.of(2020, 5, 23), LocalDate.of(2022, 6, 20)));
		listMilkBottle.add(new MilkBottle("GANGPLANK", 440, LocalDate.of(2023, 5, 23), LocalDate.of(2024, 1, 30)));
		listMilkBottle.add(new MilkBottle("GAREN", 550, LocalDate.of(2021, 5, 23), LocalDate.of(2025, 4, 3)));
		listMilkBottle.add(new MilkBottle("GNAR", 700, LocalDate.of(2021, 5, 23), LocalDate.of(2022, 11, 1)));
		listMilkBottle.add(new MilkBottle("GRAGAS", 500, LocalDate.of(2023, 5, 23), LocalDate.of(2025, 12, 4)));
		listMilkBottle.add(new MilkBottle("GRAVES", 203, LocalDate.of(2021, 5, 23), LocalDate.of(2022, 2, 3)));
		listMilkBottle.add(new MilkBottle("GWEN", 330, LocalDate.of(2021, 5, 23), LocalDate.of(2025, 5, 12)));
		listMilkBottle.add(new MilkBottle("HECARIM", 111, LocalDate.of(2021, 5, 23), LocalDate.of(2022, 4, 13)));
		listMilkBottle.add(new MilkBottle("HEIMERDIGER", 444, LocalDate.of(2023, 5, 23), LocalDate.of(2025, 6, 3)));
		listMilkBottle.add(new MilkBottle("YASUO", 666, LocalDate.of(2020, 5, 23), LocalDate.of(2024, 2, 1)));
		listMilkBottle.add(new MilkBottle("LUX", 832, LocalDate.of(2020, 5, 23), LocalDate.of(2025, 5, 30)));
		listMilkBottle.add(new MilkBottle("JINX", 920, LocalDate.of(2021, 5, 23), LocalDate.of(2025, 5, 2)));
		listMilkBottle.add(new MilkBottle("ZAC", 131, LocalDate.of(2020, 5, 23), LocalDate.of(2022, 12, 23)));
		listMilkBottle.add(new MilkBottle("ORIANA", 421, LocalDate.of(2021, 5, 23), LocalDate.of(2022, 10, 22)));
		listMilkBottle.add(new MilkBottle("THRESH", 123, LocalDate.of(2023, 5, 23), LocalDate.of(2025, 9, 17)));
		listMilkBottle.add(new MilkBottle("LEBLANCE", 462, LocalDate.of(2020, 1,12), LocalDate.of(2022, 1, 12)));
		listMilkBottle.add(new MilkBottle("LEESIN", 623, LocalDate.of(2020, 5, 23), LocalDate.of(2025, 4, 10)));
		listMilkBottle.add(new MilkBottle("RAMMUS", 325, LocalDate.of(2020, 5, 23), LocalDate.of(2024, 1, 11)));
		listMilkBottle.add(new MilkBottle("VLADIMIR", 256, LocalDate.of(2020, 2, 23), LocalDate.of(2024, 2, 5)));
		listMilkBottle.add(new MilkBottle("YORICK", 646, LocalDate.of(2020, 1, 23), LocalDate.of(2025, 5, 6)));
		listMilkBottle.add(new MilkBottle("TRUNDLE", 463, LocalDate.of(2020, 1, 23), LocalDate.of(2022, 5, 7)));
		listMilkBottle.add(new MilkBottle("APHELIOS", 566, LocalDate.of(2020, 1, 23), LocalDate.of(2022, 11, 22)));
		listMilkBottle.add(new MilkBottle("RUMBLE", 233, LocalDate.of(2023, 1, 23), LocalDate.of(2024, 5, 5)));

		return listMilkBottle;
	}
}
