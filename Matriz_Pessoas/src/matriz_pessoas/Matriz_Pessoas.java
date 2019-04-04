/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_pessoas;

import java.util.Scanner;

/**
 *
 * @author jmsgfhr
 */
public class Matriz_Pessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUMERO_PESSOAS = 10;
        Scanner teclado = new Scanner(System.in);
        String[] nome= new String[NUMERO_PESSOAS];
        float[] idade = new float[NUMERO_PESSOAS];
        
        for(int i = 0;i < NUMERO_PESSOAS;i++){
            System.out.println("Digite nome da "+(i+1)+"ª pessoa: ");
            nome[i]=teclado.nextLine();
        }
        
        for(int i = 0;i < NUMERO_PESSOAS;i++){
            System.out.println("Digite a idade de "+nome[i]+": ");
            idade[i]=teclado.nextFloat();
            if(idade[i]<0){
                System.out.println("Digite uma idade válida!!!");
                i--;
            }
        }
        System.out.println("----------------- Ordem Crescente -----------------");
        OrdemCrescente(nome, idade);
        System.out.println("----------------- Ordem Alfabetica -----------------");
        OrdemAlfabetica(nome, idade);
    }
    
    public static void OrdemCrescente(String[] nome,float[] idade){
        for(int i = 1;i < idade.length;i++){
            float auxf;
            String auxs;
            for(int j = 1;j < idade.length;j++){
                if(idade[j] < idade[j-1]){
                    auxf=idade[j];
                    auxs=nome[j];
                    idade[j] = idade[j-1];
                    nome[j] = nome[j-1];
                    idade[j-1]=auxf;
                    nome[j-1]=auxs;
                }
            }
        }
        for(int i=0;i<idade.length;i++){
            System.out.println("Nome: "+nome[i]+" Idade: "+idade[i]);
        }
    }
    
    public static void OrdemAlfabetica(String[] nome,float[] idade) {
        for(int i = 1;i < nome.length;i++){
            float auxf;
            String auxs;
            for(int j = 1;j < nome.length;j++){
                if(nome[j].compareToIgnoreCase(nome[j-1])<0){
                    auxf=idade[j];
                    auxs=nome[j];
                    idade[j] = idade[j-1];
                    nome[j] = nome[j-1];
                    idade[j-1]=auxf;
                    nome[j-1]=auxs;
                }
            }
        }
        for(int i=0;i<nome.length;i++){
            System.out.println("Nome: "+nome[i]+" Idade: "+idade[i]);
        }
    }
    
}
