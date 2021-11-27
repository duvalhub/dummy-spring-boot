package com.duvalhub.dummyspringboot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DummyService {
    private final DummyRepository dummyRepository;

    public List<DummyEntity> findAll() {
        return this.dummyRepository.findAll();
    }

    public DummyEntity create(DummyEntity dummyEntity) {
        return this.dummyRepository.save(dummyEntity);
    }

    public DummyEntity update(Long id, DummyEntity dummyEntity) {
        DummyEntity toUpdate = this.dummyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Missing entity with id " + id));
        dummyEntity.setId(toUpdate.getId());
        return this.dummyRepository.save(dummyEntity);
    }
}
