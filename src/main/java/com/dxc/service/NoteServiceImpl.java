package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.*;
import com.dxc.dao.*;

@Service
public abstract class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDAO repo;

	@Override
	public Note addNote(Note notes) {

		Optional<Note> n = repo.findById(notes.getNoteId());

		if (n.isEmpty()) {
			repo.save(notes);
			return notes;
		}
		return null;
	}

	@Override
	public Note updateNotes(Note notes) {
		Optional<Note> n = repo.findById(notes.getNoteId());

		if (n.isPresent()) {
			repo.save(notes);
			return notes;
		}
		return null;
	}

	@Override
	public void deleteNote(int id) {
		Optional<Note> n = repo.findById(id);
		
		if(n.isPresent()) {
			repo.deleteById(id);
			return;
		}
	}

	@Override
	public Note getNotesById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Note> getAllNotes() {
		return repo.findAll();
	}
}
