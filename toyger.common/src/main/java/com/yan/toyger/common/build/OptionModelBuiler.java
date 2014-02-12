package com.yan.toyger.common.build;

import com.yan.toyger.common.build.template.sery.SeryTemplate;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.sery.Sery;

public class OptionModelBuiler {
	
	public static <T extends Sery<?, ?>> Option<T> build(SeryTemplate<T> temple) {
		return temple.getOption();
	}
	 
}
