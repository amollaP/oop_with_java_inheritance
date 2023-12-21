package oop_with_java_inheritance;

public class Principal {
    
    public static void main(String[] args)
    {
        //Crio a referencia e instancia a classe cliente
        Cliente cliente1 = new Cliente();//crio a classe e acesso os respectivas "Procedures and Functions" e também como ela herda da classe
        //Pessoa especifica, ele herda os ATRIBUTOS AND METHODS AND PROCEDURES DA CLASSE "PESSOA"
        
        //Acesso diretamente os atributos da classe genérica (Pessoa) and acesso a classe especifica (cliente) que é uma pessoa.
        System.out.println( "Nome: "                + cliente1.nome + 
        	             	"\nIdade: "             + cliente1.idade + 
                            "\nEndereço: "          + cliente1.endereco + 
                            "\nCPF: "               + cliente1.cpf +
                            "\nRG: "                + cliente1.rg +
                            "\nCupom: "             + cliente1.cupom +
                            "\nContaBancaria: "     + cliente1.contaBancaria);
        
        //pode imprimir os dados dessa forma ou usando toString!
       
        System.out.println(cliente1.toString());                            
    
        //CALL the procedures/chama os metodos
        cliente1.comer();
        cliente1.falar();
   
    }
    
}
