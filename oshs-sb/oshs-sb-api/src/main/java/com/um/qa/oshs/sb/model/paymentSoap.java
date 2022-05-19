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
 * This class is used by SOAP remote services, specifically {@link com.um.qa.oshs.sb.service.http.paymentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class paymentSoap implements Serializable {

	public static paymentSoap toSoapModel(payment model) {
		paymentSoap soapModel = new paymentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOrderID(model.getOrderID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setProductID(model.getProductID());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setTotal(model.getTotal());
		soapModel.setPrice(model.getPrice());

		return soapModel;
	}

	public static paymentSoap[] toSoapModels(payment[] models) {
		paymentSoap[] soapModels = new paymentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static paymentSoap[][] toSoapModels(payment[][] models) {
		paymentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new paymentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new paymentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static paymentSoap[] toSoapModels(List<payment> models) {
		List<paymentSoap> soapModels = new ArrayList<paymentSoap>(
			models.size());

		for (payment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new paymentSoap[soapModels.size()]);
	}

	public paymentSoap() {
	}

	public long getPrimaryKey() {
		return _orderID;
	}

	public void setPrimaryKey(long pk) {
		setOrderID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOrderID() {
		return _orderID;
	}

	public void setOrderID(long orderID) {
		_orderID = orderID;
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

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getProductID() {
		return _productID;
	}

	public void setProductID(long productID) {
		_productID = productID;
	}

	public long getQuantity() {
		return _quantity;
	}

	public void setQuantity(long quantity) {
		_quantity = quantity;
	}

	public float getTotal() {
		return _total;
	}

	public void setTotal(float total) {
		_total = total;
	}

	public long getPrice() {
		return _price;
	}

	public void setPrice(long price) {
		_price = price;
	}

	private String _uuid;
	private long _orderID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _status;
	private long _productID;
	private long _quantity;
	private float _total;
	private long _price;

}