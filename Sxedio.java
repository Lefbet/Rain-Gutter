package ydrorroes;

public class Sxedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char Apanthsh = 'y';
		float Paxos, a, b1, b2 = 0, c, d1, d2 = 0, e, f;
		int Makros = 0, Aeras;
		int[] mhkh = new int[20];

		System.out.println(" ___");
		System.out.println("| e |f");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|d         _____");
		System.out.println("|         |  a");
		System.out.println("|         |");
		System.out.println("|    c    |b");
		System.out.println("|_________|\n");
		System.out.println("Parakalw eisagete tis eswterikes diastaseis ths ydrorrohs.");

		do {
			System.out.print("Paxos (mm): ");
			Paxos = My.readFloat();
			if (Paxos != 0.6f && Paxos != 0.8f && Paxos != 1 && Paxos != 1.25 && Paxos != 1.5 && Paxos != 2)
				System.out.println("To paxos den yparxei.");
		} while (Paxos != 0.6f && Paxos != 0.8f && Paxos != 1 && Paxos != 1.25 && Paxos != 1.5 && Paxos != 2);
		if (Paxos == 0.6f)
			Paxos = 0.5f;
		else if (Paxos == 0.8f)
			Paxos = 1;
		else if (Paxos == 1.25f)
			Paxos = 1.5f;
		if (Paxos < 2)
			Aeras = 1;
		else
			Aeras = 1;

		do {
			System.out.print("Pleyra a (mm): ");
			a = My.readFloat();
			if (a <= 0)
				System.out.println("Ektos oriwn.");
		} while (a <= 0);
		do {
			System.out.print("Pleyra b1 (mm): ");
			b1 = My.readFloat();
			if (b1 <= 0)
				System.out.println("Ektos oriwn.");
		} while (b1 <= 0);
		float bmax = b1; // megalytero b
		do {
			System.out.print("Pleyra c (mm): ");
			c = My.readFloat();
			if (c <= 0)
				System.out.println("Ektos oriwn.");
		} while (c <= 0);
		do {
			System.out.print("Pleyra d1 (mm): ");
			d1 = My.readFloat();
			if (d1 <= 0)
				System.out.println("Ektos oriwn.");
		} while (d1 <= 0);
		float dmax = d1; // megalytero d
		do {
			System.out.print("Pleyra e (mm) [An den yparxei pathste 0]: ");
			e = My.readFloat();
			if (e < 0)
				System.out.println("Ektos oriwn.");
		} while (e < 0);
		if (e != 0) {
			do {
				System.out.print("Pleyra f (mm) [An den yparxei pathste 0]: ");
				f = My.readFloat();
				if (f < 0)
					System.out.println("Ektos oriwn.");
				else if (f == 0)
					break;
				else if (f - Paxos < 10)
					System.out.println("To f einai poly mikro, parakalw megalwste to.");
			} while (f < 0 || f - Paxos < 10);
		} else
			f = 0;

		do {
			System.out.print("Exei rhsh (y/n)? ");
			Apanthsh = Character.toLowerCase(My.readChar());
			if (Apanthsh != 'y' && Apanthsh != 'n')
				System.out.println("Lanthasmenh apanthsh.");
		} while (Apanthsh != 'y' && Apanthsh != 'n');

		if (Apanthsh == 'y') { // An h ydrorroh exei rhsh
			System.out.println("Parakalw eisagete b2, d2.");
			do {
				System.out.print("Pleyra b2 (mm): ");
				b2 = My.readFloat();
				if (b2 <= 0)
					System.out.println("Ektos oriwn.");
			} while (b2 <= 0);
			if (b2 > bmax)
				bmax = b2; // megalytero b
			do {
				System.out.print("Pleyra d2 (mm): ");
				d2 = My.readFloat();
				if (d2 <= 0)
					System.out.println("Ektos oriwn.");
			} while (d2 <= 0);
			if (d2 > dmax)
				dmax = d2; // megalytero d
			do {
				System.out.print("Makros (mm): ");
				Makros = My.readInt();
				if (Makros <= 0)
					System.out.println("Ektos oriwn.");
			} while (Makros <= 0);
		} // Telos eisagwghs stoixeiwn

		// Enarksh algorithmou ypologismou kopwn kai pathmatwn

		if (Apanthsh == 'n') { // H ydrorroh den exei rhsh
			float Synolo = a + b1 + c + d1 + e + f;
			System.out.println("\nKOPES\n");
			System.out.println("Megalh pleyra: " + Math.round(Synolo - Paxos));
			System.out.print("Shmadema: ");
			System.out.print(a + " toumpa " + b1 + " - " + (b1 + c));
			if (e == 0)
				System.out.println();
			else {
				if (f == 0)
					System.out.println(" - " + (b1 + c + d1));
				else
					System.out.println(" - " + (b1 + c + d1) + " - " + (b1 + c + d1 + e));
			}	

			System.out.print("Mikrh pleyra: ");
			if (e == 0)
				System.out.println(Math.round(Synolo - Paxos * 3 - Aeras));
			else {
				if (f == 0)
					System.out.println(Math.round(Synolo - Paxos * 5 - Aeras * 2));
				else
					System.out.println(Math.round(Synolo - Paxos * 7 - Aeras * 3));
			}
			System.out.print("Shmadema: ");
			System.out.print((a + Paxos) + " toumpa " + b1 + " - " + (b1 + c - Paxos * 2 - Aeras));
			if (e == 0)
				System.out.println();
			else {
				if (f == 0)
					System.out.println(" - " + (b1 + c + d1 - Paxos * 4 - Aeras * 2));
				else
					System.out.println(" - " + (b1 + c + d1 - Paxos * 4 - Aeras * 2) + " - " + (b1 + c + d1 + e - Paxos * 6 - Aeras * 3));
			}
		} // Den exei rhsh

		else { // H ydrorroh exei rhsh
			float Synolo1 = a + b1 + c + d1 + e + f;
			float Synolo2 = a + b2 + c + d2 + e + f;
			float max = Synolo2;
			float min = Synolo1;
			if (Synolo1 > max) {
				max = Synolo1;
				min = Synolo2;
			}
			System.out.println("\nArxh ydrorrohs: " + Math.round(min - Paxos));
			System.out.println("Telos ydrorrohs: " + Math.round(max - Paxos) + "\n");

			System.out.println("Ti lamarines tha xrhsimopoihthoun (megalh pleyra pros mikrh)?");
			int tempMakros;
			do {
				tempMakros = Makros;
				for (int i = 0; i < mhkh.length; i++) {
					do {
						System.out.print("Makros " + (i + 1) + "hs lamarinas (mm) [Ypoleipontai " + tempMakros + " mm]: ");
						mhkh[i] = My.readInt();
						if (mhkh[i] <= 0 || mhkh[i] > 3000)
							System.out.println("Ektos oriwn.");
					} while (mhkh[i] <= 0 || mhkh[i] > 3000);
					tempMakros -= mhkh[i];
					if (tempMakros == 0) {
						System.out.println("Ta mhkh apothikeythkan epityxws.");
						break;
					} else if (tempMakros < 0) {
						System.out.println("Adynato, epanalhpsh eisagwghs (megalh pleyra pros mikrh):");
						break;
					}
				}
			} while (tempMakros < 0);

			int Arithmos_kommatiwn = 0;
			for (int j = 0; j < mhkh.length; j++) {
				if (mhkh[j] != 0)
					Arithmos_kommatiwn++;
			}

			float Diafb_ana_mm = Math.abs(b2 - b1) / Makros;
			float Diafd_ana_mm = Math.abs(d2 - d1) / Makros;
			float Megalh_pleyra = max;
			float Mikrh_pleyra = max;
			float bnext = bmax;
			float dnext = dmax;

			System.out.println("\nKOPES");
			for (int k = 0; k < Arithmos_kommatiwn; k++) {
				float Diafb_ana_kommati = Math.round(Diafb_ana_mm * mhkh[k]);
				float Diafd_ana_kommati = Math.round(Diafd_ana_mm * mhkh[k]);

				Mikrh_pleyra -= Diafb_ana_kommati + Diafd_ana_kommati;

				System.out.println("\n" + (k + 1) + "o KOMMATI [" + mhkh[k] + " mm]:");
				if (k == 0) {
					System.out.println("Megalh pleyra: " + Math.round(Megalh_pleyra - Paxos));
					System.out.print("Shmadema: ");
					System.out.print(a + " toumpa " + bmax + " - " + (bmax + c));
					if (e == 0)
						System.out.println();
					else {
						if (f == 0)
							System.out.println(" - " + (bmax + c + dmax));
						else
							System.out.println(" - " + (bmax + c + dmax) + " - " + (bmax + c + dmax + e));
					}
				} else {
					System.out.print("Megalh pleyra: ");
					if (e == 0)
						System.out.println(Math.round(Megalh_pleyra - Paxos * 3 - Aeras));
					else {
						if (f == 0)
							System.out.println(Math.round(Megalh_pleyra - Paxos * 5 - Aeras * 2));
						else
							System.out.println(Math.round(Megalh_pleyra - Paxos * 7 - Aeras * 3));
					}
					System.out.print("Shmadema: ");
					System.out.print((a + Paxos) + " toumpa " + bnext + " - " + (bnext + c - Paxos * 2 - Aeras));
					if (e == 0)
						System.out.println();
					else {
						if (f == 0)
							System.out.println(" - " + (bnext + c + dnext - Paxos * 4 - Aeras * 2));
						else
							System.out.println(" - " + (bnext + c + dnext - Paxos * 4 - Aeras * 2) + " - " + (bnext + c + dnext + e - Paxos * 6 - Aeras * 3));
					}
				}

				bnext -= Diafb_ana_kommati;
				dnext -= Diafd_ana_kommati;

				System.out.println("Mikrh pleyra: " + Math.round(Mikrh_pleyra - Paxos));
				System.out.print("Shmadema: ");
				System.out.print(a + " toumpa " + bnext + " - " + (bnext + c));
				if (e == 0)
					System.out.println();
				else {
					if (f == 0)
						System.out.println(" - " + (bnext + c + dnext));
					else
						System.out.println(" - " + (bnext + c + dnext) + " - " + (bnext + c + dnext + e));
				}

				Megalh_pleyra -= Diafb_ana_kommati + Diafd_ana_kommati;
			}
		} // Exei rhsh

	}// main

}// Sxedio
