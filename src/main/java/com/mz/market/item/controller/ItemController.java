package com.mz.market.item.controller;

import com.mz.market.common.dto.ResponseDto;
import com.mz.market.item.dto.GetItemDto;
import com.mz.market.item.dto.GetItemsDto;
import com.mz.market.item.dto.PostItemDto;
import com.mz.market.item.dto.UpdateItemDto;
import com.mz.market.item.service.ItemService;
import com.mz.market.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/v1/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<ResponseDto<GetItemsDto.Response>> getItems(@RequestParam String area){
        return new ResponseEntity<>(itemService.getItems(area), OK);
    }

    @GetMapping("/{item-id}")
    public ResponseEntity<ResponseDto<GetItemDto.Response>> getItem(
            @PathVariable(value = "item-id") UUID itemId
    ){
        return new ResponseEntity<>(itemService.getItem(itemId), OK);
    }

    @PostMapping
    public ResponseEntity<ResponseDto<PostItemDto.Response>> postItem(
            @RequestBody PostItemDto.Request request
    ){
        return new ResponseEntity<>(itemService.postItem(request), OK);
    }

    @PutMapping
    public ResponseEntity<ResponseDto<UpdateItemDto.Response>> updateItem(
            @RequestBody UpdateItemDto.Request request
    ){
        return new ResponseEntity<>(itemService.updateItem(request), OK);
    }

    @DeleteMapping("/{item-id}")
    public ResponseEntity<ResponseDto<Object>> deleteItem(@AuthenticationPrincipal User user,
            @PathVariable(value = "item-id") UUID itemId){
        return new ResponseEntity<>(itemService.deleteItem(user, itemId), OK);
    }
}
