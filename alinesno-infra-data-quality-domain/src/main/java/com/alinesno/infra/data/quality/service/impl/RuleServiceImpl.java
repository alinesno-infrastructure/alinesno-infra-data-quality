package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.RuleEntity;
import com.alinesno.infra.data.quality.mapper.RuleMapper;
import com.alinesno.infra.data.quality.service.IRuleService;
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
public class RuleServiceImpl extends IBaseServiceImpl<RuleEntity, RuleMapper> implements IRuleService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(RuleServiceImpl.class);

}
