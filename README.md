# Getting Starter

### scirpt init
```sql
create table test.users
(
    id         bigint auto_increment,
    first_name varchar(50) null,
    last_name  varchar(50) null,
    created_at datetime    null,
    updated_at datetime    null,
    constraint users_id_uindex
        unique (id)
);

alter table test.users
    add primary key (id);
```
### Reference Documentation
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/html/spring-boot-features.html#boot-features-r2dbc)

### Additional Links
These additional references should also help you:

* [R2DBC Homepage](https://r2dbc.io)

### Guides
The following guides illustrate how to use some features concretely:
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

