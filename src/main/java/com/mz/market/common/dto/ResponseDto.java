package com.mz.market.common.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.mz.market.common.code.ResponseCode;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public final class ResponseDto<T> {

    @NotNull
    @JsonUnwrapped
    private ResponseCode responseCode;

    private T data;

}
