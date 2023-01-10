package com.mz.market.item.mapper;

import com.mz.market.common.CommonMapperConfig;
import com.mz.market.item.dto.GetItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CommonMapperConfig.class)
public interface ItemMapper {
    @Mapping(target = "", source = "")
    GetItemDto.Response getItemDtoToResponse();
}
