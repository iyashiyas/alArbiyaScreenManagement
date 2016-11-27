package org.alArbiyaScreenManagement.service.impl;

import java.util.List;

import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.repository.LanguageRepository;
import org.alArbiyaScreenManagement.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired 
	private LanguageRepository languageRepository;
	
	@Override
	public List<Language> getEnableLanguages() {
		return languageRepository.getEnableLanguages();
	}

}
