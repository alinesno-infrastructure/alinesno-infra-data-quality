package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.ProjectLabelEntity;
import com.alinesno.infra.data.quality.mapper.ProjectLabelMapper;
import com.alinesno.infra.data.quality.service.IProjectLabelService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class ProjectLabelServiceImpl extends IBaseServiceImpl<ProjectLabelEntity, ProjectLabelMapper> implements IProjectLabelService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ProjectLabelServiceImpl.class);

}
