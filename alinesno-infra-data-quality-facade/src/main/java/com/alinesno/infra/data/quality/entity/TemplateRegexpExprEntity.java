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
@TableName("template_regexp_expr")
public class TemplateRegexpExprEntity extends InfraBaseEntity {
	/**
	 * 正则表达式类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("正则表达式类型")
	@TableField("regexp_type")
	private Long regexpType;

	/**
	 * 键名
	 */
	@ColumnType(length = 255)
	@ColumnComment("键名")
	@TableField("key_name")
	private String keyName;

	/**
	 * 正则表达式值
	 */
	@ColumnType(length = 255)
	@ColumnComment("正则表达式值")
	@TableField("regexp_value")
	private String regexpValue;


}
