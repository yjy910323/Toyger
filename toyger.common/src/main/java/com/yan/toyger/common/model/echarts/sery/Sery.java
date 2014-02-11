package com.yan.toyger.common.model.echarts.sery;

import java.util.ArrayList;
import java.util.List;

import com.yan.toyger.common.model.echarts.MarkPoint;
import com.yan.toyger.common.model.echarts.Tooltip;
import com.yan.toyger.common.model.echarts.sery.data.Data;
import com.yan.toyger.common.model.echarts.style.ItemStyle;

public class Sery<T extends Data,U extends Sery<T,U>> {
	private String name;
	private Tooltip tooltip;
	private String type;// 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示。可选为： 'line'（折线图） |
						// 'bar'（柱状图） | 'scatter'（散点图） | 'k'（K线图） 'pie'（饼图） |
						// 'radar'（雷达图） | 'chord'（和弦图） | 'force'（力导向布局图） |
						// 'map'（地图）
	private ItemStyle itemStyle;
	private List<T> data;
	private MarkPoint markPoint;

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public U setName(String name) {
		this.name = name;
		return (U) this;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	@SuppressWarnings("unchecked")
	public U setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return (U) this;
	}

	public String getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	public U setType(String type) {
		this.type = type;
		return (U) this;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	@SuppressWarnings("unchecked")
	public U setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return (U) this;
	}

	public List<T> getData() {
		return data;
	}

	@SuppressWarnings("unchecked")
	public U setData(List<T> data) {
		this.data = data;
		return (U) this;
	}

	public MarkPoint getMarkPoint() {
		return markPoint;
	}

	@SuppressWarnings("unchecked")
	public U setMarkPoint(MarkPoint markPoint) {
		this.markPoint = markPoint;
		return (U) this;
	}
	
	@SuppressWarnings("unchecked")
	public U setDatas(T... data){
		if(this.data == null){
			this.data = new ArrayList<T>();
		}
		for(T oneData : data){
			this.data.add(oneData);
		}
		return (U) this;
	}

}
