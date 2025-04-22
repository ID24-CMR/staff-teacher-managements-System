package org.idrice24.services;

import org.idrice24.entities.Qualification;

public interface QualificationService {
    Iterable<Qualification> getAllQualification();
    Qualification findById(long id);

    void saveQualification(Qualification qualification);
    void deleteQualification(Qualification qualification);
    void deleteQualificationById(long id);
}
