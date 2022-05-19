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
 * This class is a wrapper for {@link payment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see payment
 * @generated
 */
@ProviderType
public class paymentWrapper
	extends BaseModelWrapper<payment>
	implements payment, ModelWrapper<payment> {

	public paymentWrapper(payment payment) {
		super(payment);
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
		attributes.put("productID", getProductID());
		attributes.put("quantity", getQuantity());
		attributes.put("total", getTotal());
		attributes.put("price", getPrice());
		attributes.put("discount", getDiscount());
		attributes.put("voucherno", getVoucherno());
		attributes.put("usedvouchers", getUsedvouchers());
		attributes.put("usedvouchers1", getUsedvouchers1());

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

		Long price = (Long)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Long discount = (Long)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		Long voucherno = (Long)attributes.get("voucherno");

		if (voucherno != null) {
			setVoucherno(voucherno);
		}

		Long usedvouchers = (Long)attributes.get("usedvouchers");

		if (usedvouchers != null) {
			setUsedvouchers(usedvouchers);
		}

		Long usedvouchers1 = (Long)attributes.get("usedvouchers1");

		if (usedvouchers1 != null) {
			setUsedvouchers1(usedvouchers1);
		}
	}

	/**
	 * Returns the company ID of this payment.
	 *
	 * @return the company ID of this payment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this payment.
	 *
	 * @return the create date of this payment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the discount of this payment.
	 *
	 * @return the discount of this payment
	 */
	@Override
	public long getDiscount() {
		return model.getDiscount();
	}

	/**
	 * Returns the group ID of this payment.
	 *
	 * @return the group ID of this payment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this payment.
	 *
	 * @return the modified date of this payment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the order ID of this payment.
	 *
	 * @return the order ID of this payment
	 */
	@Override
	public long getOrderID() {
		return model.getOrderID();
	}

	/**
	 * Returns the price of this payment.
	 *
	 * @return the price of this payment
	 */
	@Override
	public long getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this payment.
	 *
	 * @return the primary key of this payment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product ID of this payment.
	 *
	 * @return the product ID of this payment
	 */
	@Override
	public long getProductID() {
		return model.getProductID();
	}

	/**
	 * Returns the quantity of this payment.
	 *
	 * @return the quantity of this payment
	 */
	@Override
	public long getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the total of this payment.
	 *
	 * @return the total of this payment
	 */
	@Override
	public float getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the usedvouchers of this payment.
	 *
	 * @return the usedvouchers of this payment
	 */
	@Override
	public long getUsedvouchers() {
		return model.getUsedvouchers();
	}

	/**
	 * Returns the usedvouchers1 of this payment.
	 *
	 * @return the usedvouchers1 of this payment
	 */
	@Override
	public long getUsedvouchers1() {
		return model.getUsedvouchers1();
	}

	/**
	 * Returns the user ID of this payment.
	 *
	 * @return the user ID of this payment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this payment.
	 *
	 * @return the user name of this payment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this payment.
	 *
	 * @return the user uuid of this payment
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this payment.
	 *
	 * @return the uuid of this payment
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the voucherno of this payment.
	 *
	 * @return the voucherno of this payment
	 */
	@Override
	public long getVoucherno() {
		return model.getVoucherno();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this payment.
	 *
	 * @param companyId the company ID of this payment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this payment.
	 *
	 * @param createDate the create date of this payment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the discount of this payment.
	 *
	 * @param discount the discount of this payment
	 */
	@Override
	public void setDiscount(long discount) {
		model.setDiscount(discount);
	}

	/**
	 * Sets the group ID of this payment.
	 *
	 * @param groupId the group ID of this payment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this payment.
	 *
	 * @param modifiedDate the modified date of this payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the order ID of this payment.
	 *
	 * @param orderID the order ID of this payment
	 */
	@Override
	public void setOrderID(long orderID) {
		model.setOrderID(orderID);
	}

	/**
	 * Sets the price of this payment.
	 *
	 * @param price the price of this payment
	 */
	@Override
	public void setPrice(long price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this payment.
	 *
	 * @param primaryKey the primary key of this payment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product ID of this payment.
	 *
	 * @param productID the product ID of this payment
	 */
	@Override
	public void setProductID(long productID) {
		model.setProductID(productID);
	}

	/**
	 * Sets the quantity of this payment.
	 *
	 * @param quantity the quantity of this payment
	 */
	@Override
	public void setQuantity(long quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the total of this payment.
	 *
	 * @param total the total of this payment
	 */
	@Override
	public void setTotal(float total) {
		model.setTotal(total);
	}

	/**
	 * Sets the usedvouchers of this payment.
	 *
	 * @param usedvouchers the usedvouchers of this payment
	 */
	@Override
	public void setUsedvouchers(long usedvouchers) {
		model.setUsedvouchers(usedvouchers);
	}

	/**
	 * Sets the usedvouchers1 of this payment.
	 *
	 * @param usedvouchers1 the usedvouchers1 of this payment
	 */
	@Override
	public void setUsedvouchers1(long usedvouchers1) {
		model.setUsedvouchers1(usedvouchers1);
	}

	/**
	 * Sets the user ID of this payment.
	 *
	 * @param userId the user ID of this payment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this payment.
	 *
	 * @param userName the user name of this payment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this payment.
	 *
	 * @param userUuid the user uuid of this payment
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this payment.
	 *
	 * @param uuid the uuid of this payment
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the voucherno of this payment.
	 *
	 * @param voucherno the voucherno of this payment
	 */
	@Override
	public void setVoucherno(long voucherno) {
		model.setVoucherno(voucherno);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected paymentWrapper wrap(payment payment) {
		return new paymentWrapper(payment);
	}

}