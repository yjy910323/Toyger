package com.yan.toyger.common.build.template.sery;

import com.yan.toyger.common.model.echarts.Axis;
import com.yan.toyger.common.model.echarts.Feature;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.Toolbox;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.sery.ScatterSery;
import com.yan.toyger.common.model.echarts.style.AxisSplitAreaStyle;

public class ScatterPlainTemplate implements SeryTemplate<ScatterSery>{

	public Option<ScatterSery> getOption() {
		Option<ScatterSery> option = new Option<ScatterSery>()
				.setToolbox(new Toolbox().setShow(true).setFeature(
						new Feature().setMark(true).setDataView(true).setSaveAsImage(true).setRestore(true)))
				.setCalculable(true)
				.setTooltip(new Tooltip().setTrigger("item"))
				.setXAxis(new Axis().setScale(true).setType("value"))
				.setYAxis(new Axis().setScale(true).setType("value").setSplitArea(new AxisSplitAreaStyle().setShow(true)))
				;
		return option;
	}
}
