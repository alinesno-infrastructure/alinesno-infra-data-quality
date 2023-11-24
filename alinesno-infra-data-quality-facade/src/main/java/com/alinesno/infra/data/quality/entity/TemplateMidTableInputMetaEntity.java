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
@TableName("template_mid_table_input_meta")
public class TemplateMidTableInputMetaEntity extends InfraBaseEntity {
	/**
	 * 名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("名称")
	@TableField("name")
	private String name;

	/**
	 * 模板ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("模板ID")
	@TableField("template_id")
	private Long templateId;

	/**
	 * 占位符
	 */
	@ColumnType(length = 30)
	@ColumnComment("占位符")
	@TableField("placeholder")
	private String placeholder;

	/**
	 * 输入类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("输入类型")
	@TableField("input_type")
	private Long inputType;

	/**
	 * 字段类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("字段类型")
	@TableField("field_type")
	private Long fieldType;

	/**
	 * 是否从请求或数据库获取替代值
	 */
	@ColumnType(length = 255)
	@ColumnComment("是否从请求或数据库获取替代值")
	@TableField("replace_by_request")
	private int replaceByRequest;

	/**
	 * 正则表达式类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("正则表达式类型")
	@TableField("regexp_type")
	private Long regexpType;

	/**
	 * 占位符描述
	 */
	@ColumnType(length = 300)
	@ColumnComment("占位符描述")
	@TableField("placeholder_description")
	private String placeholderDescription;

	/**
	 * 父节点ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("父节点ID")
	@TableField("parent_id")
	private Long parentId;

	/**
	 * 连接模板
	 */
	@ColumnType(length = 3000)
	@ColumnComment("连接模板")
	@TableField("concat_template")
	private String concatTemplate;


}
