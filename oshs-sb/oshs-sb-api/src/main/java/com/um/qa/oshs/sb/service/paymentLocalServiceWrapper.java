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
 * Provides a wrapper for {@link paymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see paymentLocalService
 * @generated
 */
@ProviderType
public class paymentLocalServiceWrapper
	implements paymentLocalService, ServiceWrapper<paymentLocalService> {

	public paymentLocalServiceWrapper(paymentLocalService paymentLocalService) {
		_paymentLocalService = paymentLocalService;
	}

	/**
	 * Adds the payment to the database. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was added
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment addpayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return _paymentLocalService.addpayment(payment);
	}

	/**
	 * Creates a new payment with the primary key. Does not add the payment to the database.
	 *
	 * @param orderID the primary key for the new payment
	 * @return the new payment
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment createpayment(long orderID) {
		return _paymentLocalService.createpayment(orderID);
	}

	/**
	 * Deletes the payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderID the primary key of the payment
	 * @return the payment that was removed
	 * @throws PortalException if a payment with the primary key could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment deletepayment(long orderID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paymentLocalService.deletepayment(orderID);
	}

	/**
	 * Deletes the payment from the database. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was removed
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment deletepayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return _paymentLocalService.deletepayment(payment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paymentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentLocalService.dynamicQuery();
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

		return _paymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.paymentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _paymentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.paymentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _paymentLocalService.dynamicQuery(
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

		return _paymentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _paymentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.qa.oshs.sb.model.payment fetchpayment(long orderID) {
		return _paymentLocalService.fetchpayment(orderID);
	}

	/**
	 * Returns the payment matching the UUID and group.
	 *
	 * @param uuid the payment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching payment, or <code>null</code> if a matching payment could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment fetchpaymentByUuidAndGroupId(
		String uuid, long groupId) {

		return _paymentLocalService.fetchpaymentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _paymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _paymentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _paymentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _paymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the payment with the primary key.
	 *
	 * @param orderID the primary key of the payment
	 * @return the payment
	 * @throws PortalException if a payment with the primary key could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment getpayment(long orderID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paymentLocalService.getpayment(orderID);
	}

	/**
	 * Returns the payment matching the UUID and group.
	 *
	 * @param uuid the payment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching payment
	 * @throws PortalException if a matching payment could not be found
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment getpaymentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paymentLocalService.getpaymentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.qa.oshs.sb.model.impl.paymentModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of payments
	 * @param end the upper bound of the range of payments (not inclusive)
	 * @return the range of payments
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.payment> getpayments(
		int start, int end) {

		return _paymentLocalService.getpayments(start, end);
	}

	/**
	 * Returns all the payments matching the UUID and company.
	 *
	 * @param uuid the UUID of the payments
	 * @param companyId the primary key of the company
	 * @return the matching payments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.payment>
		getpaymentsByUuidAndCompanyId(String uuid, long companyId) {

		return _paymentLocalService.getpaymentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of payments matching the UUID and company.
	 *
	 * @param uuid the UUID of the payments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of payments
	 * @param end the upper bound of the range of payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching payments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.qa.oshs.sb.model.payment>
		getpaymentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.qa.oshs.sb.model.payment> orderByComparator) {

		return _paymentLocalService.getpaymentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of payments.
	 *
	 * @return the number of payments
	 */
	@Override
	public int getpaymentsCount() {
		return _paymentLocalService.getpaymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _paymentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was updated
	 */
	@Override
	public com.um.qa.oshs.sb.model.payment updatepayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return _paymentLocalService.updatepayment(payment);
	}

	@Override
	public paymentLocalService getWrappedService() {
		return _paymentLocalService;
	}

	@Override
	public void setWrappedService(paymentLocalService paymentLocalService) {
		_paymentLocalService = paymentLocalService;
	}

	private paymentLocalService _paymentLocalService;

}