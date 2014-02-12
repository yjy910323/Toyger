package com.yan.toyger.common.build.template.style;

import com.yan.toyger.common.build.template.sery.StyleTemplate;
import com.yan.toyger.common.model.echarts.style.ItemObjectStyle;
import com.yan.toyger.common.model.echarts.style.ItemStyle;
import com.yan.toyger.common.model.echarts.style.LabelStyle;
import com.yan.toyger.common.model.echarts.style.TextStyle;

public class ItemTomatoTopTemplate implements StyleTemplate<ItemStyle>{

	public ItemStyle getStyle() {
		ItemStyle itemStyle = new ItemStyle().setNormal(new ItemObjectStyle()
				.setColor("#fff")
				.setBorderColor("tomato")
				.setBorderWidth(6)
				.setLabel(new LabelStyle()
						.setShow(true)
						.setPosition("top")
						.setTextStyle(new TextStyle()
								.setColor("tomato")))
				);
		return itemStyle;
	}
	
}
