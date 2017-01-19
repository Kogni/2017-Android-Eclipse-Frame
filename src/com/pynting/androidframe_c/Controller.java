package com.pynting.androidframe_c;

public class Controller {

    private static volatile Controller instance;

    private Controller() {// constructor

    }

    public static Controller getInstance() {
	try {
	    if (instance == null) {
		synchronized (Controller.class) {
		    if (instance == null) {
			instance = new Controller();
		    }
		}
	    }
	    return instance;
	} catch (Throwable e) {
	    e.printStackTrace();
	}
	return null;
    }

}
