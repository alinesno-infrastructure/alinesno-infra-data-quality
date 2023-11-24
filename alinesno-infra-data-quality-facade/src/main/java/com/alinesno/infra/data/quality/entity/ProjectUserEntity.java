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
@TableName("project_user")
public class ProjectUserEntity extends InfraBaseEntity {
	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;

	/**
	 * 权限
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("权限")
	@TableField("permission")
	private Long permission;

	/**
	 * 用户名
	 */
	@ColumnType(length = 20)
	@ColumnComment("用户名")
	@TableField("user_name")
	private String userName;

	/**
	 * 用户全名
	 */
	@ColumnType(length = 30)
	@ColumnComment("用户全名")
	@TableField("user_full_name")
	private String userFullName;


}
