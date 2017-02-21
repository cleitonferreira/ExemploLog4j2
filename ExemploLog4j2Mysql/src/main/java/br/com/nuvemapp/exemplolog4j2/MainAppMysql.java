package br.com.nuvemapp.exemplolog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainAppMysql {

	static Logger log = LogManager.getLogger(MainAppMysql.class.getName());

	public static void main(String[] args) {

		log.debug("Sample debug message");
		log.info("Sample info message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
	}

}