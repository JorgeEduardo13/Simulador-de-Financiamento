package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class ProvaTest {

	
//  Testes PROVA - Nota máxima na prova
//=============================================================================================================
	@Test
	public void testProvaNotaMaxValendoMaisQueCem() 
	{
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);		
	}
	@Test
	public void testProvaNotaMaxValendoCentoEUm()
	{
		Prova p = new Prova();
		
		p.setNota_max(101);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual,0.0);
	}
	@Test
	public void testProvaNotaMaxAceitavel()
	{
		Prova p = new Prova();
		p.setNota_max(100);
		
		double experado = 100; 
		double atual = p.getNota_max();
		
		assertEquals(experado, atual,0.0);
	}	
	@Test
	public void testProvaNotaMaxValendoMenosQueZero()
	{
		Prova p = new Prova();
		p.setNota_max(-10);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual,0.0);		
	}
	
//  Testes PROVA - Nota obtida na prova
//=============================================================================================================
	@Test
	public void testProvaNotaObtidaValendoMenosQueZero()
	{
		Prova p = new Prova();
		p.setNota_max(100);
		p.setNota_obtida(-10);
				
		double experado = 0.0; 
		double atual = p.getNota_obtida();
		
		assertEquals(experado, atual,0.0);
	}
	
	@Test
	public void testProvaNotaObtidaAceitavel()
	{
		Prova p = new Prova();
		p.setNota_max(100);
		p.setNota_obtida(80);
		double experado = 80; 
		double atual = p.getNota_obtida();
		
		assertEquals(experado, atual,0.0);
	}
	
	@Test
	public void testProvaObtidaValendoMaisQueCem()
	{
		Prova p = new Prova();
		
		p.setNota_max(209);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual,0.0);
	}
	
	@Test
	public void testProvaObtidaValendoCentoEUm()
	{
		Prova p = new Prova();
		
		p.setNota_max(101);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual,0.0);
	}
	
//  Testes BOLETIM 
//=============================================================================================================
	
	@Test
	public void testTotalDeProvasMaiorQueCem()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		
		p.setNota_max(80);
		p2.setNota_max(30);
		b.adicionaProva(p);
		b.adicionaProva(p2);
		
		b.somaDasProvas();
		
		double experado = 80.0;
		double atual = b.somaDasProvas();
		
		assertEquals(experado, atual,0.0);
		
	}
	
	@Test
	public void testTotalDeProvasMenorQueCem()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		
		p.setNota_max(50);
		p2.setNota_max(30);
		b.adicionaProva(p);
		b.adicionaProva(p2);
		
		b.somaDasProvas();
		
		double experado = 80;
		double atual = b.somaDasProvas();
		
		assertEquals(experado, atual,0.0);
	}
	

	@Test
	public void testSomaDasProvas()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		Prova p3 = new Prova();
		
		p.setNota_max(40);
		p2.setNota_max(30);
		p3.setNota_max(20);
		p.setNota_obtida(35);
		p2.setNota_obtida(25);
		p3.setNota_obtida(15);
		
		b.adicionaProva(p);
		b.adicionaProva(p2);
		b.adicionaProva(p3);
		
		b.somaDasProvas();
		
		double experado = 90;
		double atual = b.somaDasProvas();
		
		assertEquals(experado, atual,0.0);
	}
	
	@Test
	public void testNotaFinalMaiorQueSessenta()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		Prova p3 = new Prova();
		
		p.setNota_max(40);
		p2.setNota_max(30);
		p3.setNota_max(30);
		
		p.setNota_obtida(35);
		p2.setNota_obtida(25);
		p3.setNota_obtida(20);
		
		b.adicionaProva(p);
		b.adicionaProva(p2);
		b.adicionaProva(p3);
		
		b.getNotaFinal();
		
		double experado = 80;
		double atual = b.getNotaFinal();
		
		assertEquals(experado, atual,0.0);
	}
	
	@Test
	public void testNotaFinalMenorQueSessenta()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		Prova p3 = new Prova();
		
		p.setNota_max(40);
		p2.setNota_max(30);
		p3.setNota_max(30);
		
		p.setNota_obtida(15);
		p2.setNota_obtida(25);
		p3.setNota_obtida(8);
		
		b.adicionaProva(p);
		b.adicionaProva(p2);
		b.adicionaProva(p3);
		
		b.getNotaFinal();
		
		double experado = 48;
		double atual = b.getNotaFinal();
		
		assertEquals(experado, atual,0.0);
	}
	@Test
	public void testNotaFinal_SomaDasProvasMenorQue100()
	{
		Boletim b = new Boletim();
		Prova p = new Prova();
		Prova p2 = new Prova();
		Prova p3 = new Prova();
		
		p.setNota_max(40);
		p2.setNota_max(30);
		p3.setNota_max(20);
		
		p.setNota_obtida(35);
		p2.setNota_obtida(25);
		p3.setNota_obtida(20);
		
		b.adicionaProva(p);
		b.adicionaProva(p2);
		b.adicionaProva(p3);
		
		b.getNotaFinal();
		
		double experado = 0;
		double atual = b.getNotaFinal();
		
		assertEquals(experado, atual,0.0);
	}
}
