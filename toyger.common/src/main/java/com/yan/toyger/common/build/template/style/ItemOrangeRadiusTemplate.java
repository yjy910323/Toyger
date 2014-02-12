package com.yan.toyger.common.build.template.style;

import com.yan.toyger.common.build.template.sery.StyleTemplate;
import com.yan.toyger.common.model.echarts.style.ItemObjectStyle;
import com.yan.toyger.common.model.echarts.style.ItemStyle;
import com.yan.toyger.common.model.echarts.style.LabelStyle;

public class ItemOrangeRadiusTemplate implements StyleTemplate<ItemStyle>{

	public ItemStyle getStyle() {
		ItemStyle itemStyle = new ItemStyle().setNormal(new ItemObjectStyle()
		.setColor("orange")
		.setBorderRadius(5)
		.setLabel(new LabelStyle()
				.setShow(true)
				.setPosition("inside"))
		);
		
		return itemStyle;
	}

}
