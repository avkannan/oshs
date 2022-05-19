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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the payment service. Represents a row in the &quot;oshs_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.um.qa.oshs.sb.model.impl.paymentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.um.qa.oshs.sb.model.impl.paymentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see payment
 * @generated
 */
@ProviderType
public interface paymentModel
	extends BaseModel<payment>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a payment model instance should use the {@link payment} interface instead.
	 */

	/**
	 * Returns the primary key of this payment.
	 *
	 * @return the primary key of this payment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this payment.
	 *
	 * @param primaryKey the primary key of this payment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this payment.
	 *
	 * @return the uuid of this payment
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this payment.
	 *
	 * @param uuid the uuid of this payment
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the order ID of this payment.
	 *
	 * @return the order ID of this payment
	 */
	public long getOrderID();

	/**
	 * Sets the order ID of this payment.
	 *
	 * @param orderID the order ID of this payment
	 */
	public void setOrderID(long orderID);

	/**
	 * Returns the group ID of this payment.
	 *
	 * @return the group ID of this payment
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this payment.
	 *
	 * @param groupId the group ID of this payment
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this payment.
	 *
	 * @return the company ID of this payment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this payment.
	 *
	 * @param companyId the company ID of this payment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this payment.
	 *
	 * @return the user ID of this payment
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this payment.
	 *
	 * @param userId the user ID of this payment
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this payment.
	 *
	 * @return the user uuid of this payment
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this payment.
	 *
	 * @param userUuid the user uuid of this payment
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this payment.
	 *
	 * @return the user name of this payment
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this payment.
	 *
	 * @param userName the user name of this payment
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this payment.
	 *
	 * @return the create date of this payment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this payment.
	 *
	 * @param createDate the create date of this payment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this payment.
	 *
	 * @return the modified date of this payment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this payment.
	 *
	 * @param modifiedDate the modified date of this payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product ID of this payment.
	 *
	 * @return the product ID of this payment
	 */
	public long getProductID();

	/**
	 * Sets the product ID of this payment.
	 *
	 * @param productID the product ID of this payment
	 */
	public void setProductID(long productID);

	/**
	 * Returns the quantity of this payment.
	 *
	 * @return the quantity of this payment
	 */
	public long getQuantity();

	/**
	 * Sets the quantity of this payment.
	 *
	 * @param quantity the quantity of this payment
	 */
	public void setQuantity(long quantity);

	/**
	 * Returns the total of this payment.
	 *
	 * @return the total of this payment
	 */
	public float getTotal();

	/**
	 * Sets the total of this payment.
	 *
	 * @param total the total of this payment
	 */
	public void setTotal(float total);

	/**
	 * Returns the price of this payment.
	 *
	 * @return the price of this payment
	 */
	public long getPrice();

	/**
	 * Sets the price of this payment.
	 *
	 * @param price the price of this payment
	 */
	public void setPrice(long price);

	/**
	 * Returns the discount of this payment.
	 *
	 * @return the discount of this payment
	 */
	public long getDiscount();

	/**
	 * Sets the discount of this payment.
	 *
	 * @param discount the discount of this payment
	 */
	public void setDiscount(long discount);

	/**
	 * Returns the voucherno of this payment.
	 *
	 * @return the voucherno of this payment
	 */
	public long getVoucherno();

	/**
	 * Sets the voucherno of this payment.
	 *
	 * @param voucherno the voucherno of this payment
	 */
	public void setVoucherno(long voucherno);

	/**
	 * Returns the usedvouchers of this payment.
	 *
	 * @return the usedvouchers of this payment
	 */
	public long getUsedvouchers();

	/**
	 * Sets the usedvouchers of this payment.
	 *
	 * @param usedvouchers the usedvouchers of this payment
	 */
	public void setUsedvouchers(long usedvouchers);

}