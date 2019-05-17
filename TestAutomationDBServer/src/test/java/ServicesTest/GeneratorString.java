package ServicesTest;

import java.util.Random;
public class GeneratorString {





		public static String GerName2() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String Name[] = { "Joao", "Pedro", "Maria", "jose", "Juca", "Cecília", "Samuel", "Eloá", "Enzo", "Gabriel",
					"Lara", "João", "Miguel", "Júlia", "Henrique", "Isadora", "Gustavo", "Mariana", "Murilo", "Emanuelly",
					"Henrique" }, vc = "", nome = "",

					SobreName[] = { " Silva", " Mattos", " Gonsalves", " Lima", " Aguiar", " Agostinho", " Aguiar",
							" Albuquerque", " Alegria", " Alencastro", " Baptista", " Barreto", " Barros", " Beira-Mar",
							" Belchior", " Caetano", " Calixto", };
			Random random = new Random();
			for (i = 0; i <= 0; i++) {
				nrAleatorioVogal = 0 + random.nextInt(21);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(16);// escolhe pos de 0 a 19
				vc = Name[nrAleatorioVogal] + SobreName[nrAleatorioConsoante];
				nome = nome + vc;
			}

			return nome;

		}
		/////////////////////////////////////////////////////////

		public static String GerDeliveryAddress() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "Rua Alberto Wiest", "Rua Diogo Dias Velho", "Rua Guilherme Romanus",
					"Rua Frederico Lichtenberg", "Rua Henrique Albrecht", "Rua dos Caetés", "Rua Arthur Hille",
					"Rua Francio Nicodemus", "Rua Laércio Hoffmann", "Rua Nilto Morbis", "Rua João Adolfo Muller",
					"Servidão Meier", "Rua Rui Barbosa", "Rua Capão Bonito", "Rua Fernando Nunes",
					"Rua Manoel Silvério Correia", "Rua Prudentópolis", "Rua Wimar Costa", "Estrada Caminho Curto",
					"Rua Ignácio A. da Maia", "Rua Vendolino Tenfen", "Rua Professora Janir", }, vc = "",
					nome = "",

					consoante[] = { "" };
			Random random = new Random();
			for (i = 0; i <= 1; i++) {
				nrAleatorioVogal = 0 + random.nextInt(22);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(1);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = vc;
			}

			return nome;

		}

		public static String AddressNeighborhood() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "Adhemar Garcia", "América", "Anita Garibaldi", "Atiradores", "Aventureiro", "Boa Vista",
					"Boehmerwald", "Bom Retiro", "Bucarein", "Centro", "Comasa", "Costa e Silva", "Espinheiros", "Fátima",
					"Floresta", "Glória", "Guanabara", "Iririú", "Itaum", "Itinga", "Parque Guarani", "Jardim Iririú",
					"Jardim Paraíso", "Jardim Sophia", }, vc = "", nome = "",

					consoante[] = { "" };
			Random random = new Random();
			for (i = 0; i <= 1; i++) {
				nrAleatorioVogal = 0 + random.nextInt(24);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(1);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = vc;
			} // for
			return nome;

		}// Metodo

		public static String AddressComplement() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "Casa", "Bloco", "Beco", }, vc = "", nome = "",
					consoante[] = { " A", " c", " 2", " 8", " h" };
			Random random = new Random();
			for (i = 0; i <= 1; i++) {
				nrAleatorioVogal = 0 + random.nextInt(3);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(5);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = vc;

			}

			return nome;

		}

		public static String AddressAddress() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "a", "e", "i", "o", "u", }, vc = "", nome = "", consoante[] = { "b", "c" };
			Random random = new Random();
			for (i = 0; i <= 2; i++) {
				nrAleatorioVogal = 0 + random.nextInt(4);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(2);// escolhe pos de 0 a 19
				vc = consoante[nrAleatorioConsoante] + vogal[nrAleatorioVogal];
				nome = nome + vc;

			}

			return nome;

		}

		public static String BillingAddressNeighborhood() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "a", "e", "i", "o", "u", }, vc = "", nome = "", consoante[] = { "b", "c" };
			Random random = new Random();
			for (i = 0; i <= 2; i++) {
				nrAleatorioVogal = 0 + random.nextInt(4);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(2);// escolhe pos de 0 a 19
				vc = consoante[nrAleatorioConsoante] + vogal[nrAleatorioVogal];
				nome = nome + vc;

			}

			return nome;
		}

		public static String BillingAddressComplement() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "a", "e", "i", "o", "u", }, vc = "", nome = "", consoante[] = { "b", "c" };
			Random random = new Random();
			for (i = 0; i <= 2; i++) {
				nrAleatorioVogal = 0 + random.nextInt(4);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(2);// escolhe pos de 0 a 19
				vc = consoante[nrAleatorioConsoante] + vogal[nrAleatorioVogal];
				nome = nome + vc;

			}

			return nome;

		}

		public static String NameContract() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "Contract", "DataSync", "Fiscal", "EDI", "EZM", "FE", "Corp", "ZE","BE","Ca", "Te","GA" }, vc = "", nome = "",
					consoante[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
							"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
							"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
							"49", "50", };
			Random random = new Random();
			for (i = 0; i <= 1; i++) {
				nrAleatorioVogal = 0 + random.nextInt(12);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(50);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = vc;

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

		public static String Feedback() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { " TESTE DE AUTOMAÇÃO", " 'NEOGRID' " }, vc = "", nome = "",
					consoante[] = { " xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", " SISTEMAS EM VERIFICAÇÃO" };
			Random random = new Random();
			for (i = 0; i <= 20; i++) {
				nrAleatorioVogal = 0 + random.nextInt(2);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(2);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = nome + vc;

			}

			return nome;

		}
	///////////// Ajustar
		public static String GerCity() {

			int i, nrAleatorioVogal, nrAleatorioConsoante;
			String vogal[] = { "Rua Alberto Wiest", "Rua Diogo Dias Velho", "Rua Guilherme Romanus",
					"Rua Frederico Lichtenberg", "Rua Henrique Albrecht", "Rua dos Caetés", "Rua Arthur Hille",
					"Rua Francio Nicodemus", "Rua Laércio Hoffmann", "Rua Nilto Morbis", "Rua João Adolfo Muller",
					"Servidão Meier", "Rua Rui Barbosa", "Rua Capão Bonito", "Rua Fernando Nunes",
					"Rua Manoel Silvério Correia", "Rua Prudentópolis", "Rua Wimar Costa", "Estrada Caminho Curto",
					"Rua Ignácio A. da Maia", "Rua Vendolino Tenfen", "Rua Professora Janir", }, vc = "",
					nome = "",

					consoante[] = { "" };
			Random random = new Random();
			for (i = 0; i <= 1; i++) {
				nrAleatorioVogal = 0 + random.nextInt(22);// escolhe uma pos de 0 a 4
				nrAleatorioConsoante = 0 + random.nextInt(1);// escolhe pos de 0 a 19
				vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante];
				nome = vc;
			}

			return nome;

	







	} // Classe

}

