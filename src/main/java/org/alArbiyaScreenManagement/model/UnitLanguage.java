package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UNIT_LANGUAGE")
public class UnitLanguage {
	
	@Id @GeneratedValue
	@Column(name="UNIT_LANGUAGE_ID")
	private long id;
	
	@Column(name="UNIT_LANGUAGE_NAME") 
	private String unitLanguageName;
	
	@OneToOne
	@JoinColumn(name="LANGUAGE_ID", nullable=false)
	private Language language;
	
	@ManyToOne
	@JoinColumn(name="UNIT_ID")
	private Unit unit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUnitLanguageName() {
		return unitLanguageName;
	}

	public void setUnitLanguageName(String unitLanguageName) {
		this.unitLanguageName = unitLanguageName;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
        if (!unit.getUnitLanguages().contains(this)) {
        	unit.getUnitLanguages().add(this);
        }
	}
	
	public boolean isEmpty() {
		return (this.getUnitLanguageName() == null || this.getUnitLanguageName().isEmpty());
	}

}