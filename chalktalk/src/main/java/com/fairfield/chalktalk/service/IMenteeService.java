package com.fairfield.chalktalk.service;

import com.fairfield.chalktalk.dto.StartUpApplicationDTO;

public interface IMenteeService {
	Long addStartupApplication(StartUpApplicationDTO requestDTO);
}
