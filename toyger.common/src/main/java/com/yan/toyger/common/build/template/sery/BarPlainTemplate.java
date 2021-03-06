package com.yan.toyger.common.build.template.sery;

import com.yan.toyger.common.model.echarts.Axis;
import com.yan.toyger.common.model.echarts.Feature;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.Toolbox;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.sery.BarSery;
import com.yan.toyger.common.model.echarts.style.AxisSplitAreaStyle;

public class BarPlainTemplate implements SeryTemplate<BarSery> {

	public Option<BarSery> getOption() {
		Option<BarSery> option = new Option<BarSery>()
				.setTooltip(new Tooltip().setTrigger("axis"))
				.setToolbox(new Toolbox().setShow(true).setFeature(
						new Feature().setMark(true).setDataView(true).setSaveAsImage(true).setRestore(true)))
				.setCalculable(true)
				.setXAxis(new Axis().setType("category").setBoundaryGap(true))
				.setYAxis(new Axis().setType("value").setSplitArea(
						new AxisSplitAreaStyle().setShow(true)))
				;
		return option;
	}

}
