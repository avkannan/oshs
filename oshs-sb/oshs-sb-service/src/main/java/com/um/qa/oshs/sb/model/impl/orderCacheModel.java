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

package com.um.qa.oshs.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.um.qa.oshs.sb.model.order;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing order in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class orderCacheModel implements CacheModel<order>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof orderCacheModel)) {
			return false;
		}

		orderCacheModel orderCacheModel = (orderCacheModel)obj;

		if (orderID == orderCacheModel.orderID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orderID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", orderID=");
		sb.append(orderID);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", productID=");
		sb.append(productID);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", total=");
		sb.append(total);
		sb.append(", customerID=");
		sb.append(customerID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public order toEntityModel() {
		orderImpl orderImpl = new orderImpl();

		if (uuid == null) {
			orderImpl.setUuid("");
		}
		else {
			orderImpl.setUuid(uuid);
		}

		orderImpl.setOrderID(orderID);
		orderImpl.setGroupId(groupId);
		orderImpl.setCompanyId(companyId);
		orderImpl.setUserId(userId);

		if (userName == null) {
			orderImpl.setUserName("");
		}
		else {
			orderImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			orderImpl.setCreateDate(null);
		}
		else {
			orderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			orderImpl.setModifiedDate(null);
		}
		else {
			orderImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (status == null) {
			orderImpl.setStatus("");
		}
		else {
			orderImpl.setStatus(status);
		}

		orderImpl.setProductID(productID);
		orderImpl.setQuantity(quantity);
		orderImpl.setTotal(total);
		orderImpl.setCustomerID(customerID);

		orderImpl.resetOriginalValues();

		return orderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		orderID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		status = objectInput.readUTF();

		productID = objectInput.readLong();

		quantity = objectInput.readLong();

		total = objectInput.readFloat();

		customerID = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(orderID);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(productID);

		objectOutput.writeLong(quantity);

		objectOutput.writeFloat(total);

		objectOutput.writeLong(customerID);
	}

	public String uuid;
	public long orderID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String status;
	public long productID;
	public long quantity;
	public float total;
	public long customerID;

}