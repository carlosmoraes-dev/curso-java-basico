/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.cursojava.aula10;

/**
 *
 * @author Carlos Moraes
 */
public class Variaveis {
    
    public static void main(String[] args) {
		
		//convenção Java
		int idade = 20; 
		String nome = "Carlos"; 
		String nomeDoMeuCachorro = "téo";
		String ano2014 = "2014";
		
		//aceito mas não utilizada
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro; 
		String nomeDoMeucachorro;
		
		idade = 25; 
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		//má pratica
		int a = 10;
		String b ="Carlos";
    }
}
