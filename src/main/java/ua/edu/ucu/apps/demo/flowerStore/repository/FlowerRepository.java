package ua.edu.ucu.apps.demo.flowerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.edu.ucu.apps.demo.flower.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long>{
}
