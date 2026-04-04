package com.ed.ms_core_portal.request;

import com.google.gson.Gson;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

public class AuthRequest {

    @NotEmpty
    @Schema(description = "Número de empleado en sesión", example = "10051458")
    private String noEmpleadoSession;

    @NotEmpty
    @Schema(description = "IP del empleado en sesión", example = "10.10.76.149")
    private String ipEmpleadoSession;

    @NotEmpty
    @Schema(description = "ID del navegador", example = "firefox")
    private String nav;

    @NotEmpty
    @Schema(description = "ID de transacción", example = "080324143451")
    private String idTransaccion;

    /**
     * Constructor completo de la clase BaseRequest.
     *
     * @param noEmpleadoSession Numero de empleado en sesion
     * @param ipEmpleadoSession IP del empleado en sesion
     * @param nav ID del navegador
     * @param idTransaccion ID de transaccion
     */
    public AuthRequest(String noEmpleadoSession, String ipEmpleadoSession, String nav, String idTransaccion) {
        this.noEmpleadoSession = noEmpleadoSession;
        this.ipEmpleadoSession = ipEmpleadoSession;
        this.nav = nav;
        this.idTransaccion = idTransaccion;
    }

    /**
     * Constructor vacio.
     */
    public AuthRequest() {
        super();
    }

    /**
     * Obtiene el ID del navegador.
     *
     * @return ID del navegador
     */
    public String getNav() {
        return nav;
    }

    /**
     * Establece el ID del navegador.
     *
     * @param nav ID del navegador
     */
    public void setNav(String nav) {
        this.nav = nav;
    }

    /**
     * Obtiene el numero de empleado en sesion.
     *
     * @return numero de empleado
     */
    public String getNoEmpleadoSession() {
        return noEmpleadoSession;
    }

    /**
     * Establece el numero de empleado en sesion.
     *
     * @param noEmpleadoSession numero de empleado
     */
    public void setNoEmpleadoSession(String noEmpleadoSession) {
        this.noEmpleadoSession = noEmpleadoSession;
    }

    /**
     * Obtiene la IP del empleado en sesion.
     *
     * @return IP del empleado
     */
    public String getIpEmpleadoSession() {
        return ipEmpleadoSession;
    }

    /**
     * Establece la IP del empleado en sesion.
     *
     * @param ipEmpleadoSession IP del empleado
     */
    public void setIpEmpleadoSession(String ipEmpleadoSession) {
        this.ipEmpleadoSession = ipEmpleadoSession;
    }

    /**
     * Obtiene el ID de la transaccion.
     *
     * @return ID de la transaccion
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Establece el ID de la transaccion.
     *
     * @param idTransaccion ID de la transaccion
     */
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    /**
     * Crea una copia de la solicitud actual (sin referencias compartidas).
     *
     * @return nueva instancia de BaseRequest con los mismos datos
     */
    public AuthRequest getBaseRequest() {
        return new AuthRequest(this.noEmpleadoSession, this.ipEmpleadoSession, this.nav, this.idTransaccion);
    }
    
    
    /**
     * Convierte el objeto a su representacion en JSON.
     *
     * @return objeto en formato JSON
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

