package com.yan.toyger.common.build.template;

import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.sery.Sery;

public interface SeryTemplate<T extends Sery<?,?>> {
	public Option<T> getOption();
}
