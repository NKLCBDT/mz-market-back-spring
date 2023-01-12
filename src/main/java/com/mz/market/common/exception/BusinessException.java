package com.mz.market.common.exception;

import com.mz.market.common.code.ResponseCode;

public class BusinessException extends RuntimeException {
    private ResponseCode responseCode;

    public BusinessException(ResponseCode responseCode){
        super(responseCode.getDescription());
        this.responseCode = responseCode;
    }
}
