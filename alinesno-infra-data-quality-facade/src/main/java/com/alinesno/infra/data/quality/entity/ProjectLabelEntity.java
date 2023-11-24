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
@TableName("project_label")
public class ProjectLabelEntity extends InfraBaseEntity {
	/**
	 * 项目ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("项目ID")
	@TableField("project_id")
	private Long projectId;

	/**
	 * 标签名称
	 */
	@ColumnType(length = 20)
	@ColumnComment("标签名称")
	@TableField("label_name")
	private String labelName;


}
