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
@TableName("template_output_meta")
public class TemplateOutputMetaEntity extends InfraBaseEntity {
	/**
	 * 模板ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("模板ID")
	@TableField("template_id")
	private Long templateId;

	/**
	 * 输出名称
	 */
	@ColumnType(length = 150)
	@ColumnComment("输出名称")
	@TableField("output_name")
	private String outputName;

	/**
	 * 字段名称
	 */
	@ColumnType(length = 50)
	@ColumnComment("字段名称")
	@TableField("field_name")
	private String fieldName;

	/**
	 * 字段类型
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("字段类型")
	@TableField("field_type")
	private Long fieldType;


}
