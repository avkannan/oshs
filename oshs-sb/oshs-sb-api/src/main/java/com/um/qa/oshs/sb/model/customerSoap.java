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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.um.qa.oshs.sb.service.http.customerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class customerSoap implements Serializable {

	public static customerSoap toSoapModel(customer model) {
		customerSoap soapModel = new customerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCustomerID(model.getCustomerID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setLastName(model.getLastName());
		soapModel.setDisplayName(model.getDisplayName());
		soapModel.setSalutation(model.getSalutation());
		soapModel.setAddress1(model.getAddress1());
		soapModel.setAddress2(model.getAddress2());
		soapModel.setAddress3(model.getAddress3());
		soapModel.setCity(model.getCity());
		soapModel.setCountry(model.getCountry());
		soapModel.setState(model.getState());
		soapModel.setZip(model.getZip());
		soapModel.setPhone(model.getPhone());

		return soapModel;
	}

	public static customerSoap[] toSoapModels(customer[] models) {
		customerSoap[] soapModels = new customerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static customerSoap[][] toSoapModels(customer[][] models) {
		customerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new customerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new customerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static customerSoap[] toSoapModels(List<customer> models) {
		List<customerSoap> soapModels = new ArrayList<customerSoap>(
			models.size());

		for (customer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new customerSoap[soapModels.size()]);
	}

	public customerSoap() {
	}

	public long getPrimaryKey() {
		return _customerID;
	}

	public void setPrimaryKey(long pk) {
		setCustomerID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCustomerID() {
		return _customerID;
	}

	public void setCustomerID(long customerID) {
		_customerID = customerID;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getDisplayName() {
		return _displayName;
	}

	public void setDisplayName(String displayName) {
		_displayName = displayName;
	}

	public String getSalutation() {
		return _salutation;
	}

	public void setSalutation(String salutation) {
		_salutation = salutation;
	}

	public String getAddress1() {
		return _address1;
	}

	public void setAddress1(String address1) {
		_address1 = address1;
	}

	public String getAddress2() {
		return _address2;
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public long getAddress3() {
		return _address3;
	}

	public void setAddress3(long address3) {
		_address3 = address3;
	}

	public long getCity() {
		return _city;
	}

	public void setCity(long city) {
		_city = city;
	}

	public long getCountry() {
		return _country;
	}

	public void setCountry(long country) {
		_country = country;
	}

	public long getState() {
		return _state;
	}

	public void setState(long state) {
		_state = state;
	}

	public long getZip() {
		return _zip;
	}

	public void setZip(long zip) {
		_zip = zip;
	}

	public long getPhone() {
		return _phone;
	}

	public void setPhone(long phone) {
		_phone = phone;
	}

	private String _uuid;
	private long _customerID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _displayName;
	private String _salutation;
	private String _address1;
	private String _address2;
	private long _address3;
	private long _city;
	private long _country;
	private long _state;
	private long _zip;
	private long _phone;

}