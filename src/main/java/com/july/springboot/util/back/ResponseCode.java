package com.july.springboot.util.back;

import java.io.Serializable;

/**
 * 2017/3/3.
 */
public class ResponseCode implements Serializable {

    private String code;
    private String mesg;

    public ResponseCode(String code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }

    public String getCode() {
        return code;
    }

    public String getMesg() {
        return mesg;
    }
}
