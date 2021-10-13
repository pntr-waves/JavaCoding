package truong.exercise1000.e826.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.List;

import truong.exercise1000.e826.model.MilkBottle;

public class E826Service {
	public int countMilkBottleHasManufactureTimeBeforeAYear(List<MilkBottle> listMilkBottle, int yearCompare) {
		int count = 0;
		for (MilkBottle mb : listMilkBottle) {
			if (mb.getManufactureTime().getYear() < yearCompare) {
				count++;
			}
		}

		return count;
	}

	public long calculateSecondFromTimeToNow(LocalDate time) {
		long nowInSecond = LocalDate.now().toEpochSecond(LocalTime.NOON, ZoneOffset.MIN);
		long timeInSecond = time.toEpochSecond(LocalTime.NOON, ZoneOffset.MIN);

		return nowInSecond - timeInSecond;
	}

	public MilkBottle findTheNewestBottle(List<MilkBottle> listMilkBottle) {
		MilkBottle newestBottle = listMilkBottle.get(0);
		for (MilkBottle mb : listMilkBottle) {
			long timeExistOfNewest = calculateSecondFromTimeToNow(newestBottle.getManufactureTime());
			long timeExist = calculateSecondFromTimeToNow(mb.getManufactureTime());
			if (timeExist > 0 && timeExistOfNewest > timeExist) {
				newestBottle = mb;
			}
		}
		return newestBottle;
	}

	public List<MilkBottle> sortListAscendingByExpirationTime(List<MilkBottle> listMilkBottle) {
		for (int i = 0; i < listMilkBottle.size(); i++) {
			for (int j = 1; j < listMilkBottle.size() - i; j++) {
				if (calculateSecondFromTimeToNow(
						listMilkBottle.get(j - 1).getExpirationTime()) < calculateSecondFromTimeToNow(
								listMilkBottle.get(j).getExpirationTime())) {
					MilkBottle tempMB = listMilkBottle.get(j);
					listMilkBottle.set(j, listMilkBottle.get(j - 1));
					listMilkBottle.set(j - 1, tempMB);
				}
			}
		}

		return listMilkBottle;
	}

	public void printList(List<MilkBottle> list) {
		for (MilkBottle mb : list) {
			printItem(mb);
		}
	}

	public void printItem(MilkBottle mb) {
		System.out.println(String.format("Brand: %s, Manufacture: %s, Expiration: %s", mb.getBrand(),
				mb.getManufactureTime(), mb.getExpirationTime()));
	}

}
