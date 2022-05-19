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
 * Provides a wrapper for {@link paymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see paymentService
 * @generated
 */
@ProviderType
public class paymentServiceWrapper
	implements paymentService, ServiceWrapper<paymentService> {

	public paymentServiceWrapper(paymentService paymentService) {
		_paymentService = paymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _paymentService.getOSGiServiceIdentifier();
	}

	@Override
	public paymentService getWrappedService() {
		return _paymentService;
	}

	@Override
	public void setWrappedService(paymentService paymentService) {
		_paymentService = paymentService;
	}

	private paymentService _paymentService;

}