package exercicio_2_1;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Igor Alexandre");
		nomes.add("Dias, Marcia");
		nomes.add("Sousa, Marcos");
		nomes.add("Jorge Dias");
		NameParserCreator parser;
		
		for (String nome: nomes) {
			if(nome.contains(",")) {
				
				parser = new NomeInversoParser();
			}else {
				parser = new NomeDiretoParser();
			}
			parser.gravarNome(nome);
		}
	}

}
