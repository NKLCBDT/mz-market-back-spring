package com.mz.market.board.service;

import com.mz.market.board.controller.BoardController;
import com.mz.market.board.dto.GetAllBoardDto;
import com.mz.market.board.dto.GetBoardDto;
import com.mz.market.board.repository.BoardRepository;
import com.mz.market.common.dto.PostAreaBoardDto;
import com.mz.market.common.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public ResponseDto<GetAllBoardDto.Response> getAllBoard(){
        /**
         * 1. 게시판 조회(필터X)
         * 2. 게시판 조회(필터O)
         */
        return ResponseDto.<GetAllBoardDto.Response>builder()
                .responseCode(null).data(null).build();
    }

    public ResponseDto<GetBoardDto.Response> getBoard(Long id){
        return ResponseDto.<GetBoardDto.Response>builder()
                .responseCode(null).data(null).build();
    }


    public ResponseDto<Object> postAreaBoard(PostAreaBoardDto.Request dto){
        return ResponseDto.builder()
                .responseCode(null).data(null).build();
    }

    public ResponseDto<Object> postBoard(PostAreaBoardDto.Request dto){
        return ResponseDto.builder()
                .responseCode(null).data(null).build();
    }
}
