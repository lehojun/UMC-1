package umc.spring.study.service.RegionService;

import umc.spring.study.domain.Region;
import umc.spring.study.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RegionCommandServiceImpl implements RegionCommandService{
    private final RegionRepository regionRepository;

    @Override
     public Region addRegion(Long region) {
        if (region == 1) {
            System.out.println("최선규");
            
        }

        return regionRepository.findById(region).get();
    }
}
