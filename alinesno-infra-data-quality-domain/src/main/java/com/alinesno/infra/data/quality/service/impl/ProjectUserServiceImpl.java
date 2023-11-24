package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.ProjectUserEntity;
import com.alinesno.infra.data.quality.mapper.ProjectUserMapper;
import com.alinesno.infra.data.quality.service.IProjectUserService;
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
public class ProjectUserServiceImpl extends IBaseServiceImpl<ProjectUserEntity, ProjectUserMapper> implements IProjectUserService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ProjectUserServiceImpl.class);

}
