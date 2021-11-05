package Capitulo_07_Arrays_and_Lists;

public class ArrayCalcularNotasNovoTest {

	public static void main(String[] args) {
		
		// Array de notas dos alunos
		int[] gradesArray = { 87,68, 94, 100, 83, 78, 85, 91, 76, 87};
		ArrayCalcularNotasNovo myGradeBook = new ArrayCalcularNotasNovo(
				"CS101 Introdução a Programação Java", gradesArray);
		System.out.printf("Bem-vindo as notas para%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();

	}

}

