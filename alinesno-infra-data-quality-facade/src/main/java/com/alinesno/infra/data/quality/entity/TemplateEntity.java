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
@TableName("template")
public class TemplateEntity extends InfraBaseEntity {
	/**
	 * 名称
	 */
	@ColumnType(length = 180)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 集群数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("集群数量")
	@TableField("cluster_num")
	private Long clusterNum;

	/**
	 * 数据库数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("数据库数量")
	@TableField("db_num")
	private Long dbNum;

	/**
	 * 表数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("表数量")
	@TableField("table_num")
	private Long tableNum;

	/**
	 * 字段数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("字段数量")
	@TableField("field_num")
	private Long fieldNum;

	/**
	 * 中间表动作
	 */
	@ColumnType(length = 5000)
	@ColumnComment("中间表动作")
	@TableField("mid_table_action")
	private String midTableAction;

	/**
	 * 保存中间表标识
	 */
	@ColumnType(length = 255)
	@ColumnComment("保存中间表标识")
	@TableField("save_mid_table")
	private int saveMidTable;

	/**
	 * 显示SQL语句
	 */
	@ColumnType(length = 5000)
	@ColumnComment("显示SQL语句")
	@TableField("show_sql")
	private String showSql;


}
