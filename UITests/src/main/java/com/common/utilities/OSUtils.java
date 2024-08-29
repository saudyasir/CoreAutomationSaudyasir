package com.common.utilities;

public class OSUtils {

	public enum OS {
		// What is enum ?
		WINDOWS, LINUX, MAC;
	};

	private static OS os = null;

	public static OS getOS() {
		if (os == null) {
			String operSystem = System.getProperty("os.name").toLowerCase();   // taking env from getPorperty
			if (operSystem.contains("win")) {
				os = OS.WINDOWS;
			} else if (operSystem.contains("nix") || operSystem.contains("nux") || operSystem.contains("aix")) {
				os = OS.LINUX;
			} else if (operSystem.contains("mac")) {
				os = OS.MAC;
			}

		}
		return os;

	}

}
