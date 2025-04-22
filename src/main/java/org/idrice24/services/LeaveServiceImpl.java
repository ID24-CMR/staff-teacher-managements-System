package org.idrice24.services;


import org.idrice24.entities.Leave;
import org.idrice24.repositories.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveServiceImpl implements LeaveService{
    private LeaveRepository leaveRepository;

    @Autowired
    public void setRepos(LeaveRepository leaveRepository){
        this.leaveRepository = leaveRepository;
    }

    @Override
    public Iterable<Leave> getAllLeaves() {
        return leaveRepository.findAll();    
    }

    @Override
    public Leave findById(long id) {
        return leaveRepository.findById(id);    
    }

    @Override
    public void saveLeave(Leave leave) {
        leaveRepository.save(leave);    
    }

    @Override
    public void deleteLeave(Leave leave) {
        leaveRepository.delete(leave);    
    }

    @Override
    public void deleteLeaveById(long id) {
        leaveRepository.deleteById(id);    
    }

}
