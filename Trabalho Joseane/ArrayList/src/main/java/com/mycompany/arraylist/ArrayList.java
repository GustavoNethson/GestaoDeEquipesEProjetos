// Nome: Gustavo Henrique da Silva Nethson  RA: 00173525
//Collections

//Pesquisar sobre os conceitos, aplicações, formas de implementação, como utilizar

//Exemplos de códigos executáveis (NetBrans)
//Criar Classes com os arquivos (Tema)

package com.mycompany.arraylist;
import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
       ArrayList<String> listaAnimais = new ArrayList<String>();
       
       listaAnimais.add("Orangotango");
       listaAnimais.add("Gorila");
       listaAnimais.add("Pato");
       listaAnimais.add("Humano");
       
        System.out.println(listaAnimais.get(0));
        System.out.println(listaAnimais.get(1));
        System.out.println(listaAnimais.get(2));
        System.out.println(listaAnimais.get(3));
        
        listaAnimais.remove(1);
        
        System.out.println("\n---\n");
        
        for(String elemento : listaAnimais){
            System.out.println(elemento);
        }
       
    }
}
