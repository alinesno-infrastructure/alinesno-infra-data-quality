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
@TableName("project_event")
public class ProjectEventEntity extends InfraBaseEntity {
	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;

	/**
	 * 内容
	 */
	@ColumnType(length = 500)
	@ColumnComment("内容")
	@TableField("content")
	private String content;

	/**
	 * 字段
	 */
	@ColumnType(length = 50)
	@ColumnComment("字段")
	@TableField("field")
	private String field;

	/**
	 * 修改前
	 */
	@ColumnType(length = 200)
	@ColumnComment("修改前")
	@TableField("before_modify")
	private String beforeModify;

	/**
	 * 修改后
	 */
	@ColumnType(length = 200)
	@ColumnComment("修改后")
	@TableField("after_modify")
	private String afterModify;

	/**
	 * 修改用户
	 */
	@ColumnType(length = 50)
	@ColumnComment("修改用户")
	@TableField("modify_user")
	private String modifyUser;

	/**
	 * 执行用户
	 */
	@ColumnType(length = 50)
	@ColumnComment("执行用户")
	@TableField("execute_user")
	private String executeUser;

	/**
	 * 时间
	 */
	@ColumnType(length = 25)
	@ColumnComment("时间")
	@TableField("time")
	private String time;

	/**
	 * 事件类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("事件类型")
	@TableField("event_type")
	private Long eventType;


}
