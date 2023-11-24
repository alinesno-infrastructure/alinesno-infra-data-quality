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
@TableName("rule_metric")
public class RuleMetricEntity extends InfraBaseEntity {
	/**
	 * 名称
	 */
	@ColumnType(length = 255)
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
	 * 指标描述
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("指标描述")
	@TableField("metric_desc")
	private String metricDesc;

	/**
	 * 子系统名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("子系统名称")
	@TableField("sub_system_name")
	private String subSystemName;

	/**
	 * 完整中文名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("完整中文名称")
	@TableField("full_cn_name")
	private String fullCnName;

	/**
	 * 产品名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("产品名称")
	@TableField("product_name")
	private String productName;

	/**
	 * 部门名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("部门名称")
	@TableField("department_name")
	private String departmentName;

	/**
	 * 开发部门名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("开发部门名称")
	@TableField("dev_department_name")
	private String devDepartmentName;

	/**
	 * 运维部门名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("运维部门名称")
	@TableField("ops_department_name")
	private String opsDepartmentName;

	/**
	 * 指标级别
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("指标级别")
	@TableField("level")
	private Long level;

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
	 * 类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("类型")
	@TableField("type")
	private Long type;

	/**
	 * 英文编码
	 */
	@ColumnType(length = 255)
	@ColumnComment("英文编码")
	@TableField("en_code")
	private String enCode;

	/**
	 * 是否可用
	 */
	@ColumnType(length = 255)
	@ColumnComment("是否可用")
	@TableField("available")
	private int available;

	/**
	 * 频率
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("频率")
	@TableField("frequency")
	private Long frequency;

	/**
	 * 业务编码
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("业务编码")
	@TableField("buss_code")
	private Long bussCode;

	/**
	 * 自定义业务字段
	 */
	@ColumnType(length = 255)
	@ColumnComment("自定义业务字段")
	@TableField("buss_custom")
	private String bussCustom;


}
