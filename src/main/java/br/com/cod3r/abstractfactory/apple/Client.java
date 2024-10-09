package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.BrazilianCountryRules;
import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {

		/* Padrao FACTORY */

		BrazilianCountryRules countryRules = new BrazilianCountryRules();
		IPhone11Factory factory11 = new IPhone11Factory(countryRules);

		System.out.println("Criando iPhone11");
		IPhone iphone11 = factory11.createIPhone("highEnd");

		System.out.println(iphone11);

	}
}
