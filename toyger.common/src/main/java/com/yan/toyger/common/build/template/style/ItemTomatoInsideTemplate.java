package com.yan.toyger.common.build.template.style;

import com.yan.toyger.common.build.template.sery.StyleTemplate;
import com.yan.toyger.common.model.echarts.style.ItemObjectStyle;
import com.yan.toyger.common.model.echarts.style.ItemStyle;
import com.yan.toyger.common.model.echarts.style.LabelStyle;

public class ItemTomatoInsideTemplate implements StyleTemplate<ItemStyle>{

	public ItemStyle getStyle() {
		ItemStyle itemStyle = new ItemStyle().setNormal(new ItemObjectStyle()
				.setColor("tomato")
				.setBorderColor("borderColor")
				.setBorderWidth(6)
				.setLabel(new LabelStyle()
						.setShow(true)
						.setPosition("inside"))
				);
		return itemStyle;
	}
	
}
