package com.duvalhub.dummyspringboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
