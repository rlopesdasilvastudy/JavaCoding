package Capitulo_07_Arrays_and_Lists;

public class ArrayCalcularNotasNovo {

	
	private String courseName;
	private int[] grades;
	
	// Construtor
	public ArrayCalcularNotasNovo (String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}
	// configurar nome do Curso
	public String getCourseName() {
		return courseName;
	}
	// Realizar operações nos dados
	public void processGrades() {
		outputGrades();
		System.out.printf("%nMédia da classe é %.2f%n", getAverage());
		System.out.printf("A nota mais baixa é %d%nA nota mais alta é %d%n%n", getMinimum(), getMaximum());
		// Imprimir o gráfico de distribuição das notas
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowGrade = grades[0];
		for (int grade : grades) {
			if (grade < lowGrade)
				lowGrade = grade;
		}
		return lowGrade;
	}
	
	public int getMaximum() {
		int highGrade = grades[0];
		for (int grade : grades) {
			if (grade < highGrade)
				highGrade = grade;
		}
		return highGrade;
	}
	
	public double getAverage() {
		int total = 0;
		for (int grade : grades) {
			total += grade;
		}
		return (double) total / grades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Distribuição das Notas");
		// armazena frequencia de notas em cada intervalo de 10 notas
		int[] frequency = new int[11];
		// para cada nota incrementa a frequencia apropriada
		for (int grade : grades) {
			++frequency[grade / 10];
		}
		// para cada frequencia de nota, imprime a barra no gráfico
		for (int count= 0; count < frequency.length; count++) {
			// gera saida do rótulo de barra ("00-09:", ... , "90-99: ", "100: "
			if (count == 10) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			}
			// imprime a barra de asteriscos
			for (int stars = 0; stars < frequency[count]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void outputGrades() {
		System.out.printf("As notas são:%n%n");
		//gera a saída da nota de cada aluno
		for (int student = 0; student < grades.length; student++) {
			System.out.printf("Aluno %2d: %3d%n", student + 1, grades[student]);
		}
	}

}

