package com.yan.toyger.common.build;

import com.yan.toyger.common.build.template.sery.StyleTemplate;

public class StyleModelBuiler {

	public static <T> T build(StyleTemplate<T> temple) {
		return temple.getStyle();
	}

}
