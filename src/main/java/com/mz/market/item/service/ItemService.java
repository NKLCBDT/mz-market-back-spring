package com.mz.market.item.service;

import com.mz.market.common.code.ResponseCode;
import com.mz.market.common.dto.ResponseDto;
import com.mz.market.item.dto.GetItemDto;
import com.mz.market.item.dto.GetItemsDto;
import com.mz.market.item.dto.PostItemDto;
import com.mz.market.item.dto.UpdateItemDto;
import com.mz.market.item.repository.ItemRepository;
import com.mz.market.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public ResponseDto<GetItemsDto.Response> getItems(String area){
        return ResponseDto.<GetItemsDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.GET_ITEMS).build();
    }

    public ResponseDto<GetItemDto.Response> getItem(UUID itemId){
        return ResponseDto.<GetItemDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.GET_ITEM).build();
    }

    public ResponseDto<PostItemDto.Response> postItem(PostItemDto.Request request){
        return ResponseDto.<PostItemDto.Response>builder()
                .data(null)
                .responseCode(ResponseCode.POST_ITEM).build();
    }

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
