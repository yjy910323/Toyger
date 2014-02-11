package com.yan.toyger.common.model;

import org.junit.Test;

import com.yan.toyger.common.model.echarts.*;
import com.yan.toyger.common.model.echarts.sery.LineSery;
import com.yan.toyger.common.model.echarts.sery.data.LineData;
import com.yan.toyger.common.model.echarts.style.AxisLabel;
import com.yan.toyger.common.model.echarts.style.AxisSplitAreaStyle;

public class OptionModelTest {

	@Test
	public void lineOptionModelTest() {
		
		Option<LineSery> option = new Option<LineSery>()
					.setTitle(new Title().setText("未来一周气温变化").setSubtext("纯属虚构"))
					.setTooltip(new Tooltip().setTrigger("axis"))
					.setLegend(new Legend().setOneData("最高气温","最低气温"))
					.setToolbox(new Toolbox().setShow(true).setFeature(
							new Feature().setMark(true).setDataView(true).setSaveAsImage(true).setRestore(true)))
					.setCalculable(true)
					.setXAxis(new Axis().setType("category").setBoundaryGap(false).setDatas("周一","周二","周三","周四","周五","周六","周日"))
					.setYAxis(new Axis().setType("value").setAxisLabel(
							new AxisLabel().setFormatter("{value} °C")).setSplitArea(
							new AxisSplitAreaStyle().setShow(true)))
					.setSery(new LineSery().setName("最高气温").setType("line").setDatas(new LineData().setValue(11),new LineData().setValue(11)
							,new LineData().setValue(15),new LineData().setValue(13),new LineData().setValue(12),new LineData().setValue(13)
							,new LineData().setValue(10)),
							new LineSery().setName("最低气温").setType("line").setDatas(new LineData().setValue(0),new LineData().setValue(2)
									,new LineData().setValue(1),new LineData().setValue(-1),new LineData().setValue(0),new LineData().setValue(3)
									,new LineData().setValue(1)).setMarkPoint(new MarkPoint().setDatas(new MarkPointData().setValue(-1).setName("周最低").setXAxis(3).setYAxis(-1))))
					;
//		System.out.println(option.toString());
		System.out.println(option.buildOptionString());
	}
}
