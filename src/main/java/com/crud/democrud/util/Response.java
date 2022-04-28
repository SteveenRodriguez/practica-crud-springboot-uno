package com.crud.democrud.util;

public class Response {
    public Boolean error;
    public String message;
    public Object data;

    /**
     * Class constructor
     *
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Response() {
        error = false;
        message = "";
        data = null;
    }

    /**
     * Default values of the response
     *
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public void restart() {
        error = false;
        message = "";
        data = null;
    }
}
