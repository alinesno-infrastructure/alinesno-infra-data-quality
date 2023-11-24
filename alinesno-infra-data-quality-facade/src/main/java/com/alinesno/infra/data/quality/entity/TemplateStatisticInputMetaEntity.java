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
@TableName("template_statistic_input_meta")
public class TemplateStatisticInputMetaEntity extends InfraBaseEntity {
	/**
	 * 函数名称
	 */
	@ColumnType(length = 5)
	@ColumnComment("函数名称")
	@TableField("func_name")
	private String funcName;

	/**
	 * 值
	 */
	@ColumnType(length = 50)
	@ColumnComment("值")
	@TableField("value")
	private String value;

	/**
	 * 名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 结果类型
	 */
	@ColumnType(length = 255)
	@ColumnComment("结果类型")
	@TableField("result_type")
	private String resultType;


}
