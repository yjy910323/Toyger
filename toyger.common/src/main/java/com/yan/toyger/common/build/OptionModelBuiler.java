package com.yan.toyger.common.build;

import com.yan.toyger.common.build.template.Template;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.sery.Sery;

public class OptionModelBuiler {
	
	public static <T extends Sery<?, ?>> Option<T> build(Template<T> temple) {
		return temple.getOption();
	}
	
}
