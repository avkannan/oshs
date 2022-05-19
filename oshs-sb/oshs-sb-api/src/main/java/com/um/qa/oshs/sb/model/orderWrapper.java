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
 * This class is a wrapper for {@link order}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see order
 * @generated
 */
@ProviderType
public class orderWrapper
	extends BaseModelWrapper<order> implements order, ModelWrapper<order> {

	public orderWrapper(order order) {
		super(order);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("orderID", getOrderID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
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

		Long orderID = (Long)attributes.get("orderID");

		if (orderID != null) {
			setOrderID(orderID);
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

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	 * Returns the company ID of this order.
	 *
	 * @return the company ID of this order
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this order.
	 *
	 * @return the create date of this order
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customer ID of this order.
	 *
	 * @return the customer ID of this order
	 */
	@Override
	public long getCustomerID() {
		return model.getCustomerID();
	}

	/**
	 * Returns the group ID of this order.
	 *
	 * @return the group ID of this order
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this order.
	 *
	 * @return the modified date of this order
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the order ID of this order.
	 *
	 * @return the order ID of this order
	 */
	@Override
	public long getOrderID() {
		return model.getOrderID();
	}

	/**
	 * Returns the primary key of this order.
	 *
	 * @return the primary key of this order
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product ID of this order.
	 *
	 * @return the product ID of this order
	 */
	@Override
	public long getProductID() {
		return model.getProductID();
	}

	/**
	 * Returns the quantity of this order.
	 *
	 * @return the quantity of this order
	 */
	@Override
	public long getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the status of this order.
	 *
	 * @return the status of this order
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the total of this order.
	 *
	 * @return the total of this order
	 */
	@Override
	public float getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the user ID of this order.
	 *
	 * @return the user ID of this order
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this order.
	 *
	 * @return the user name of this order
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this order.
	 *
	 * @return the user uuid of this order
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this order.
	 *
	 * @return the uuid of this order
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
	 * Sets the company ID of this order.
	 *
	 * @param companyId the company ID of this order
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this order.
	 *
	 * @param createDate the create date of this order
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customer ID of this order.
	 *
	 * @param customerID the customer ID of this order
	 */
	@Override
	public void setCustomerID(long customerID) {
		model.setCustomerID(customerID);
	}

	/**
	 * Sets the group ID of this order.
	 *
	 * @param groupId the group ID of this order
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this order.
	 *
	 * @param modifiedDate the modified date of this order
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the order ID of this order.
	 *
	 * @param orderID the order ID of this order
	 */
	@Override
	public void setOrderID(long orderID) {
		model.setOrderID(orderID);
	}

	/**
	 * Sets the primary key of this order.
	 *
	 * @param primaryKey the primary key of this order
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product ID of this order.
	 *
	 * @param productID the product ID of this order
	 */
	@Override
	public void setProductID(long productID) {
		model.setProductID(productID);
	}

	/**
	 * Sets the quantity of this order.
	 *
	 * @param quantity the quantity of this order
	 */
	@Override
	public void setQuantity(long quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the status of this order.
	 *
	 * @param status the status of this order
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the total of this order.
	 *
	 * @param total the total of this order
	 */
	@Override
	public void setTotal(float total) {
		model.setTotal(total);
	}

	/**
	 * Sets the user ID of this order.
	 *
	 * @param userId the user ID of this order
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this order.
	 *
	 * @param userName the user name of this order
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this order.
	 *
	 * @param userUuid the user uuid of this order
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this order.
	 *
	 * @param uuid the uuid of this order
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
	protected orderWrapper wrap(order order) {
		return new orderWrapper(order);
	}

}