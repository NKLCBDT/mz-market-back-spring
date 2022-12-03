package com.mz.market.board.dto;

import lombok.Builder;

import java.util.List;

public class GetBoardDto {

    @Builder
    public static class Response{
        private String title;
        private String content;
        private Integer interest;
        private Integer view;
        private Emotion emotions;
        private List<BoardReply> boardReplies;
        @Builder
        public static class Emotion {
            private Integer like;
            private Integer love;
            private Integer smile;
            private Integer surprised;
            private Integer sad;
            private Integer angry;
        }
        public static class BoardReply{

        }
    }
}
