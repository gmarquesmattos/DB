package ServicesTest;

import java.util.Random;

public class GeneratorString {





		public static String GerName2() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String Name[] = { "Joao", "Pedro", "Maria", "jose", "Juca", "Cecília", "Samuel", "Eloá", "Enzo", "Gabriel",
					"Lara", "João", "Miguel", "Júlia", "Henrique", "Isadora", "Gustavo", "Mariana", "Murilo", "Emanuelly",
					"Henrique" }, vc ="", nome ="";

			Random random = new Random();
			for (i = 0; i <= 0; i++) {
				nrAleatorioVogal = 0 + random.nextInt(21);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(16);// escolhe pos de 0 a 19
				vc = Name[nrAleatorioVogal];
				nome = nome+vc;
			}

			return nome;

		}
	
		
		
		public static String LastName() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String Name[] = { "Joao", "Pedro", "Maria", "jose", "Juca", "Cecília", "Samuel", "Eloá", "Enzo", "Gabriel",
					"Lara", "João", "Miguel", "Júlia", "Henrique", "Isadora", "Gustavo", "Mariana", "Murilo", "Emanuelly",
					"Henrique" }, vc ="", nome ="";

					
			Random random = new Random();
			for (i = 0; i <= 0; i++) {
				nrAleatorioVogal = 0 + random.nextInt(21);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(16);// escolhe pos de 0 a 19
				vc = Name[nrAleatorioVogal];
				nome = nome+vc;
			}

			return nome;

		}
		
		
		
		
		
		
		
		public static String Email() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String Name[] = { "mail1", "mail12", "mail13", "mail14", "mail15", "mail16", "mail17", "mail18", "mail19", "mail110",
					"mail111", "mail112", "mail113", "mail114", "mail115", "mail116", "mail117", "mail119", "mail120", "mail121",
					"mail122" }, vc ="", nome ="";

				
			Random random = new Random();
			for (i = 0; i <= 0; i++) {
				nrAleatorioVogal = 0 + random.nextInt(21);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(16);// escolhe pos de 0 a 19
				vc = Name[nrAleatorioVogal];
				nome = nome + vc;
			}

			return nome;

		}
		
		
		
		
				

		public static String ObsContract() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { " Teste automático", " NeoGrid" }, vc = "", nome = "",
					consoante[] = { " xxxxxxxxxxxxxxxxxxxxxxxxxxxxx" };
			Random random = new Random();
			for (i = 0; i <= 2; i++) {
				nrAleatorioVogal = 0 + random.nextInt(2);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(1);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = nome + vc;

			}

			return nome;

		}

		
	///////////// Ajustar
	

}

