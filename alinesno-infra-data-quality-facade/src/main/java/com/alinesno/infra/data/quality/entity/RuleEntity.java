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
@TableName("rule")
public class RuleEntity extends InfraBaseEntity {
	/**
	 * CS ID
	 */
	@ColumnType(length = 512)
	@ColumnComment("CS ID")
	@TableField("cs_id")
	private String csId;

	/**
	 * 模板ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("模板ID")
	@TableField("template_id")
	private Long templateId;

	/**
	 * 名称
	 */
	@ColumnType(length = 128)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 中文名
	 */
	@ColumnType(length = 128)
	@ColumnComment("中文名")
	@TableField("cn_name")
	private String cnName;

	/**
	 * 详情
	 */
	@ColumnType(length = 340)
	@ColumnComment("详情")
	@TableField("detail")
	private String detail;

	/**
	 * 告警标识
	 */
	@ColumnType(length = 255)
	@ColumnComment("告警标识")
	@TableField("alarm")
	private int alarm;

	/**
	 * 规则类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("规则类型")
	@TableField("rule_type")
	private Long ruleType;

	/**
	 * 告警配置数目
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("告警配置数目")
	@TableField("alarm_configs_count")
	private Long alarmConfigsCount;

	/**
	 * 规则模板名称
	 */
	@ColumnType(length = 180)
	@ColumnComment("规则模板名称")
	@TableField("rule_template_name")
	private String ruleTemplateName;

	/**
	 * 函数类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("函数类型")
	@TableField("function_type")
	private Long functionType;

	/**
	 * 函数内容
	 */
	@ColumnType(length = 3010)
	@ColumnComment("函数内容")
	@TableField("function_content")
	private String functionContent;

	/**
	 * 来源内容
	 */
	@ColumnType(length = 3010)
	@ColumnComment("来源内容")
	@TableField("from_content")
	private String fromContent;

	/**
	 * 条件内容
	 */
	@ColumnType(length = 3010)
	@ColumnComment("条件内容")
	@TableField("where_content")
	private String whereContent;

	/**
	 * 输出名称
	 */
	@ColumnType(length = 170)
	@ColumnComment("输出名称")
	@TableField("output_name")
	private String outputName;

	/**
	 * 失败时中止
	 */
	@ColumnType(length = 255)
	@ColumnComment("失败时中止")
	@TableField("abort_on_failure")
	private int abortOnFailure;

	/**
	 * 创建用户
	 */
	@ColumnType(length = 50)
	@ColumnComment("创建用户")
	@TableField("create_user")
	private String createUser;

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
	 * 删除失败的检查结果
	 */
	@ColumnType(length = 255)
	@ColumnComment("删除失败的检查结果")
	@TableField("delete_fail_check_result")
	private int deleteFailCheckResult;

	/**
	 * 指定静态启动参数
	 */
	@ColumnType(length = 255)
	@ColumnComment("指定静态启动参数")
	@TableField("specify_static_startup_param")
	private int specifyStaticStartupParam;

	/**
	 * 静态启动参数
	 */
	@ColumnType(length = 255)
	@ColumnComment("静态启动参数")
	@TableField("static_startup_param")
	private String staticStartupParam;

	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;


}
