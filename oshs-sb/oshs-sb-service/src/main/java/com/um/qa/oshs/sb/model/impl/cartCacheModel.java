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

import com.um.qa.oshs.sb.model.cart;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing cart in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class cartCacheModel implements CacheModel<cart>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cartCacheModel)) {
			return false;
		}

		cartCacheModel cartCacheModel = (cartCacheModel)obj;

		if (cartID == cartCacheModel.cartID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cartID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cartID=");
		sb.append(cartID);
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
		sb.append(", cartItemsCount=");
		sb.append(cartItemsCount);
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
	public cart toEntityModel() {
		cartImpl cartImpl = new cartImpl();

		if (uuid == null) {
			cartImpl.setUuid("");
		}
		else {
			cartImpl.setUuid(uuid);
		}

		cartImpl.setCartID(cartID);
		cartImpl.setGroupId(groupId);
		cartImpl.setCompanyId(companyId);
		cartImpl.setUserId(userId);

		if (userName == null) {
			cartImpl.setUserName("");
		}
		else {
			cartImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cartImpl.setCreateDate(null);
		}
		else {
			cartImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cartImpl.setModifiedDate(null);
		}
		else {
			cartImpl.setModifiedDate(new Date(modifiedDate));
		}

		cartImpl.setCartItemsCount(cartItemsCount);
		cartImpl.setProductID(productID);
		cartImpl.setQuantity(quantity);
		cartImpl.setTotal(total);
		cartImpl.setCustomerID(customerID);

		cartImpl.resetOriginalValues();

		return cartImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cartID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		cartItemsCount = objectInput.readLong();

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

		objectOutput.writeLong(cartID);

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

		objectOutput.writeLong(cartItemsCount);

		objectOutput.writeLong(productID);

		objectOutput.writeLong(quantity);

		objectOutput.writeFloat(total);

		objectOutput.writeLong(customerID);
	}

	public String uuid;
	public long cartID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long cartItemsCount;
	public long productID;
	public long quantity;
	public float total;
	public long customerID;

}