package ua.lviv.lgs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggeredFile {
	private static Logger Log = Logger.getLogger(CustomLoggeredFile.class);

	public static void main(String[] args) {
		LogWithBasicConfigurator();
		LogWithDomConfigurator();

	}

	public static void LogWithBasicConfigurator() {
		BasicConfigurator.configure();
		Log.debug("Debug Logger of the project is on the screen!");
		Log.info("Info Logger of the project is on the screen!");
		Log.warn("Warn Logger of the project is on the screen!");
	}
	public static void LogWithDomConfigurator() {
		DOMConfigurator.configure("src/main/java/ua/lviv/lgs/loggerConfig.xml");
		Log.error("ERROR Logger of the project is on the screen!");
	}
}
