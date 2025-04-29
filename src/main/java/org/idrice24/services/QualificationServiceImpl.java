package org.idrice24.services;

import org.idrice24.entities.Qualification;
import org.idrice24.repositories.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualificationServiceImpl implements QualificationService {

    private QualificationRepository qualificationRepository;

    @Autowired
    public void setQualification(QualificationRepository qualificationRepository){
        this.qualificationRepository = qualificationRepository;
    }

    @Override
    public Iterable<Qualification> getAllQualification() {
        return qualificationRepository.findAll();
    }

    @Override
    public Qualification findById(long id) {
        return qualificationRepository.findById(id);
    }

    @Override
    public void saveQualification(Qualification qualification) {
        qualificationRepository.save(qualification);
    }

    @Override
    public void deleteQualification(Qualification qualification) {
        qualificationRepository.delete(qualification);
    }

    @Override
    public void deleteQualificationById(long id) {
        qualificationRepository.deleteById(id);
    }

}
