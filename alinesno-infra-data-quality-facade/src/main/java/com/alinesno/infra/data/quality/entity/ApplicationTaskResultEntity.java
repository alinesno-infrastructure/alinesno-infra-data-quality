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
@TableName("application_task_result")
public class ApplicationTaskResultEntity extends InfraBaseEntity {


	/**
	 * 规则ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("规则ID")
	@TableField("rule_id")
	private Long ruleId;

	/**
	 * 值
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("值")
	@TableField("value")
	private String value;

	/**
	 * 结果类型
	 */
	@ColumnType(length = 255)
	@ColumnComment("结果类型")
	@TableField("result_type")
	private String resultType;

	/**
	 * 创建时间
	 */
	@ColumnType(length = 25)
	@ColumnComment("创建时间")
	@TableField("create_time")
	private String createTime;

	/**
	 * 是否保存结果
	 */
	@ColumnType(length = 255)
	@ColumnComment("是否保存结果")
	@TableField("save_result")
	private int saveResult;

	/**
	 * 规则指标ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("规则指标ID")
	@TableField("rule_metric_id")
	private Long ruleMetricId;

	/**
	 * 运行日期
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("运行日期")
	@TableField("run_date")
	private Long runDate;

	/**
	 * 部门编码
	 */
	@ColumnType(length = 255)
	@ColumnComment("部门编码")
	@TableField("department_code")
	private String departmentCode;


}
