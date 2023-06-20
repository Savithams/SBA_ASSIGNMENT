package com.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.*;

@Repository
public interface NoteDAO extends JpaRepository<Note, Integer> {

}
