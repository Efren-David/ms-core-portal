package com.ed.ms_core_portal.util;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;



public class Constants {

    /**
     * Clase que contiene constantes relacionadas con seguridad y cifrado AES.
     */
    public static class Security {

        /** Contraseña secreta utilizada para generar claves AES */
        public static final String SECRET = "MIDDLEWARE-Central-MIcROs-MuLtiP";

        /** Codificación UTF-8 */
        public static final Charset UTF_8 = StandardCharsets.UTF_8;

        /** Algoritmo de cifrado */
        public static final String CIPHER_ALGORITHM = "AES/GCM/NoPadding";

        /** Algoritmo para la derivacion de claves */
        public static final String FACTORY_INSTANCE = "PBKDF2WithHmacSHA256";

        /** Longitud de la etiqueta de autenticacion GCM en bytes */
        public static final int TAG_LENGTH = 16;

        /** Longitud del vector de inicializacion (IV) en bytes */
        public static final int IV_LENGTH = 12;

        /** Longitud de la sal para derivacion de claves */
        public static final int SALT_LENGTH = 16;

        /** Longitud de la clave AES en bytes */
        public static final int KEY_LENGTH = 32;

        /** Numero de iteraciones para derivacion de claves PBKDF2 */
        public static final int ITERATIONS = 65535;
    }

    /**
     * Clase que contiene mensajes utilizados en la aplicacion.
     */
    public static class Messages {

        public static final String SUCCESS_MESSAGE = "Operacion exitosa.";
        public static final String ERROR_MESSAGE = "Acceso denegado.";
        public static final String ERROR_GENERAL = "Ocurrio un error interno en el servicio. ";
        public static final String ERROR_DEC = "Error en la petición";
        public static final String SESION_NO_VALIDA = "Sesión no valida";
        public static final String MSPCONTINGENCIA = "MSPCONTINGENCIA";
        public static final String LOG_MONITOREO = "monitoreo";
        public static final String REQUEST = "Request: ";
        public static final String RESPONSE = "Response: ";
        public static final String EJC_SER = " Ejecutando service ";
        public static final String MENSAJE_OK = "Operación exitosa";
        public static final String ERROR_INTERNO = "Credenciales invalidas. Favor de validar.";
        public static final String BAD_REQUEST = "Solicitud mal formada, favor de validar.";
        public static final String MENSAJE_EVENTOS_CLASIFICACIONES_ERROR = "Termina consulta de eventos con errores. ";
        public static final String ERROR_DESENCRIPTAR = "No se pudo desencriptar. ";
        public static final String STRING_SPACE = " ";
        public static final String MWCONTINGENCIAS = "MWCONTINGENCIAS";
        public static final String TRANSACTION_ID = "transaction-id";
        public static final String SERVICIO_NOT = "Servicio no disponible";
        public static final String LIST_EVENTOS = "listEventos";
        public static final String TEST_VERSION = "25092025 00:00:01";
    }

    /**
     * Clase que contiene alertas del sistema.
     */
    public static class Alerts {

        public static final String FALLA_TARJETA_SENSORES = "FALLA EN TARJETA DE SENSORES";
        public static final String BOVEDA_ABIERTA = "BOVEDA ABIERTA";
        public static final String FACIA_ABIERTA = "FACIA ABIERTA";
        public static final String APAGADO = "APAGADO";
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

    /**
     * Clase que contiene rutas de API.
     */
    public static class Endpoints {

        public static final String API_AUTOSERVICIO_BASE = "/contingencias/core/v1";
        public static final String API_EVENTOS = "/eventos/clasificaciones";
        public static final String API_EVENTOS_CONTADORES = "/eventos/contadores";
        public static final String API_COMENTARIOS_REGISTRO = "/comentarios/registro";
        public static final String API_COMENTARIOS_ACTUALIZACION = "/comentarios/actualizacion";
        public static final String API_BITACORA = "/bitacora/consulta";
        
        public static final String API_VALIDACION = "/session/valida";
    }

    /**
     * Clase que contiene formatos de logs.
     */
    public static class LogConstants {

        public static final String LOG_FORMAT_TWO_PARAMS = "{}{}";
        public static final String LOG_FORMAT_SIX_PARAMS = "{}{}{}{}{}{}";
        public static final String LOG_FORMAT_EIGHT_PARAMS = "{}{}{}{}{}{}{}{}";
    }

    /**
     * Constructor privado para evitar instanciacion de la clase.
     * Lanza IllegalStateException si se intenta instanciar.
     */
    public Constants() {

        LogConstants l = new LogConstants();
        
        Endpoints e = new Endpoints();
        
        Security s = new Security();

        Messages m = new Messages();

        Alerts a = new Alerts();

        Numbers nu = new Numbers();

        Endpoints end = new Endpoints();

        throw new IllegalStateException("Constants class");
    }

}

