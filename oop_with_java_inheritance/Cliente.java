package oop_with_java_inheritance;

//Herda atributos da classe Pessoa (Generica)
public class Cliente extends Pessoa {
    //Atributos de classe, tudo publico
    //Atributos ESPECIFICOS DA CLASSE FILHA
	public String cupom = "NOTA10";
    public String contaBancaria = "445555-0";
    
    
	@Override
	public String toString() {
		return "Cliente "  + super.toString() + " cupom=" + cupom + ", contaBancaria=" + contaBancaria
				+ "]";
	}
    
    
    								
    
}
