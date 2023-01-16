package com.mz.market.item.service;

import com.mz.market.category.entity.Category;
import com.mz.market.category.exception.CategoryNotFoundException;
import com.mz.market.category.repository.CategoryRepository;
import com.mz.market.common.code.ResponseCode;
import com.mz.market.common.dto.ResponseDto;
import com.mz.market.item.dto.GetItemDto;
import com.mz.market.item.dto.GetItemsDto;
import com.mz.market.item.dto.PostItemDto;
import com.mz.market.item.dto.UpdateItemDto;
import com.mz.market.item.entity.Item;
import com.mz.market.item.entity.ItemImage;
import com.mz.market.item.mapper.ItemMapper;
import com.mz.market.item.repository.ItemRepository;
import com.mz.market.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository;
    private final ItemMapper itemMapper;

    public ResponseDto<GetItemsDto.Response> getItems(String area){

        return ResponseDto.<GetItemsDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.GET_ITEMS).build();
    }
    @Transactional(readOnly = true)
    public ResponseDto<GetItemDto.Response> getItem(UUID itemId){
        return ResponseDto.<GetItemDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.GET_ITEM).build();
    }

    @Transactional
    public ResponseDto<PostItemDto.Response> postItem(List<MultipartFile> images, PostItemDto.Request request){
        Category category = categoryRepository.findByName(request.getCategoryName())
                .orElseThrow(CategoryNotFoundException::new);
        List<ItemImage> itemImages = itemMapper.postItemDtoToItemImages(images);
        Item item = itemMapper.postItemDtoToItem(request, itemImages, category);
        itemRepository.save(item);
        return ResponseDto.<PostItemDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.POST_ITEM).build();
    }

    private List<ItemImage> toItemImage(List<MultipartFile> images) {
        return null;
    }

    @Transactional
    public ResponseDto<UpdateItemDto.Response> updateItem(UpdateItemDto.Request request){
        return ResponseDto.<UpdateItemDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.UPDATE_ITEM).build();
    }

    public ResponseDto<Object> deleteItem(User user, UUID itemId){
        return ResponseDto.builder()
                .data(null)
                .responseCode(ResponseCode.DELETE_ITEM).build();
    }
}
