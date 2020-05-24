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