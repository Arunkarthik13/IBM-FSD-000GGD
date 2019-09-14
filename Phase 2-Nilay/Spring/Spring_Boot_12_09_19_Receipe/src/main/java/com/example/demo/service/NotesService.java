package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Notes;


public interface NotesService {

public List<Notes> findAll();
	
	public Notes findById(Long theId);
	
	public void save(Notes theNotes);
	
	public void deleteById(Long theId);
}
