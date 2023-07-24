package com.railworld.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railworld.entity.Hr;

@Repository
public interface HrRepository extends JpaRepository<Hr,Long> {

}
