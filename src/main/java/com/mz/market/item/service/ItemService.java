package com.mz.market.item.service;

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

    public ResponseDto<GetItemsDto.Response> getItems(){
        return null;
    }

    public ResponseDto<GetItemDto.Response> getItem(UUID itemId){
        return null;
    }

    public ResponseDto<PostItemDto.Response> postItem(PostItemDto.Request request){
        return null;
    }

    public ResponseDto<UpdateItemDto.Response> updateItem(UpdateItemDto.Request request){
        return null;
    }

    public ResponseDto<Object> deleteItem(User user, UUID itemId){
        return null;
    }
}
