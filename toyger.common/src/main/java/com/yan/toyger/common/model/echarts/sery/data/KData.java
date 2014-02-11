package com.yan.toyger.common.model.echarts.sery.data;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.style.ItemStyle;

public class KData extends Data {
	private List<Integer> value;
	private Tooltip tooltip;// 自定义特殊tooltip，仅对该item有效，详见tooltip
	private ItemStyle itemStyle;// 自定义特殊itemStyle，仅对该item有效，详见itemStyle
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public List<Integer> getValue() {
		return value;
	}

	public KData setValue(List<Integer> data) {
		this.value = data;
		return this;
	}
	
	public KData setValues(Integer... value){
		if(this.value == null){
			this.value = new ArrayList<Integer>();
		}
		for(Integer oneData : value){
			this.value.add(oneData);
		}
		return this;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public KData setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	public KData setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}
}
