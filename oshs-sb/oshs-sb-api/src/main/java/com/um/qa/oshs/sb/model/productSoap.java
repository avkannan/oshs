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
 * This class is used by SOAP remote services, specifically {@link com.um.qa.oshs.sb.service.http.productServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class productSoap implements Serializable {

	public static productSoap toSoapModel(product model) {
		productSoap soapModel = new productSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProductID(model.getProductID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setProductName(model.getProductName());
		soapModel.setImages(model.getImages());
		soapModel.setDescription(model.getDescription());
		soapModel.setQuantity(model.getQuantity());

		return soapModel;
	}

	public static productSoap[] toSoapModels(product[] models) {
		productSoap[] soapModels = new productSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static productSoap[][] toSoapModels(product[][] models) {
		productSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new productSoap[models.length][models[0].length];
		}
		else {
			soapModels = new productSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static productSoap[] toSoapModels(List<product> models) {
		List<productSoap> soapModels = new ArrayList<productSoap>(
			models.size());

		for (product model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new productSoap[soapModels.size()]);
	}

	public productSoap() {
	}

	public long getPrimaryKey() {
		return _productID;
	}

	public void setPrimaryKey(long pk) {
		setProductID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProductID() {
		return _productID;
	}

	public void setProductID(long productID) {
		_productID = productID;
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

	public long getProductName() {
		return _productName;
	}

	public void setProductName(long productName) {
		_productName = productName;
	}

	public String getImages() {
		return _images;
	}

	public void setImages(String images) {
		_images = images;
	}

	public long getDescription() {
		return _description;
	}

	public void setDescription(long description) {
		_description = description;
	}

	public float getQuantity() {
		return _quantity;
	}

	public void setQuantity(float quantity) {
		_quantity = quantity;
	}

	private String _uuid;
	private long _productID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _productName;
	private String _images;
	private long _description;
	private float _quantity;

}