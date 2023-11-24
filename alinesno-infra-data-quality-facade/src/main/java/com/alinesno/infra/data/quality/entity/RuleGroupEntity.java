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
@TableName("rule_group")
public class RuleGroupEntity extends InfraBaseEntity {
	/**
	 * 规则组名称
	 */
	@ColumnType(length = 100)
	@ColumnComment("规则组名称")
	@TableField("rule_group_name")
	private String ruleGroupName;

	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;

	/**
	 * 版本
	 */
	@ColumnType(length = 50)
	@ColumnComment("版本")
	@TableField("version")
	private String version;


}
