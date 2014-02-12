package com.yan.toyger.common.builder;

import org.junit.Test;

import com.yan.toyger.common.build.OptionModelBuiler;
import com.yan.toyger.common.build.StyleModelBuiler;
import com.yan.toyger.common.build.template.sery.BarPlainTemplate;
import com.yan.toyger.common.build.template.sery.LinePlainTemplate;
import com.yan.toyger.common.build.template.style.ItemTomatoInsideTemplate;
import com.yan.toyger.common.build.template.style.ItemTomatoTopTemplate;
import com.yan.toyger.common.model.echarts.Legend;
import com.yan.toyger.common.model.echarts.MarkPoint;
import com.yan.toyger.common.model.echarts.MarkPointData;
import com.yan.toyger.common.model.echarts.Option;
import com.yan.toyger.common.model.echarts.Title;
import com.yan.toyger.common.model.echarts.sery.BarSery;
import com.yan.toyger.common.model.echarts.sery.LineSery;
import com.yan.toyger.common.model.echarts.sery.data.BarData;
import com.yan.toyger.common.model.echarts.sery.data.LineData;
import com.yan.toyger.common.model.echarts.style.AxisLabel;
import com.yan.toyger.common.model.echarts.style.AxisLineStyle;

public class OptionModelBuilderTest {

	@Test
	public void LinePlainTemplateBuilerTest() {
		Option<LineSery> o = OptionModelBuiler.build(new LinePlainTemplate())
				.setTitle(new Title().setText("未来一周气温变化").setSubtext("纯属虚构"))
				.setLegend(new Legend().setDatas("最高气温", "最低气温"))
				.setSery(new LineSery().setName("最高气温").setType("line").setDatas(new LineData().setValue(11),new LineData().setValue(11)
							,new LineData().setValue(15),new LineData().setValue(13),new LineData().setValue(12),new LineData().setValue(13)
							,new LineData().setValue(10)),
							new LineSery().setName("最低气温").setType("line").setDatas(new LineData().setValue(0),new LineData().setValue(2)
									,new LineData().setValue(1),new LineData().setValue(-1),new LineData().setValue(0),new LineData().setValue(3)
									,new LineData().setValue(1)).setMarkPoint(new MarkPoint().setDatas(new MarkPointData().setValue(-1).setName("周最低").setXAxis(3).setYAxis(-1))))
				;
		
		o.getXAxis().setDatas("周一","周二","周三","周四","周五","周六","周日");
		o.getYAxis().setAxisLabel(new AxisLabel().setFormatter("{value} °C"));
		
		System.out.println(o.buildOptionString());
	}
	
	@Test
	public void LineBoundaryGapTemplateBuilerTest() {
		Option<LineSery> o = OptionModelBuiler.build(new LinePlainTemplate())
				.setTitle(new Title().setText("未来一周气温变化").setSubtext("纯属虚构"))
				.setLegend(new Legend().setDatas("最高气温", "最低气温"))
				.setSery(new LineSery().setName("最高气温").setType("line").setDatas(new LineData().setValue(11),new LineData().setValue(11)
							,new LineData().setValue(15),new LineData().setValue(13),new LineData().setValue(12),new LineData().setValue(13)
							,new LineData().setValue(10)),
							new LineSery().setName("最低气温").setType("line").setDatas(new LineData().setValue(0),new LineData().setValue(2)
									,new LineData().setValue(1),new LineData().setValue(-1),new LineData().setValue(0),new LineData().setValue(3)
									,new LineData().setValue(1)).setMarkPoint(new MarkPoint().setDatas(new MarkPointData().setValue(-1).setName("周最低").setXAxis(3).setYAxis(-1))))
				;
		
		o.getXAxis().setDatas("周一","周二","周三","周四","周五","周六","周日");
		o.getYAxis().setAxisLabel(new AxisLabel().setFormatter("{value} °C"));
		
		System.out.println(o.buildOptionString());
	}
	
	
	@Test
	public void ItemTomatoInsideTemplateTest(){
		Option<BarSery> o = OptionModelBuiler.build(new BarPlainTemplate())
				.setCalculable(true)
				.setTitle(new Title().setText("温度计式图表"))
				.setLegend(new Legend().setDatas("Acutal", "Forecast"))
				.setSery(
						new BarSery().setBarCategoryGap("50%").setName("Acutal").setStack("sum").setItemStyle(StyleModelBuiler.build(new ItemTomatoInsideTemplate())).setDatas(new BarData(260),new BarData(220),new BarData(200),new BarData(180),new BarData(220),new BarData(250)),
						new BarSery().setName("Forecast").setStack("sum").setItemStyle(StyleModelBuiler.build(new ItemTomatoTopTemplate())).setDatas(new BarData(10),new BarData(20),new BarData(40),new BarData(20),new BarData(10),new BarData(15))
				);
		
		o.getXAxis().setDatas("Cosco","CMA","APL","OOCL","Wanhai","Zim").setSplitLine(new AxisLineStyle().setShow(false));
		System.out.println(o.buildOptionString());
	}
}
