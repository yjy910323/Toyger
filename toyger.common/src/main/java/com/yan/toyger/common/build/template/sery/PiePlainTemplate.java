package com.yan.toyger.common.build.template.sery;

import com.yan.toyger.common.model.echarts.Feature;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.Toolbox;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.sery.PieSery;

public class PiePlainTemplate implements SeryTemplate<PieSery>{

	public Option<PieSery> getOption() {
		Option<PieSery> option = new Option<PieSery>()
				.setTooltip(new Tooltip().setTrigger("item"))
				.setToolbox(new Toolbox().setShow(true).setFeature(
						new Feature().setMark(true).setDataView(true).setSaveAsImage(true).setRestore(true)))
				.setCalculable(true)
				;
		return option;
	}
	
}
