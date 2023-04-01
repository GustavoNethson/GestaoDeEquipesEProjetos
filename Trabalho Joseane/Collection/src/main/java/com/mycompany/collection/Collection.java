// Nome: Gustavo Henrique da Silva Nethson  RA: 00173525
//Collections

//Pesquisar sobre os conceitos, aplicações, formas de implementação, como utilizar

//Exemplos de códigos executáveis (NetBrans)
//Criar Classes com os arquivos (Tema)

package com.mycompany.collection;
import java.util.Collection;
import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {
        Collection<String> colecaoDeCarros = new ArrayList<String>();
        
        colecaoDeCarros.add("Camaro SS");
        colecaoDeCarros.add("Lamborgini");
        colecaoDeCarros.add("Ferrari");
        colecaoDeCarros.add("Jeep");
        colecaoDeCarros.add("SRV");
        
        for (String elemento : colecaoDeCarros){
            System.out.println(elemento);
        }
        
        colecaoDeCarros.add("Fuscão Preto");
        
        System.out.println("\n---\n");
        for (String elemento : colecaoDeCarros){
            System.out.println(elemento);
        }
    }
}