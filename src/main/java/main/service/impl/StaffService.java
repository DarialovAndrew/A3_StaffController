package main.service.impl;

import main.service.model.Cleaner;
import main.service.model.Manager;
import main.service.model.Trainer;
import main.service.repository.CleanerRepository;
import main.service.repository.ManagerRepository;
import main.service.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public final class StaffService {
    private CleanerRepository cleaners;
    private ManagerRepository managers;
    private TrainerRepository trainers;


    @Autowired
    public StaffService(CleanerRepository cleaners, ManagerRepository managers, TrainerRepository trainers) {
        this.cleaners = cleaners;
        this.managers = managers;
        this.trainers = trainers;
    }


    public void addStaff(Cleaner worker) {
        cleaners.save(worker);
    }

    public void addStaff(Manager worker) {
        managers.save(worker);
    }

    public void addStaff(Trainer worker) {
        trainers.save(worker);
    }

    public void deleteCleaner(UUID id) {
        cleaners.deleteById(id);
    }

    public void deleteManager(UUID id) {
        managers.deleteById(id);
    }

    public void deleteTrainer(UUID id) {
        trainers.deleteById(id);
    }

    public CleanerRepository getCleaners() {
        return cleaners;
    }

    public ManagerRepository getManagers() {
        return managers;
    }

    public TrainerRepository getTrainers() {
        return trainers;
    }
}
