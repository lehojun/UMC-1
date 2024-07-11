package umc.spring.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.study.apiPayload.ApiResponse;
import umc.spring.study.service.ReviewService.ReviewCommandService;
import umc.spring.study.web.dto.ReviewRequestDTO;
import umc.spring.study.web.dto.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewRestController {

    private final ReviewCommandService reviewCommandService;

    @PostMapping("/")
    public ApiResponse<ReviewResponseDTO.JoinResultDTO> join(@RequestBody @Valid ReviewRequestDTO.JoinDto request){
        return null;
    }
}
