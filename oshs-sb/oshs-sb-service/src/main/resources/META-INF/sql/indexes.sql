create index IX_82AF27AA on oshs_cart (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A5190AC on oshs_cart (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8877B968 on oshs_customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FFEF79EA on oshs_customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6307A238 on oshs_order (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_900356BA on oshs_order (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FD2159 on oshs_product (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_31E02A1B on oshs_product (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7C9160CA on oshs_staff (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E3AF91CC on oshs_staff (uuid_[$COLUMN_LENGTH:75$], groupId);