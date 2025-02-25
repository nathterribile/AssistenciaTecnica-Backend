package com.fiap.myassist.resources.repository;

import com.fiap.myassist.resources.repository.entity.OsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OsRepository extends JpaRepository<OsEntity, Long> {
}
