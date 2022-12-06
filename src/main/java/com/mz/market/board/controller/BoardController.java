package com.mz.market.board.controller;

import com.mz.market.board.dto.GetAllBoardDto;
import com.mz.market.board.dto.GetBoardDto;
import com.mz.market.board.service.BoardService;
import com.mz.market.common.dto.PostAreaBoardDto;
import com.mz.market.common.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public ResponseEntity<ResponseDto<GetAllBoardDto.Response>> getAllBoard(
            @RequestParam String categoryName
    ){
        return ResponseEntity.ok().body(boardService.getAllBoard());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<GetBoardDto.Response>> getBoard(
            @PathVariable Long id
    ){
        return ResponseEntity.ok().body(boardService.getBoard(id));
    }

    @PostMapping("/area")
    public ResponseEntity<ResponseDto<Object>> postAreaBoard(
            @RequestBody PostAreaBoardDto.Request dto
            ){
        return ResponseEntity.ok().body(boardService.postAreaBoard(dto));
    }

    @PostMapping("/impromptu")
    public ResponseEntity<ResponseDto<Object>> postImpromptuBoard(
            @RequestBody PostAreaBoardDto.Request dto
    ){
        return ResponseEntity.ok().body(boardService.postAreaBoard(dto));
    }


}
