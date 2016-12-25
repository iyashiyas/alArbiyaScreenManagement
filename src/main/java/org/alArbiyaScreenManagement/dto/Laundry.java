package org.alArbiyaScreenManagement.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Laundry {

	private String category;
	private String itemName;
	private String description;
	private String status;
	private String hotelServiceCategoryId;
	private CommonsMultipartFile multipartFile;
	private List<CoffeeeShopLanguageHelper> languageHelper;
	private List<String> languageName;
	private List<CoffeeeShopUnitHelper> unitHelper;
	private List<BigDecimal> unitPrice;
 
	
	public List<CoffeeeShopLanguageHelper> getLanguageHelper() {
		if(languageHelper==null) {
			languageHelper = new ArrayList<CoffeeeShopLanguageHelper>();
			languageHelper.add(new CoffeeeShopLanguageHelper());
		}
		return languageHelper;
	}

	public void setLanguageHelper(List<CoffeeeShopLanguageHelper> languageHelper) {
		this.languageHelper = languageHelper;
	}

	public List<CoffeeeShopUnitHelper> getUnitHelper() {
		if(unitHelper==null) {
			unitHelper = new ArrayList<CoffeeeShopUnitHelper>();
			unitHelper.add(new CoffeeeShopUnitHelper());
		}
		return unitHelper;
	}

	public void setUnitHelper(List<CoffeeeShopUnitHelper> unitHelper) {
		this.unitHelper = unitHelper;
	}

 

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getHotelServiceCategoryId() {
		return hotelServiceCategoryId;
	}

	public void setHotelServiceCategoryId(String hotelServiceCategoryId) {
		this.hotelServiceCategoryId = hotelServiceCategoryId;
	}

	public List<String> getLanguageName() {
		if(languageName == null) {
			languageName = new ArrayList<String>();
			languageName.add("");
		}
		return languageName;
	}

	public void setLanguageName(List<String> languageName) {
		this.languageName = languageName;
	}

	public List<BigDecimal> getUnitPrice() {
		if(unitPrice == null) {
			unitPrice = new ArrayList<BigDecimal>();
			unitPrice.add(new BigDecimal(0.0));
		}
		return unitPrice;
	}

	public void setUnitPrice(List<BigDecimal> unitPrice) {
		this.unitPrice = unitPrice;
	}

	 
	public CommonsMultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(CommonsMultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	} 
}
