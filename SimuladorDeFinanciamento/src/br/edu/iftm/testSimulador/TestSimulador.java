package br.edu.iftm.testSimulador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.simuladorDeFinanciamento.Financiamento;

public class TestSimulador {

	@Test
	public void testPrestacaoMaiorQueARendaMensal() 
	{
		Financiamento f = new Financiamento();
		f.setEntrada(5000.0);
		f.setRendaMensal(500.0);
		f.setNumPrestacoes(12);
		f.setValorVeiculo(20000.0);
		f.setTaxaJuros(0.02);
		
		Double experado = 0.0;
		Double atual = f.totalASerPago();
		
		assertEquals(experado, atual, 0.0);
	}
	
	@Test
	public void testPrestacaoMenorQueARendaMensal() 
	{
		Financiamento f = new Financiamento();
		f.setEntrada(5000.0);
		f.setRendaMensal(2500.0);
		f.setNumPrestacoes(120);
		f.setValorVeiculo(50000.0);
		f.setTaxaJuros(0.02);
		
		Double experado = 992.1643598624842;
		Double atual = f.valorDasPrestacoes();
		
		assertEquals(experado, atual, 0.0);
	}
	

}
