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
 * This class is used by SOAP remote services, specifically {@link com.um.qa.oshs.sb.service.http.cartServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class cartSoap implements Serializable {

	public static cartSoap toSoapModel(cart model) {
		cartSoap soapModel = new cartSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCartID(model.getCartID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCartItemsCount(model.getCartItemsCount());
		soapModel.setProductID(model.getProductID());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setTotal(model.getTotal());
		soapModel.setCustomerID(model.getCustomerID());

		return soapModel;
	}

	public static cartSoap[] toSoapModels(cart[] models) {
		cartSoap[] soapModels = new cartSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cartSoap[][] toSoapModels(cart[][] models) {
		cartSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cartSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cartSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cartSoap[] toSoapModels(List<cart> models) {
		List<cartSoap> soapModels = new ArrayList<cartSoap>(models.size());

		for (cart model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cartSoap[soapModels.size()]);
	}

	public cartSoap() {
	}

	public long getPrimaryKey() {
		return _cartID;
	}

	public void setPrimaryKey(long pk) {
		setCartID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCartID() {
		return _cartID;
	}

	public void setCartID(long cartID) {
		_cartID = cartID;
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

	public long getCartItemsCount() {
		return _cartItemsCount;
	}

	public void setCartItemsCount(long cartItemsCount) {
		_cartItemsCount = cartItemsCount;
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

	public long getCustomerID() {
		return _customerID;
	}

	public void setCustomerID(long customerID) {
		_customerID = customerID;
	}

	private String _uuid;
	private long _cartID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cartItemsCount;
	private long _productID;
	private long _quantity;
	private float _total;
	private long _customerID;

}