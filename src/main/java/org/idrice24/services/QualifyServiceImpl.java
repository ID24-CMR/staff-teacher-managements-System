package org.idrice24.services;


import org.idrice24.entities.Qualify;
import org.idrice24.repositories.QualifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualifyServiceImpl implements QualifyService{
	
	private QualifyRepository qualifyRepository;

	@Autowired
	public void setRepos(QualifyRepository qualifyRepository){
		this.qualifyRepository = qualifyRepository;
	}

	@Override
	public Iterable<Qualify> getAllQualify(){
		return qualifyRepository.findAll();
	}

	

}