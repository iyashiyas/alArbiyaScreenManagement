package org.alArbiyaScreenManagement.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
   
 



import org.alArbiyaScreenManagement.model.HotelServicesCategory;
import org.alArbiyaScreenManagement.model.HotelServicesGroup;
import org.alArbiyaScreenManagement.model.HotelServicesItem;
import org.alArbiyaScreenManagement.model.HotelServicesValue;
import org.alArbiyaScreenManagement.model.Ingredient;
import org.alArbiyaScreenManagement.model.Orders;
import org.alArbiyaScreenManagement.model.Unit;
import org.alArbiyaScreenManagement.repository.ActionRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ActionRepositoryImpl implements ActionRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	 
	@Override
	public void hotelService(HotelServicesItem hotelServicesItem) {
		entityManager.persist(hotelServicesItem);
		for(HotelServicesGroup hotelServiceParentGroup:hotelServicesItem.getHotelServiceParentGroups()){
			entityManager.persist(hotelServiceParentGroup);
		}
		for(HotelServicesGroup hotelServiceParentGroup:hotelServicesItem.getHotelServiceParentGroups()){
			for(HotelServicesGroup hotelServiceChildGroup:hotelServiceParentGroup.getHotelServiceChildGroups()){
				entityManager.persist(hotelServiceChildGroup);
			}
		}
		
		for(HotelServicesGroup hotelServiceParentGroup:hotelServicesItem.getHotelServiceParentGroups()){
			for(HotelServicesGroup hotelServiceChildGroup:hotelServiceParentGroup.getHotelServiceChildGroups()){
				for(HotelServicesValue hotelServicesValue:hotelServiceChildGroup.getHotelServicesValues()){
					entityManager.persist(hotelServicesValue);
				}
			}
		}
		 
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HotelServicesItem> getAllCoffeShopItems() {
		Query query = entityManager.createQuery("SELECT hotel_service_item from HotelServicesItem hotel_service_item where hotelServicesCategory_SERVICE_CATEGORY_ID='1' order by id", HotelServicesItem.class);
		return query.getResultList();
	}
	
	@Override
	public HotelServicesCategory getHotelServicesCategory(long hotelServicesCategoryId) {
		TypedQuery<HotelServicesCategory> query = this.entityManager.createQuery("SELECT cate from HotelServicesCategory cate WHERE cate.hotelServicesCategoryId=:hotelServicesCategoryId", HotelServicesCategory.class);
		HotelServicesCategory hotelServicesCategory = query.setParameter("hotelServicesCategoryId", hotelServicesCategoryId).getSingleResult();
		return hotelServicesCategory;
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HotelServicesItem> getAllRestaurantItems() {
	  Query query = entityManager.createQuery("SELECT hotel_service_item from HotelServicesItem hotel_service_item where hotelServicesCategory_SERVICE_CATEGORY_ID='6' order by id", HotelServicesItem.class);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HotelServicesCategory> getHotelServiceCategories() {
		 Query query = entityManager.createQuery("SELECT hotel_service_category from HotelServicesCategory hotel_service_category where categoryStatus='ENABLED'", HotelServicesCategory.class);
		return query.getResultList();
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<HotelServicesItem> getHotelServiceItems(String serviceId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT item from HotelServicesItem item where item.hotelServicesCategory.id=:serviceId", HotelServicesItem.class);
		query.setParameter("serviceId", Long.parseLong(serviceId));
	    return query.getResultList();
	}

	@Override
	public List<HotelServicesGroup> getAllParentCategories(List<Long> hotelServicesItemsIds){
		Query query = entityManager.createQuery("SELECT parentGroup from HotelServicesGroup parentGroup where parentGroup.hotelServicesItem.id in :hotelServicesItemsIds", HotelServicesGroup.class);
		query.setParameter("hotelServicesItemsIds", hotelServicesItemsIds);
		List<HotelServicesGroup> group = query.getResultList();
		return query.getResultList();
	}

	@Override
	public Orders addOrder(Orders order) {
		// TODO Auto-generated method stub
		List<Ingredient> ingredients = order.getIngredients();
		List<Unit> units = order.getUnit();
		order.setIngredients(new ArrayList<Ingredient>());
		if(ingredients != null ) {
			for(Ingredient ingredient : ingredients){
				if(ingredient.getId() != 0)
				order.getIngredients().add(ingredient);
			}
		}
		
		order.setUnit(new ArrayList<Unit>());
		if(units != null ) {
			for(Unit unit : units){
				if(unit.getId() != 0)
				order.getUnit().add(unit);
			}
		}
		
		entityManager.merge(order);
		return order;
	}
	   
	
}
