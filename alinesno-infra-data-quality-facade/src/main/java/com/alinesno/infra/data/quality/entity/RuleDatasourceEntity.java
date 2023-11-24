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
@TableName("rule_datasource")
public class RuleDatasourceEntity extends InfraBaseEntity {
	/**
	 * 集群名称
	 */
	@ColumnType(length = 100)
	@ColumnComment("集群名称")
	@TableField("cluster_name")
	private String clusterName;

	/**
	 * 数据库名称
	 */
	@ColumnType(length = 100)
	@ColumnComment("数据库名称")
	@TableField("db_name")
	private String dbName;

	/**
	 * 表名称
	 */
	@ColumnType(length = 100)
	@ColumnComment("表名称")
	@TableField("table_name")
	private String tableName;

	/**
	 * 列名称
	 */
	@ColumnType(MySqlTypeConstant.MEDIUMTEXT)
	@ColumnComment("列名称")
	@TableField("col_name")
	private String colName;

	/**
	 * 黑名单列名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("黑名单列名称")
	@TableField("black_col_name")
	private int blackColName;

	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;

	/**
	 * 规则ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("规则ID")
	@TableField("rule_id")
	private Long ruleId;

	/**
	 * 过滤条件
	 */
	@ColumnType(length = 3200)
	@ColumnComment("过滤条件")
	@TableField("filter")
	private String filter;

	/**
	 * 数据源索引
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("数据源索引")
	@TableField("datasource_index")
	private Long datasourceIndex;

	/**
	 * 代理用户
	 */
	@ColumnType(length = 255)
	@ColumnComment("代理用户")
	@TableField("proxy_user")
	private String proxyUser;

	/**
	 * Linkis数据源ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("Linkis数据源ID")
	@TableField("linkis_datasoure_id")
	private Long linkisDatasoureId;

	/**
	 * Linkis数据源版本ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("Linkis数据源版本ID")
	@TableField("linkis_datasoure_version_id")
	private Long linkisDatasoureVersionId;

	/**
	 * Linkis数据源名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("Linkis数据源名称")
	@TableField("linkis_datasource_name")
	private String linkisDatasourceName;

	/**
	 * 数据源类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("数据源类型")
	@TableField("datasource_type")
	private Long datasourceType;


}
