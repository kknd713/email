drop table if exists Branch;

drop table if exists Department;


drop table if exists Mail_User;

drop table if exists Position;

/*==============================================================*/
/* Table: Branch                                                */
/*==============================================================*/
create table Branch
(
   brc_id               int not null auto_increment,
   brc_name             varchar(50) not null,
   primary key (brc_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

alter table Branch comment '校区表';

/*==============================================================*/
/* Table: Department                                            */
/*==============================================================*/
create table Department
(
   dep_id               int not null auto_increment,
   dep_name             varchar(50) not null,
   dep_brc_id           int,
   primary key (dep_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

alter table Department comment '部门表';

/*==============================================================*/
/* Table: Mail_User                                              */
/*==============================================================*/
create table Mail_User
(
   usr_id               int not null auto_increment,
   usr_real_name        varchar(50) unique,
   usr_login_name       varchar(50),
   usr_password         varchar(50),
   usr_pos_id           int,
   usr_enabled          tinyint(1) default 1 comment '是否启用',
   usr_activated        tinyint(1) default 0 comment '是否邮箱激活',
   usr_safe_mail        varchar(100) comment '绑定的安全邮箱',
   usr_safe_mail_temp   varchar(100) comment '待修改的绑定邮箱',
   usr_safe_mail_code   varchar(255) comment '邮箱验证码',
   usr_safe_mail_code_time datetime comment '验证码生成时间',
   usr_signature        varchar(1000),
   primary key (usr_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

alter table Mail_User comment '邮件登陆用户';


/*==============================================================*/
/* Table: Position                                              */
/*==============================================================*/
create table Position
(
   pos_id               int not null auto_increment,
   pos_name             varchar(50) not null,
   pos_dep_id           int,
   primary key (pos_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

alter table Position comment '职位表';

alter table Department add constraint FK_Reference_2 foreign key (dep_brc_id)
      references Branch (brc_id) on delete restrict on update restrict;

alter table Mail_User add constraint FK_Reference_3 foreign key (usr_pos_id)
      references Position (pos_id) on delete restrict on update restrict;

alter table Position add constraint FK_Reference_1 foreign key (pos_dep_id)
      references Department (dep_id) on delete restrict on update restrict;
