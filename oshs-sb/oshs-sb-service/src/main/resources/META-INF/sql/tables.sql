create table oshs_cart (
	uuid_ VARCHAR(75) null,
	cartID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cartItemsCount LONG,
	productID LONG,
	quantity LONG,
	total DOUBLE,
	customerID LONG
);

create table oshs_customer (
	uuid_ VARCHAR(75) null,
	customerID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	address3 LONG,
	city LONG,
	country LONG,
	state_ LONG,
	zip LONG,
	phone LONG
);

create table oshs_order (
	uuid_ VARCHAR(75) null,
	orderID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status VARCHAR(75) null,
	productID LONG,
	quantity LONG,
	total DOUBLE,
	customerID LONG
);

create table oshs_payment (
	uuid_ VARCHAR(75) null,
	orderID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status VARCHAR(75) null,
	productID LONG,
	quantity LONG,
	total DOUBLE,
	price LONG
);

create table oshs_product (
	uuid_ VARCHAR(75) null,
	productID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productName LONG,
	images VARCHAR(75) null,
	description LONG,
	quantity DOUBLE
);

create table oshs_staff (
	uuid_ VARCHAR(75) null,
	staffID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	staffType VARCHAR(75) null,
	designation VARCHAR(75) null,
	qualifcation VARCHAR(75) null,
	experience LONG
);