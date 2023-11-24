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
@TableName("rule_variable")
public class RuleVariableEntity extends InfraBaseEntity {
	/**
	 * 规则ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("规则ID")
	@TableField("rule_id")
	private Long ruleId;

	/**
	 * 输入动作步骤
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("输入动作步骤")
	@TableField("input_action_step")
	private Long inputActionStep;

	/**
	 * 关联的统计输入元数据ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("关联的统计输入元数据ID")
	@TableField("template_statistics_input_meta_id")
	private Long templateStatisticsInputMetaId;

	/**
	 * 关联的中间表输入元数据ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("关联的中间表输入元数据ID")
	@TableField("template_mid_table_input_meta_id")
	private Long templateMidTableInputMetaId;

	/**
	 * 值
	 */
	@ColumnType(MySqlTypeConstant.MEDIUMTEXT)
	@ColumnComment("值")
	@TableField("value")
	private String value;

	/**
	 * 原始值
	 */
	@ColumnType(length = 255)
	@ColumnComment("原始值")
	@TableField("origin_value")
	private String originValue;

	/**
	 * 集群名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("集群名称")
	@TableField("cluster_name")
	private String clusterName;

	/**
	 * 数据库名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("数据库名称")
	@TableField("db_name")
	private String dbName;

	/**
	 * 表名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("表名称")
	@TableField("table_name")
	private String tableName;


}
