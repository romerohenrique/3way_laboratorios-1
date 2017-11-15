package curso.oo.lab04;

public class DiasDaSemanaResposta {

	public static void main(String[] args) {

        
		String[][] dicionario = new String[7][2];

		// todo 2 - inicializa o array dicionario para cada linha de dia
        // Lembrando que deve conter em cada linha, o correspondente em português e ingles
        // Cada linha será uma entrada no dicionário nosso
        // Exemplo para Domingo:
		dicionario[0][0] = "Segunda";
		dicionario[0][1] = "Monday";
		
		dicionario[1][0] = "Terça";
		dicionario[1][1] = "Tuesday";
		
		dicionario[2][0] = "Quarta";
		dicionario[2][1] = "Wenesdays";
		
		dicionario[3][0] = "Quinta";
		dicionario[3][1] = "thursday";
		
		dicionario[4][0] = "Segunda";
		dicionario[4][1] = "Monday";
		
		dicionario[5][0] = "Segunda";
		dicionario[5][1] = "Monday";
		
		dicionario[6][0] = "Sexta";
		dicionario[6][1] = "Friday";
		
		
		dicionario[7][0] = "Sábado";
		dicionario[7][1] = "Saturday";

        // imprime a traducao de portugues-ingles dos dias da semana
        System.out.println("\nPORTUGUES - INGLES");
        // todo 3 - altere para obter duas variaveis, um contador para percorrer as linhas e outro para colunas
        for (int i = 0; i < dicionario.length; i++) {
            // todo 4 - altere para mostrar o valor em português e outro em inglês
            // Lembrando que o Português é a primeira coluna e inglês o da segunda coluna
            System.out.println(dicionario[i] + " - " + dicionario[i]);
        }
	}
}
