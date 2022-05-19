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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.um.qa.oshs.sb.model.payment;
import com.um.qa.oshs.sb.model.paymentModel;
import com.um.qa.oshs.sb.model.paymentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the payment service. Represents a row in the &quot;oshs_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>paymentModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link paymentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see paymentImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class paymentModelImpl
	extends BaseModelImpl<payment> implements paymentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment model instance should use the <code>payment</code> interface instead.
	 */
	public static final String TABLE_NAME = "oshs_payment";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"orderID", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"productID", Types.BIGINT}, {"quantity", Types.BIGINT},
		{"total", Types.FLOAT}, {"price", Types.BIGINT},
		{"discount", Types.BIGINT}, {"voucherno", Types.BIGINT},
		{"usedvouchers", Types.BIGINT}, {"usedvouchers1", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("orderID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("productID", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("quantity", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("total", Types.FLOAT);
		TABLE_COLUMNS_MAP.put("price", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("discount", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("voucherno", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("usedvouchers", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("usedvouchers1", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table oshs_payment (uuid_ VARCHAR(75) null,orderID LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,productID LONG,quantity LONG,total DOUBLE,price LONG,discount LONG,voucherno LONG,usedvouchers LONG,usedvouchers1 LONG)";

	public static final String TABLE_SQL_DROP = "drop table oshs_payment";

	public static final String ORDER_BY_JPQL = " ORDER BY payment.orderID ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY oshs_payment.orderID ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long ORDERID_COLUMN_BITMASK = 8L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static payment toModel(paymentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		payment model = new paymentImpl();

		model.setUuid(soapModel.getUuid());
		model.setOrderID(soapModel.getOrderID());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProductID(soapModel.getProductID());
		model.setQuantity(soapModel.getQuantity());
		model.setTotal(soapModel.getTotal());
		model.setPrice(soapModel.getPrice());
		model.setDiscount(soapModel.getDiscount());
		model.setVoucherno(soapModel.getVoucherno());
		model.setUsedvouchers(soapModel.getUsedvouchers());
		model.setUsedvouchers1(soapModel.getUsedvouchers1());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<payment> toModels(paymentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<payment> models = new ArrayList<payment>(soapModels.length);

		for (paymentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public paymentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _orderID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrderID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orderID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return payment.class;
	}

	@Override
	public String getModelClassName() {
		return payment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<payment, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<payment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<payment, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((payment)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<payment, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<payment, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(payment)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<payment, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<payment, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<payment, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<payment, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<payment, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<payment, Object>>();
		Map<String, BiConsumer<payment, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<payment, ?>>();

		attributeGetterFunctions.put("uuid", payment::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<payment, String>)payment::setUuid);
		attributeGetterFunctions.put("orderID", payment::getOrderID);
		attributeSetterBiConsumers.put(
			"orderID", (BiConsumer<payment, Long>)payment::setOrderID);
		attributeGetterFunctions.put("groupId", payment::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<payment, Long>)payment::setGroupId);
		attributeGetterFunctions.put("companyId", payment::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<payment, Long>)payment::setCompanyId);
		attributeGetterFunctions.put("userId", payment::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<payment, Long>)payment::setUserId);
		attributeGetterFunctions.put("userName", payment::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<payment, String>)payment::setUserName);
		attributeGetterFunctions.put("createDate", payment::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<payment, Date>)payment::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", payment::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<payment, Date>)payment::setModifiedDate);
		attributeGetterFunctions.put("productID", payment::getProductID);
		attributeSetterBiConsumers.put(
			"productID", (BiConsumer<payment, Long>)payment::setProductID);
		attributeGetterFunctions.put("quantity", payment::getQuantity);
		attributeSetterBiConsumers.put(
			"quantity", (BiConsumer<payment, Long>)payment::setQuantity);
		attributeGetterFunctions.put("total", payment::getTotal);
		attributeSetterBiConsumers.put(
			"total", (BiConsumer<payment, Float>)payment::setTotal);
		attributeGetterFunctions.put("price", payment::getPrice);
		attributeSetterBiConsumers.put(
			"price", (BiConsumer<payment, Long>)payment::setPrice);
		attributeGetterFunctions.put("discount", payment::getDiscount);
		attributeSetterBiConsumers.put(
			"discount", (BiConsumer<payment, Long>)payment::setDiscount);
		attributeGetterFunctions.put("voucherno", payment::getVoucherno);
		attributeSetterBiConsumers.put(
			"voucherno", (BiConsumer<payment, Long>)payment::setVoucherno);
		attributeGetterFunctions.put("usedvouchers", payment::getUsedvouchers);
		attributeSetterBiConsumers.put(
			"usedvouchers",
			(BiConsumer<payment, Long>)payment::setUsedvouchers);
		attributeGetterFunctions.put(
			"usedvouchers1", payment::getUsedvouchers1);
		attributeSetterBiConsumers.put(
			"usedvouchers1",
			(BiConsumer<payment, Long>)payment::setUsedvouchers1);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getOrderID() {
		return _orderID;
	}

	@Override
	public void setOrderID(long orderID) {
		_orderID = orderID;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getProductID() {
		return _productID;
	}

	@Override
	public void setProductID(long productID) {
		_productID = productID;
	}

	@JSON
	@Override
	public long getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(long quantity) {
		_quantity = quantity;
	}

	@JSON
	@Override
	public float getTotal() {
		return _total;
	}

	@Override
	public void setTotal(float total) {
		_total = total;
	}

	@JSON
	@Override
	public long getPrice() {
		return _price;
	}

	@Override
	public void setPrice(long price) {
		_price = price;
	}

	@JSON
	@Override
	public long getDiscount() {
		return _discount;
	}

	@Override
	public void setDiscount(long discount) {
		_discount = discount;
	}

	@JSON
	@Override
	public long getVoucherno() {
		return _voucherno;
	}

	@Override
	public void setVoucherno(long voucherno) {
		_voucherno = voucherno;
	}

	@JSON
	@Override
	public long getUsedvouchers() {
		return _usedvouchers;
	}

	@Override
	public void setUsedvouchers(long usedvouchers) {
		_usedvouchers = usedvouchers;
	}

	@JSON
	@Override
	public long getUsedvouchers1() {
		return _usedvouchers1;
	}

	@Override
	public void setUsedvouchers1(long usedvouchers1) {
		_usedvouchers1 = usedvouchers1;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(payment.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), payment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public payment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (payment)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		paymentImpl paymentImpl = new paymentImpl();

		paymentImpl.setUuid(getUuid());
		paymentImpl.setOrderID(getOrderID());
		paymentImpl.setGroupId(getGroupId());
		paymentImpl.setCompanyId(getCompanyId());
		paymentImpl.setUserId(getUserId());
		paymentImpl.setUserName(getUserName());
		paymentImpl.setCreateDate(getCreateDate());
		paymentImpl.setModifiedDate(getModifiedDate());
		paymentImpl.setProductID(getProductID());
		paymentImpl.setQuantity(getQuantity());
		paymentImpl.setTotal(getTotal());
		paymentImpl.setPrice(getPrice());
		paymentImpl.setDiscount(getDiscount());
		paymentImpl.setVoucherno(getVoucherno());
		paymentImpl.setUsedvouchers(getUsedvouchers());
		paymentImpl.setUsedvouchers1(getUsedvouchers1());

		paymentImpl.resetOriginalValues();

		return paymentImpl;
	}

	@Override
	public int compareTo(payment payment) {
		long primaryKey = payment.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof payment)) {
			return false;
		}

		payment payment = (payment)obj;

		long primaryKey = payment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		paymentModelImpl paymentModelImpl = this;

		paymentModelImpl._originalUuid = paymentModelImpl._uuid;

		paymentModelImpl._originalGroupId = paymentModelImpl._groupId;

		paymentModelImpl._setOriginalGroupId = false;

		paymentModelImpl._originalCompanyId = paymentModelImpl._companyId;

		paymentModelImpl._setOriginalCompanyId = false;

		paymentModelImpl._setModifiedDate = false;

		paymentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<payment> toCacheModel() {
		paymentCacheModel paymentCacheModel = new paymentCacheModel();

		paymentCacheModel.uuid = getUuid();

		String uuid = paymentCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			paymentCacheModel.uuid = null;
		}

		paymentCacheModel.orderID = getOrderID();

		paymentCacheModel.groupId = getGroupId();

		paymentCacheModel.companyId = getCompanyId();

		paymentCacheModel.userId = getUserId();

		paymentCacheModel.userName = getUserName();

		String userName = paymentCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			paymentCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			paymentCacheModel.createDate = createDate.getTime();
		}
		else {
			paymentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			paymentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			paymentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		paymentCacheModel.productID = getProductID();

		paymentCacheModel.quantity = getQuantity();

		paymentCacheModel.total = getTotal();

		paymentCacheModel.price = getPrice();

		paymentCacheModel.discount = getDiscount();

		paymentCacheModel.voucherno = getVoucherno();

		paymentCacheModel.usedvouchers = getUsedvouchers();

		paymentCacheModel.usedvouchers1 = getUsedvouchers1();

		return paymentCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<payment, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<payment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<payment, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((payment)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<payment, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<payment, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<payment, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((payment)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		payment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		payment.class, ModelWrapper.class
	};
	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _orderID;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _productID;
	private long _quantity;
	private float _total;
	private long _price;
	private long _discount;
	private long _voucherno;
	private long _usedvouchers;
	private long _usedvouchers1;
	private long _columnBitmask;
	private payment _escapedModel;

}