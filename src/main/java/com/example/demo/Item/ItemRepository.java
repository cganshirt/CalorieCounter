package com.example.demo.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    @Query(value = "SELECT * FROM items i WHERE i.name LIKE CONCAT('%', :name, '%')", nativeQuery = true)
    List<Item> findByName(@Param("name") String name);
}
