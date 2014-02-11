package com.yan.toyger.common.model.echarts.sery.data;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.style.ItemStyle;

public class PieData extends Data {
	private Object value;
	private String name;
	private Tooltip tooltip;// 自定义特殊tooltip，仅对该item有效，详见tooltip
	private ItemStyle itemStyle;// 自定义特殊itemStyle，仅对该item有效，详见itemStyle

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Object getValue() {
		return value;
	}

	public PieData setValue(Object value) {
		this.value = value;
		return this;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public PieData setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	public PieData setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}

	public String getName() {
		return name;
	}

	public PieData setName(String name) {
		this.name = name;
		return this;
	}
}
