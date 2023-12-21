package oop_with_java_inheritance;

//Class generica
public class Pessoa {
    //Atributos de classe
    //ATRIBUTOS GENERICOS QUE AS CLASSES FILHAS IRÃO HERDAR DA SUPERCLASSE
    public String nome = "Palloma";
    public int idade = 25;
    public String endereco = "Rua 9 de julho";
    public String cpf = "054.654.556-64";
    public String rg = "654.564.564-56";
    
    //Procedures/metodos
    public void comer()
    {
        System.out.println("Palloma adora comer!");
    }
    
    public void falar()
    {
        System.out.println("Palloma está falando!");
    }

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", cpf=" + cpf + ", rg=" + rg;
	}
}


