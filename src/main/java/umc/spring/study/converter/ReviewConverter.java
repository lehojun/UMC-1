package umc.spring.study.converter;

import umc.spring.study.domain.Review;
import umc.spring.study.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {

    public static ReviewResponseDTO.JoinResultDTO toJoinResultDTO(Review review){
        return ReviewResponseDTO.JoinResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
