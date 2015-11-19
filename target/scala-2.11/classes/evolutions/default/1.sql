# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table movie_ratings (
  id                        integer auto_increment not null,
  user_id                   integer,
  movie_id                  integer,
  movie_rating              integer,
  create_time               varchar(255),
  constraint pk_movie_ratings primary key (id))
;

create table movies (
  id                        integer auto_increment not null,
  name                      varchar(255),
  picture                   varchar(255),
  description               varchar(255),
  director                  varchar(255),
  year                      varchar(255),
  constraint pk_movies primary key (id))
;

create table users (
  user_id                   integer auto_increment not null,
  email                     varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  create_time               datetime(6),
  constraint pk_users primary key (user_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table movie_ratings;

drop table movies;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

