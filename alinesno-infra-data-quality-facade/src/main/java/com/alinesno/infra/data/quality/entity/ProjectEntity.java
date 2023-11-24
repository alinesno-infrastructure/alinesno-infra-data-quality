package com.alinesno.infra.data.quality.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("project")
public class ProjectEntity extends InfraBaseEntity {
	/**
	 * 名称
	 */
	@ColumnType(length = 170)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 中文名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("中文名称")
	@TableField("cn_name")
	private String cnName;

	/**
	 * 描述
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("描述")
	@TableField("description")
	private String description;

	/**
	 * 创建用户
	 */
	@ColumnType(length = 50)
	@ColumnComment("创建用户")
	@TableField("create_user")
	private String createUser;

	/**
	 * 创建用户全名
	 */
	@ColumnType(length = 50)
	@ColumnComment("创建用户全名")
	@TableField("create_user_full_name")
	private String createUserFullName;

	/**
	 * 用户部门
	 */
	@ColumnType(length = 50)
	@ColumnComment("用户部门")
	@TableField("user_department")
	private String userDepartment;

	/**
	 * 创建时间
	 */
	@ColumnType(length = 25)
	@ColumnComment("创建时间")
	@TableField("create_time")
	private String createTime;

	/**
	 * 修改用户
	 */
	@ColumnType(length = 50)
	@ColumnComment("修改用户")
	@TableField("modify_user")
	private String modifyUser;

	/**
	 * 修改时间
	 */
	@ColumnType(length = 25)
	@ColumnComment("修改时间")
	@TableField("modify_time")
	private String modifyTime;

	/**
	 * 项目类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目类型")
	@TableField("project_type")
	private Long projectType;


}
