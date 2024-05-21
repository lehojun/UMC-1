package umc.spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.foodCategory;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private foodCategory foodCategory;

}