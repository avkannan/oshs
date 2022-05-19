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

import com.um.qa.oshs.sb.model.customer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class customerCacheModel
	implements CacheModel<customer>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customerCacheModel)) {
			return false;
		}

		customerCacheModel customerCacheModel = (customerCacheModel)obj;

		if (customerID == customerCacheModel.customerID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customerID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerID=");
		sb.append(customerID);
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
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", displayName=");
		sb.append(displayName);
		sb.append(", salutation=");
		sb.append(salutation);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", address3=");
		sb.append(address3);
		sb.append(", city=");
		sb.append(city);
		sb.append(", country=");
		sb.append(country);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", phone=");
		sb.append(phone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public customer toEntityModel() {
		customerImpl customerImpl = new customerImpl();

		if (uuid == null) {
			customerImpl.setUuid("");
		}
		else {
			customerImpl.setUuid(uuid);
		}

		customerImpl.setCustomerID(customerID);
		customerImpl.setGroupId(groupId);
		customerImpl.setCompanyId(companyId);
		customerImpl.setUserId(userId);

		if (userName == null) {
			customerImpl.setUserName("");
		}
		else {
			customerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			customerImpl.setCreateDate(null);
		}
		else {
			customerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			customerImpl.setModifiedDate(null);
		}
		else {
			customerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			customerImpl.setFirstName("");
		}
		else {
			customerImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			customerImpl.setMiddleName("");
		}
		else {
			customerImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			customerImpl.setLastName("");
		}
		else {
			customerImpl.setLastName(lastName);
		}

		if (displayName == null) {
			customerImpl.setDisplayName("");
		}
		else {
			customerImpl.setDisplayName(displayName);
		}

		if (salutation == null) {
			customerImpl.setSalutation("");
		}
		else {
			customerImpl.setSalutation(salutation);
		}

		if (address1 == null) {
			customerImpl.setAddress1("");
		}
		else {
			customerImpl.setAddress1(address1);
		}

		if (address2 == null) {
			customerImpl.setAddress2("");
		}
		else {
			customerImpl.setAddress2(address2);
		}

		customerImpl.setAddress3(address3);
		customerImpl.setCity(city);
		customerImpl.setCountry(country);
		customerImpl.setState(state);
		customerImpl.setZip(zip);
		customerImpl.setPhone(phone);

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		customerID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		displayName = objectInput.readUTF();
		salutation = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();

		address3 = objectInput.readLong();

		city = objectInput.readLong();

		country = objectInput.readLong();

		state = objectInput.readLong();

		zip = objectInput.readLong();

		phone = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(customerID);

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

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (displayName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(displayName);
		}

		if (salutation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(salutation);
		}

		if (address1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		objectOutput.writeLong(address3);

		objectOutput.writeLong(city);

		objectOutput.writeLong(country);

		objectOutput.writeLong(state);

		objectOutput.writeLong(zip);

		objectOutput.writeLong(phone);
	}

	public String uuid;
	public long customerID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String middleName;
	public String lastName;
	public String displayName;
	public String salutation;
	public String address1;
	public String address2;
	public long address3;
	public long city;
	public long country;
	public long state;
	public long zip;
	public long phone;

}