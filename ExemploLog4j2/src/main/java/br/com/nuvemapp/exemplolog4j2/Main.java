package br.com.nuvemapp.exemplolog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.debug("Menssagem Debug do Log4j!!!");
		LOGGER.info("Menssagem Info do Log4j!!!");
		LOGGER.warn("Menssagem Warn do Log4j!!!");
		LOGGER.error("Menssagem Error do Log4j!!!", new NullPointerException("Erro NullPointerException"));
	}
}
