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

import com.um.qa.oshs.sb.model.payment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing payment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class paymentCacheModel implements CacheModel<payment>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof paymentCacheModel)) {
			return false;
		}

		paymentCacheModel paymentCacheModel = (paymentCacheModel)obj;

		if (orderID == paymentCacheModel.orderID) {
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
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public payment toEntityModel() {
		paymentImpl paymentImpl = new paymentImpl();

		if (uuid == null) {
			paymentImpl.setUuid("");
		}
		else {
			paymentImpl.setUuid(uuid);
		}

		paymentImpl.setOrderID(orderID);
		paymentImpl.setGroupId(groupId);
		paymentImpl.setCompanyId(companyId);
		paymentImpl.setUserId(userId);

		if (userName == null) {
			paymentImpl.setUserName("");
		}
		else {
			paymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			paymentImpl.setCreateDate(null);
		}
		else {
			paymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentImpl.setModifiedDate(null);
		}
		else {
			paymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (status == null) {
			paymentImpl.setStatus("");
		}
		else {
			paymentImpl.setStatus(status);
		}

		paymentImpl.setProductID(productID);
		paymentImpl.setQuantity(quantity);
		paymentImpl.setTotal(total);
		paymentImpl.setPrice(price);

		paymentImpl.resetOriginalValues();

		return paymentImpl;
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

		price = objectInput.readLong();
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

		objectOutput.writeLong(price);
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
	public long price;

}