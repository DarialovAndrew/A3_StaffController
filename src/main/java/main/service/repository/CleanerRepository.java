package main.service.repository;

import main.service.model.Cleaner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CleanerRepository extends JpaRepository<Cleaner, UUID> {
}
