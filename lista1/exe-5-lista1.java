import java.util.Scanner;

 

public class Exe5 {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Scanner ler = new Scanner(System.in);

		

		System.out.println("Quantas disciplinas você tem nesse semestre?");

		int nDisciplinas = ler.nextInt();

		

		System.out.println("Qual a média de aprovação? ");

		double media = ler.nextDouble();		

		

		

		String[] disciplina = new String[nDisciplinas];

		Double[] n1 = new Double[nDisciplinas];

		Double[] n2 = new Double[nDisciplinas];

		Double[] trabalho = new Double[nDisciplinas];

		

		System.out.println("");

		for(int i=0; i < nDisciplinas; i++) {

			ler.nextLine();

			System.out.println("Digite o nome da disciplina " + (i + 1) + ": ");

			disciplina[i] = ler.nextLine();

			

			System.out.println("Digite a primeira nota da disciplina " + disciplina[i] + ": ");

			n1[i] = ler.nextDouble();

			

			System.out.println("Digite a segunda nota da disciplina " + disciplina[i] + ": ");

			n2[i] = ler.nextDouble();

			

			System.out.println("Digite a nota do trabalho da disciplina " + disciplina[i] + ": ");

			trabalho[i] = ler.nextDouble();

		}		

		

		System.out.println("- BOLETIM DO ALUNO - ");

		for(int i=0; i < nDisciplinas; i++) {

			Double mediaD = (n1[1] + n2[i] + trabalho[i]) / 3.0;

			if(mediaD >= media) {

				System.out.println("Disciplina " + disciplina[i] + ": ");

				System.out.println("Média: " + mediaD + ": ");

				System.out.println("APROVADO!");

			}

			else {

				System.out.println("Disciplina " + disciplina[i] + ": ");

				System.out.println("Média: " + mediaD + ": ");

				System.out.println("REPROVADO!");

			}

		}

	}

 

}