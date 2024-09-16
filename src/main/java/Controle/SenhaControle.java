/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import java.util.Random;

/**
 *
 * @author muril
 */
public class SenhaControle {
    
    private String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String minusuclas = "abcdefghijklmnopqrstuvwxyz";
    private String numeros = "0123456789";
    private String especiais = "!@#$%¨&*()-=_+[]{},.<>?/;:´`^~";
    
    public String gerarSenha(boolean maiuscula, boolean minuscula, boolean numero, boolean especial, int tamanho){
       String combinacao = "";
       
       if(maiuscula){
         combinacao += maiusculas;
       }
       
       if(minuscula){
           combinacao += minusuclas;
       }
       
       if(numero){
           combinacao += numeros;
       }
       
       if(especial) {
           combinacao += especiais;
       }
       
       char[] senha = new char[tamanho];
        Random r = new Random();
        
        for(int i = 0; i < senha.length; i++)
        {
            senha[i] = combinacao.charAt(r.nextInt(combinacao.length()));
        }
       
       return new String(senha);
    }
}
