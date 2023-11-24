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
@TableName("template_datasource_type")
public class TemplateDatasourceTypeEntity extends InfraBaseEntity {
	/**
	 * 数据源类型ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("数据源类型ID")
	@TableField("data_source_type_id")
	private Long dataSourceTypeId;

	/**
	 * 模板ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("模板ID")
	@TableField("template_id")
	private Long templateId;


}
