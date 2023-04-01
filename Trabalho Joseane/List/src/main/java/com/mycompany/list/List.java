// Nome: Gustavo Henrique da Silva Nethson  RA: 00173525
// List:

//Pesquisar sobre os conceitos, aplicações, formas de implementação, como utilizar

//Exemplos de códigos executáveis (NetBrans)
//Criar Classes com os arquivos (Tema)

package com.mycompany.list;
import java.util.List;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<String>();
        
        //Criando a lista juntamente com todos os elementos que a compõem.
        listaNomes.add("Gustavo Henrique da Silva Nethson\n");
        listaNomes.add("Sopa de macaco\n");
        listaNomes.add("João Marcos Contini Tavares Pereira\n");
        listaNomes.add("Eduardo Rodrigues\n");
        listaNomes.add("Lucas Alexandre Leopolski");
        //Roda a primeira versão da lista
        System.out.println(listaNomes);
        //Apaga o item localizado no indice 1, ou seja o segundo item da lista.
        listaNomes.remove(1);
        
        System.out.println("---");
        // Imprime a lista agora sem o segundo item.
        System.out.println(listaNomes);
  
    }
}
