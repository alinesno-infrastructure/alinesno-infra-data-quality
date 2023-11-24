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
@TableName("rule_alarm_config")
public class RuleAlarmConfigEntity extends InfraBaseEntity {
	/**
	 * 关联的规则ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("关联的规则ID")
	@TableField("rule_id")
	private Long ruleId;

	/**
	 * 关联的模板输出元数据ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("关联的模板输出元数据ID")
	@TableField("template_output_meta_id")
	private Long templateOutputMetaId;

	/**
	 * 文件输出名称
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("文件输出名称")
	@TableField("file_output_name")
	private Long fileOutputName;

	/**
	 * 文件输出单位
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("文件输出单位")
	@TableField("file_output_unit")
	private Long fileOutputUnit;

	/**
	 * 检查模板
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("检查模板")
	@TableField("check_template")
	private Long checkTemplate;

	/**
	 * 阈值
	 */
	@ColumnType(MySqlTypeConstant.DOUBLE)
	@ColumnComment("阈值")
	@TableField("threshold")
	private Double threshold;

	/**
	 * 比较类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("比较类型")
	@TableField("compare_type")
	private Long compareType;

	/**
	 * 关联的规则度量ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("关联的规则度量ID")
	@TableField("rule_metric_id")
	private Long ruleMetricId;

	/**
	 * 上传规则度量值
	 */
	@ColumnType(length = 255)
	@ColumnComment("上传规则度量值")
	@TableField("upload_rule_metric_value")
	private int uploadRuleMetricValue;

	/**
	 * 上传异常值
	 */
	@ColumnType(length = 255)
	@ColumnComment("上传异常值")
	@TableField("upload_abnormal_value")
	private int uploadAbnormalValue;

	/**
	 * 删除失败的检查结果
	 */
	@ColumnType(length = 255)
	@ColumnComment("删除失败的检查结果")
	@TableField("delete_fail_check_result")
	private int deleteFailCheckResult;


}
