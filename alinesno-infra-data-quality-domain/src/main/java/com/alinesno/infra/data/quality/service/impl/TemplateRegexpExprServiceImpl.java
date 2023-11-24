package com.alinesno.infra.data.quality.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.data.quality.entity.TemplateRegexpExprEntity;
import com.alinesno.infra.data.quality.mapper.TemplateRegexpExprMapper;
import com.alinesno.infra.data.quality.service.ITemplateRegexpExprService;
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
public class TemplateRegexpExprServiceImpl extends IBaseServiceImpl<TemplateRegexpExprEntity, TemplateRegexpExprMapper> implements ITemplateRegexpExprService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TemplateRegexpExprServiceImpl.class);

}
