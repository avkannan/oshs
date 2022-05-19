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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for payment. This utility wraps
 * <code>com.um.qa.oshs.sb.service.impl.paymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see paymentLocalService
 * @generated
 */
@ProviderType
public class paymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.um.qa.oshs.sb.service.impl.paymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the payment to the database. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was added
	 */
	public static com.um.qa.oshs.sb.model.payment addpayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return getService().addpayment(payment);
	}

	/**
	 * Creates a new payment with the primary key. Does not add the payment to the database.
	 *
	 * @param orderID the primary key for the new payment
	 * @return the new payment
	 */
	public static com.um.qa.oshs.sb.model.payment createpayment(long orderID) {
		return getService().createpayment(orderID);
	}

	/**
	 * Deletes the payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderID the primary key of the payment
	 * @return the payment that was removed
	 * @throws PortalException if a payment with the primary key could not be found
	 */
	public static com.um.qa.oshs.sb.model.payment deletepayment(long orderID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletepayment(orderID);
	}

	/**
	 * Deletes the payment from the database. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was removed
	 */
	public static com.um.qa.oshs.sb.model.payment deletepayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return getService().deletepayment(payment);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.um.qa.oshs.sb.model.payment fetchpayment(long orderID) {
		return getService().fetchpayment(orderID);
	}

	/**
	 * Returns the payment matching the UUID and group.
	 *
	 * @param uuid the payment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching payment, or <code>null</code> if a matching payment could not be found
	 */
	public static com.um.qa.oshs.sb.model.payment fetchpaymentByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchpaymentByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the payment with the primary key.
	 *
	 * @param orderID the primary key of the payment
	 * @return the payment
	 * @throws PortalException if a payment with the primary key could not be found
	 */
	public static com.um.qa.oshs.sb.model.payment getpayment(long orderID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getpayment(orderID);
	}

	/**
	 * Returns the payment matching the UUID and group.
	 *
	 * @param uuid the payment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching payment
	 * @throws PortalException if a matching payment could not be found
	 */
	public static com.um.qa.oshs.sb.model.payment getpaymentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getpaymentByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.um.qa.oshs.sb.model.payment> getpayments(
		int start, int end) {

		return getService().getpayments(start, end);
	}

	/**
	 * Returns all the payments matching the UUID and company.
	 *
	 * @param uuid the UUID of the payments
	 * @param companyId the primary key of the company
	 * @return the matching payments, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.qa.oshs.sb.model.payment>
		getpaymentsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getpaymentsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.um.qa.oshs.sb.model.payment>
		getpaymentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.qa.oshs.sb.model.payment> orderByComparator) {

		return getService().getpaymentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of payments.
	 *
	 * @return the number of payments
	 */
	public static int getpaymentsCount() {
		return getService().getpaymentsCount();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param payment the payment
	 * @return the payment that was updated
	 */
	public static com.um.qa.oshs.sb.model.payment updatepayment(
		com.um.qa.oshs.sb.model.payment payment) {

		return getService().updatepayment(payment);
	}

	public static paymentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<paymentLocalService, paymentLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(paymentLocalService.class);

		ServiceTracker<paymentLocalService, paymentLocalService>
			serviceTracker =
				new ServiceTracker<paymentLocalService, paymentLocalService>(
					bundle.getBundleContext(), paymentLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}