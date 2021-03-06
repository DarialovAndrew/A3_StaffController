package main.service.repository;

import main.service.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepository extends JpaRepository<Trainer, UUID> {
}
