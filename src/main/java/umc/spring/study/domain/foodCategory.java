package umc.spring.study.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.mapping.MemberPrefer;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class foodCategory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private List<MemberPrefer> memberPreferList = new ArrayList<>();
}
