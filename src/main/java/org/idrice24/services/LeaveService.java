package org.idrice24.services;
import org.idrice24.entities.Leave;
public interface LeaveService {
    Iterable<Leave> getAllLeaves();
    Leave findById(long id);

    void saveLeave(Leave leave);
    void deleteLeave(Leave leave);
    void deleteLeaveById(long id);
}
