package umc.spring.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.Store;

import java.util.List;

public class ReviewRequestDTO {
    @Getter
    public static class JoinDto{
        @NotNull
        String content;
        @NotNull
        Integer score;
        @NotNull
        Member member;
        @NotNull
        Store store;

    }
}
