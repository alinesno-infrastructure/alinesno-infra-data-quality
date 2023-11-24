package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.RuleGroupEntity;
import com.alinesno.infra.data.quality.mapper.RuleGroupMapper;
import com.alinesno.infra.data.quality.service.IRuleGroupService;
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
public class RuleGroupServiceImpl extends IBaseServiceImpl<RuleGroupEntity, RuleGroupMapper> implements IRuleGroupService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(RuleGroupServiceImpl.class);

}
