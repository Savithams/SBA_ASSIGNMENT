package com.dxc.service;

import java.util.List;

import com.dxc.model.*;

public interface NoteService {

	public Note addNote(Note notes);
	public Note updateNotes(Note notes);
	public void deleteNote(int id);
	public Note getNotesById(int id);
	public List<Note> getAllNotes();
}