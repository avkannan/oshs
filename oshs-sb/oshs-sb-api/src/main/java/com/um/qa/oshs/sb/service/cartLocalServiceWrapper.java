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

package com.um.qa.oshs.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link cartLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see cartLocalService
 * @generated
 */
@ProviderType
public class cartLocalServiceWrapper
	implements cartLocalService, ServiceWrapper<cartLocalService> {

	public cartLocalServiceWrapper(cartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	/**
	 * Adds the cart to the database. Also notifies the appropriate model listeners.
	 *
	 * @param cart the cart
	 * @return the cart that was added
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart addcart(
		com.um.qa.oshs.sb.model.cart cart) {

		return _cartLocalService.addcart(cart);
	}

	/**
	 * Creates a new cart with the primary key. Does not add the cart to the database.
	 *
	 * @param cartID the primary key for the new cart
	 * @return the new cart
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart createcart(long cartID) {
		return _cartLocalService.createcart(cartID);
	}

	/**
	 * Deletes the cart from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cart the cart
	 * @return the cart that was removed
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart deletecart(
		com.um.qa.oshs.sb.model.cart cart) {

		return _cartLocalService.deletecart(cart);
	}

	/**
	 * Deletes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cartID the primary key of the cart
	 * @return the cart that was removed
	 * @throws PortalException if a cart with the primary key could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart deletecart(long cartID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.deletecart(cartID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cartLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cartLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.cartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _cartLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.cartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _cartLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cartLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _cartLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.qa.oshs.sb.model.cart fetchcart(long cartID) {
		return _cartLocalService.fetchcart(cartID);
	}

	/**
	 * Returns the cart matching the UUID and group.
	 *
	 * @param uuid the cart's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cart, or <code>null</code> if a matching cart could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart fetchcartByUuidAndGroupId(
		String uuid, long groupId) {

		return _cartLocalService.fetchcartByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cartLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cart with the primary key.
	 *
	 * @param cartID the primary key of the cart
	 * @return the cart
	 * @throws PortalException if a cart with the primary key could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart getcart(long cartID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getcart(cartID);
	}

	/**
	 * Returns the cart matching the UUID and group.
	 *
	 * @param uuid the cart's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cart
	 * @throws PortalException if a matching cart could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart getcartByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getcartByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the carts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.cartModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of carts
	 * @param end the upper bound of the range of carts (not inclusive)
	 * @return the range of carts
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.cart> getcarts(
		int start, int end) {

		return _cartLocalService.getcarts(start, end);
	}

	/**
	 * Returns all the carts matching the UUID and company.
	 *
	 * @param uuid the UUID of the carts
	 * @param companyId the primary key of the company
	 * @return the matching carts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.cart>
		getcartsByUuidAndCompanyId(String uuid, long companyId) {

		return _cartLocalService.getcartsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of carts matching the UUID and company.
	 *
	 * @param uuid the UUID of the carts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of carts
	 * @param end the upper bound of the range of carts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching carts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.cart>
		getcartsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.qa.oshs.sb.model.cart> orderByComparator) {

		return _cartLocalService.getcartsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of carts.
	 *
	 * @return the number of carts
	 */
	@Override
	public int getcartsCount() {
		return _cartLocalService.getcartsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cartLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cartLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cartLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cartLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param cart the cart
	 * @return the cart that was updated
	 */
	@Override
	public com.um.qa.oshs.sb.model.cart updatecart(
		com.um.qa.oshs.sb.model.cart cart) {

		return _cartLocalService.updatecart(cart);
	}

	@Override
	public cartLocalService getWrappedService() {
		return _cartLocalService;
	}

	@Override
	public void setWrappedService(cartLocalService cartLocalService) {
		_cartLocalService = cartLocalService;
	}

	private cartLocalService _cartLocalService;

}