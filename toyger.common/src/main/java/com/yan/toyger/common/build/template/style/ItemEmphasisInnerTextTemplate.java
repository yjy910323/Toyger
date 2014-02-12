package com.yan.toyger.common.build.template.style;

import com.yan.toyger.common.build.template.sery.StyleTemplate;
import com.yan.toyger.common.model.echarts.style.ItemObjectStyle;
import com.yan.toyger.common.model.echarts.style.ItemStyle;
import com.yan.toyger.common.model.echarts.style.LabelLineStyle;
import com.yan.toyger.common.model.echarts.style.LabelStyle;

public class ItemEmphasisInnerTextTemplate implements StyleTemplate<ItemStyle>{

	public ItemStyle getStyle() {
		ItemStyle itemStyle = new ItemStyle().setNormal(new ItemObjectStyle()
			.setLabel(new LabelStyle().setShow(true).setPosition("inner"))
			.setLabelLine(new LabelLineStyle().setShow(false)))
			.setEmphasis(new ItemObjectStyle()
			.setLabel(new LabelStyle().setShow(true).setPosition("inner")));
		return itemStyle;
	}
	
}
