package com.example.crud2.Repo;

import com.example.crud2.Entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface MyRepo extends JpaRepository<MyEntity, Long> {
    @Query("SELECT e FROM MyEntity e WHERE e.lastname = :lastname")
    List<MyEntity> findByLastname(@Param("lastname") String lastname);

}
