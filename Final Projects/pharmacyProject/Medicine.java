package pharmacyProject;

import java.util.ArrayList;
import java.util.Collections;

public class Medicine {

	static void headache() {
		ArrayList<String> headacheMedicine = new ArrayList<String>();
		headacheMedicine.add("-Panadol:   1$");
		headacheMedicine.add("-Brufen:    2$");
		headacheMedicine.add("-NO Pain:   3$");
		headacheMedicine.add("-Volt_Fast: 5$");
		Collections.sort(headacheMedicine);
		for (String medicineName : headacheMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void headache(int budget) {

		String [] headacheMedicine = { "-Panadol:   1$", "-Brufen:    2$", "-NO Pain:   7$", "-Volt_Fast: 13$" };
		for (int counter = 0; counter < headacheMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(headacheMedicine[counter]);
			else if (budget > 5) {
				System.out.println(headacheMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(headacheMedicine[counter]);
				if (counter == 1)
					break;
			}
		}
	}

	static void flu() {
		ArrayList<String> fluMedicine = new ArrayList<String>();
		fluMedicine.add("-Panadol Cold and Flu: 1.8$");
		fluMedicine.add("-Snip:     2$");
		fluMedicine.add("-Eazit:    4$");
		fluMedicine.add("-Zeranase: 7$");
		Collections.sort(fluMedicine);
		for (String medicineName : fluMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void flu(int budget) {
		String[] fluMedicine = { "-Panadol Cold and Flu: 2$", "-Snip:     4$", "-Eazit:    8$", "-Zeranase: 17$" };
		for (int counter = 0; counter < fluMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(fluMedicine[counter]);
			else if (budget > 5) {
				System.out.println(fluMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(fluMedicine[counter]);
				if (counter == 1)
					break;
			}
		}
	}

	static void allergic() {
		ArrayList<String> allergicMedicine = new ArrayList<String>();
		allergicMedicine.add("-Arius:     3$");
		allergicMedicine.add("-Histal:    3$");
		allergicMedicine.add("-Clarenaze: 5$");
		allergicMedicine.add("-Xyzal:     6$");
		allergicMedicine.add("-Zyrtc:     6$");
		Collections.sort(allergicMedicine);
		for (String medicineName : allergicMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void allergic(int budget) {
		String[] allergicMedicine = { "-Arius:     3$", "-Histal:    4$", "-Clarenaze: 5$", "-Xyzal:     9$",
				"-Zyrtc:     16$" };
		for (int counter = 0; counter < allergicMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(allergicMedicine[counter]);
			else if (budget > 5) {
				System.out.println(allergicMedicine[counter]);
				if (counter == 3)
					break;
			} else {
				System.out.println(allergicMedicine[counter]);
				if (counter == 2)
					break;
			}
		}
	}

	static void fever() {
		ArrayList<String> feverMedicine = new ArrayList<String>();
		feverMedicine.add("-Panadol:  1.5$");
		feverMedicine.add("-Brufen:    2$");
		feverMedicine.add("-NO Pain:   3$");
		feverMedicine.add("-Volt_Fast: 4$");
		Collections.sort(feverMedicine);
		for (String medicineName : feverMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void fever(int budget) {
		String[] feverMedicine = { "-Panadol:  2$", "-Brufen:    4$", "-NO Pain:   6$", "-Volt_Fast: 13$" };
		for (int counter = 0; counter < feverMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(feverMedicine[counter]);
			else if (budget > 5) {
				System.out.println(feverMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(feverMedicine[counter]);
				if (counter == 1)
					break;
			}
		}
	}

	static void sinus() {
		ArrayList<String> sinusMedicine = new ArrayList<String>();
		sinusMedicine.add("-Panadol Sinus: 2$");
		sinusMedicine.add("-Nazonex N_S:   2$");
		sinusMedicine.add("-Panda Sinus:   4$");
		sinusMedicine.add("-Outroven:     5.6$");
		Collections.sort(sinusMedicine);
		for (String medicineName : sinusMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void sinus(int budget) {
		String[] sinusMedicine = { "-Panadol Sinus: 2$", "-Nazonex N_S:   2$", "-Panda Sinus:   4$",
				"-Outroven:     22$" };
		for (int counter = 0; counter < sinusMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(sinusMedicine[counter]);
			else if (budget > 5) {
				System.out.println(sinusMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(sinusMedicine[counter]);
				if (counter == 2)
					break;
			}
		}
	}

	static void jointPain() {
		ArrayList<String> jointPainMedicine = new ArrayList<String>();
		jointPainMedicine.add("-Panadol Joint: 1.7$");
		jointPainMedicine.add("-Voltaren:      2$");
		jointPainMedicine.add("-NO Pain:       3$");
		jointPainMedicine.add("-Volt_Fast:     6.5$");
		Collections.sort(jointPainMedicine);
		for (String medicineName : jointPainMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void jointPain(int budget) {
		String[] jointPainMedicine = { "-Panadol Joint: 1$", "-Voltaren:      2$", "-NO Pain:       3$",
				"-Volt_Fast:     13$" };
		for (int counter = 0; counter < jointPainMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(jointPainMedicine[counter]);
			else if (budget > 5) {
				System.out.println(jointPainMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(jointPainMedicine[counter]);
				if (counter == 2)
					break;
			}
		}
	}

	static void gerd() {
		ArrayList<String> gerdMedicine = new ArrayList<String>();
		gerdMedicine.add("-Gaviscon: 4$");
		gerdMedicine.add("-Famodar:  4$");
		gerdMedicine.add("-Eno:      6$");
		gerdMedicine.add("-Rennie:   8$");
		Collections.sort(gerdMedicine);
		for (String medicineName : gerdMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void gerd(int budget) {
		String[] gerdMedicine = { "-Gaviscon: 4$", "-Famodar:  4$", "-Eno:      6$", "-Rennie:   11$" };
		for (int counter = 0; counter < gerdMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(gerdMedicine[counter]);
			else if (budget > 5) {
				System.out.println(gerdMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(gerdMedicine[counter]);
				if (counter == 1)
					break;
			}
		}    
	}

	static void cough() {
		ArrayList<String> coughMedicine = new ArrayList<String>();
		coughMedicine.add("-Jospan:     1$");
		coughMedicine.add("-Zecuf:      2$");
		coughMedicine.add("-Mucocolvan: 2$");
		coughMedicine.add("-Heliyx:     4$");
		Collections.sort(coughMedicine);
		for (String medicineName : coughMedicine) {
			System.out.println(medicineName);
		}
		System.out.println();
	}

	static void cough(int budget) {
		String[] coughMedicine = { "-Jospan:     1$", "-Zecuf:      2$", "-Mucocolvan: 9$", "-Heliyx:     17$" };
		for (int counter = 0; counter < coughMedicine.length; counter++) {
			if (budget >= 10)
				System.out.println(coughMedicine[counter]);
			else if (budget > 5) {
				System.out.println(coughMedicine[counter]);
				if (counter == 2)
					break;
			} else {
				System.out.println(coughMedicine[counter]);
				if (counter == 1)
					break;
			}
		}
	}

}
