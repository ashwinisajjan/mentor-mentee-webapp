package com.fairfield.chalktalk.dao;

import java.util.List;

import com.fairfield.chalktalk.dao.common.IOperations;
import com.fairfield.chalktalk.entities.Mentor;

public interface IMentorDao extends IOperations<Mentor> {

	List<Mentor> searchByMentorName(String name);
    //

	List<Mentor> searchBySkills(String skill);
}
