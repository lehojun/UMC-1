package umc.spring.study.converter;

import umc.spring.study.domain.Region;
import umc.spring.study.web.dto.StoreRequestDTO;
import umc.spring.study.domain.Store;
import umc.spring.study.web.dto.StoreResponseDTO;
import java.time.LocalDateTime;

public class StoreConverter {

        public static StoreResponseDTO.JoinResultDTO toJoinResultDTO(Store store){
            return StoreResponseDTO.JoinResultDTO.builder()
                    .storeId(store.getId())
                    .createdAt(LocalDateTime.now())
                    .build();
        }

        public static Store toStore(StoreRequestDTO.JoinStoreDTO request, Region region) {
            return Store.builder()
                    .name(request.getName())
                    .address(request.getAddress())
                    .region_id(region)
                    .build();
        }
    }

