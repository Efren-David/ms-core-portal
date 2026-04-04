package com.ed.ms_core_portal.util;

public class Constants {

	/**
	 * Clase que contiene mensajes utilizados en la aplicacion.
	 */
	public static class Messages {

		public static final String SUCCESS_MESSAGE = "Operacion exitosa.";
		public static final String ERROR_MESSAGE = "Acceso denegado.";

		public static final String REQUEST = "Request: ";
		public static final String RESPONSE = "Response: ";
		public static final String EJC_SER = " Ejecutando service ";
		public static final String MENSAJE_OK = "Operación exitosa";

		public static final String ERROR_INTERNO = "Credenciales invalidas. Favor de validar.";

	}

	/**
	 * Clase que contiene números predefinidos para evitar "magic numbers".
	 */
	public static class Numbers {

		public static final int NUM_0 = 0;
		public static final int NUM_1 = 1;
		public static final int NUM_2 = 2;
		public static final int NUM_3 = 3;
		public static final int NUM_4 = 4;
		public static final int NUM_5 = 5;
		public static final int NUM_6 = 6;
		public static final int NUM_7 = 7;
		public static final int NUM_8 = 8;
		public static final int NUM_304 = 304;
		public static final int NUM_60 = 60;
	}

	public static class Endpoints {

		public static final String API_VALIDACION = "/session/valida";
	}

}
