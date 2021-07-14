package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto;

@Repository
public interface productoReposiroty extends JpaRepository<Producto, Long> {

}
