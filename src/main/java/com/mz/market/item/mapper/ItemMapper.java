package com.mz.market.item.mapper;

import com.mz.market.category.entity.Category;
import com.mz.market.common.CommonMapperConfig;
import com.mz.market.item.dto.GetItemDto;
import com.mz.market.item.dto.PostItemDto;
import com.mz.market.item.entity.Item;
import com.mz.market.item.entity.ItemImage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Mapper(config = CommonMapperConfig.class)
public interface ItemMapper {
    @Mapping(target = "", source = "")
    GetItemDto.Response getItemDtoToResponse();

    Item postItemDtoToItem(PostItemDto.Request request, List<ItemImage> itemImages, Category category);

    List<ItemImage> postItemDtoToItemImages(List<MultipartFile> images);
}
