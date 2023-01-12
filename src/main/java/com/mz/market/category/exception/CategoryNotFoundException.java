package com.mz.market.category.exception;

import com.mz.market.common.exception.BusinessException;

import static com.mz.market.common.code.ResponseCode.*;

public class CategoryNotFoundException extends BusinessException {
    public CategoryNotFoundException(){
        super(FAILURE_CATEGORY_NOT_FOUND);
    }
}
