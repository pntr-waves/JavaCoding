package exercise438;

public class EnforcingPrivacyWithCrytography {
	
//	The explosive growth of Internet communications
//	and data storage on Internet-connected computers has greatly increased privacy concerns. The field
//	of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
//	advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
//	simple scheme for encrypting and decrypting data. A company that wants to send data over the In-
//	ternet has asked you to write a program that will encrypt it so that it may be transmitted more se-
//	curely. All the data is transmitted as four-digit integers. Your application should read a four-digit
//	integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
//	to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
//	with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
//	a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
//	encryption scheme) to form the original number. [Optional reading project: Research “public key
//	cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
//	also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
			
	public static void main(String[] args) {
		int data = 2542;
		int encrytedValue = encryted(data, 7);
		System.out.println("encryted data from " + data + " -> " + encrytedValue);
	}

	public static int encryted(int data, int key) {
		int[] a = listDigit(data);
		int index = 0;
		while (index < a.length) {
			a[index] += key;
			index++;
		}
		int newData = Integer.parseInt(makeNewData(a, false));
		newData /= 10;
		a = listDigit(newData);
		int lastData = Integer.parseInt(makeNewData(a, true));
		return lastData;
	}

	private static int[] listDigit(int newData) {
		int divide = 1000;
		int[] array = {0,0,0,0};
		int index = 0;
		int temp = newData;
		while (divide > 0) {
			array[index] = temp / divide;
			temp -= array[index]*divide;
			divide /= 10;
			index++;
		}
		return array;
	}

	public static String makeNewData(int[] array, boolean swap) {
		if (swap) {
			return String.valueOf(array[0]) + String.valueOf(array[3])  + String.valueOf(array[2]) + String.valueOf(array[1]);
		} else {
			return String.valueOf(array[0]) + String.valueOf(array[1])  + String.valueOf(array[2]) + String.valueOf(array[3]);
		}
	}
}
