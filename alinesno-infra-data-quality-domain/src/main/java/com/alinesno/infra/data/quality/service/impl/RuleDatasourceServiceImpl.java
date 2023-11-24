package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.RuleDatasourceEntity;
import com.alinesno.infra.data.quality.mapper.RuleDatasourceMapper;
import com.alinesno.infra.data.quality.service.IRuleDatasourceService;
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
public class RuleDatasourceServiceImpl extends IBaseServiceImpl<RuleDatasourceEntity, RuleDatasourceMapper> implements IRuleDatasourceService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(RuleDatasourceServiceImpl.class);

}
