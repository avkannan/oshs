/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.um.qa.oshs.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link cart}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see cart
 * @generated
 */
@ProviderType
public class cartWrapper
	extends BaseModelWrapper<cart> implements cart, ModelWrapper<cart> {

	public cartWrapper(cart cart) {
		super(cart);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cartID", getCartID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cartItemsCount", getCartItemsCount());
		attributes.put("productID", getProductID());
		attributes.put("quantity", getQuantity());
		attributes.put("total", getTotal());
		attributes.put("customerID", getCustomerID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cartID = (Long)attributes.get("cartID");

		if (cartID != null) {
			setCartID(cartID);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long cartItemsCount = (Long)attributes.get("cartItemsCount");

		if (cartItemsCount != null) {
			setCartItemsCount(cartItemsCount);
		}

		Long productID = (Long)attributes.get("productID");

		if (productID != null) {
			setProductID(productID);
		}

		Long quantity = (Long)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Float total = (Float)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		Long customerID = (Long)attributes.get("customerID");

		if (customerID != null) {
			setCustomerID(customerID);
		}
	}

	/**
	 * Returns the cart ID of this cart.
	 *
	 * @return the cart ID of this cart
	 */
	@Override
	public long getCartID() {
		return model.getCartID();
	}

	/**
	 * Returns the cart items count of this cart.
	 *
	 * @return the cart items count of this cart
	 */
	@Override
	public long getCartItemsCount() {
		return model.getCartItemsCount();
	}

	/**
	 * Returns the company ID of this cart.
	 *
	 * @return the company ID of this cart
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cart.
	 *
	 * @return the create date of this cart
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customer ID of this cart.
	 *
	 * @return the customer ID of this cart
	 */
	@Override
	public long getCustomerID() {
		return model.getCustomerID();
	}

	/**
	 * Returns the group ID of this cart.
	 *
	 * @return the group ID of this cart
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this cart.
	 *
	 * @return the modified date of this cart
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this cart.
	 *
	 * @return the primary key of this cart
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product ID of this cart.
	 *
	 * @return the product ID of this cart
	 */
	@Override
	public long getProductID() {
		return model.getProductID();
	}

	/**
	 * Returns the quantity of this cart.
	 *
	 * @return the quantity of this cart
	 */
	@Override
	public long getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the total of this cart.
	 *
	 * @return the total of this cart
	 */
	@Override
	public float getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the user ID of this cart.
	 *
	 * @return the user ID of this cart
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cart.
	 *
	 * @return the user name of this cart
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cart.
	 *
	 * @return the user uuid of this cart
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cart.
	 *
	 * @return the uuid of this cart
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cart ID of this cart.
	 *
	 * @param cartID the cart ID of this cart
	 */
	@Override
	public void setCartID(long cartID) {
		model.setCartID(cartID);
	}

	/**
	 * Sets the cart items count of this cart.
	 *
	 * @param cartItemsCount the cart items count of this cart
	 */
	@Override
	public void setCartItemsCount(long cartItemsCount) {
		model.setCartItemsCount(cartItemsCount);
	}

	/**
	 * Sets the company ID of this cart.
	 *
	 * @param companyId the company ID of this cart
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cart.
	 *
	 * @param createDate the create date of this cart
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customer ID of this cart.
	 *
	 * @param customerID the customer ID of this cart
	 */
	@Override
	public void setCustomerID(long customerID) {
		model.setCustomerID(customerID);
	}

	/**
	 * Sets the group ID of this cart.
	 *
	 * @param groupId the group ID of this cart
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this cart.
	 *
	 * @param modifiedDate the modified date of this cart
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this cart.
	 *
	 * @param primaryKey the primary key of this cart
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product ID of this cart.
	 *
	 * @param productID the product ID of this cart
	 */
	@Override
	public void setProductID(long productID) {
		model.setProductID(productID);
	}

	/**
	 * Sets the quantity of this cart.
	 *
	 * @param quantity the quantity of this cart
	 */
	@Override
	public void setQuantity(long quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the total of this cart.
	 *
	 * @param total the total of this cart
	 */
	@Override
	public void setTotal(float total) {
		model.setTotal(total);
	}

	/**
	 * Sets the user ID of this cart.
	 *
	 * @param userId the user ID of this cart
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cart.
	 *
	 * @param userName the user name of this cart
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cart.
	 *
	 * @param userUuid the user uuid of this cart
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cart.
	 *
	 * @param uuid the uuid of this cart
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected cartWrapper wrap(cart cart) {
		return new cartWrapper(cart);
	}

}