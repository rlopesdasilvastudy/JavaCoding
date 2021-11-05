package Capitulo_08_Classes_e_Objetos;

public enum Book {
	
	// Constantes do tipo ENUM
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Internet & WWW How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBTHP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	// campos de instância
	private final String title;
	private final String copyrightYear;
	
	// Construtor ENUM
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	// Acessor para o título de ampo
	public String getTitle() {
		return title;
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}
	
}

