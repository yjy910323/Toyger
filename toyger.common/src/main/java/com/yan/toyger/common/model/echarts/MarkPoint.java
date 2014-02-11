package com.yan.toyger.common.model.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.style.ItemStyle;

public class MarkPoint {
	private String symbol;
	private Integer symbolSize;
	private Integer symbolRotate;
	private ItemStyle itemStyle = null;
	// private GeoCoord geoCoord;
	private List<MarkPointData> data;

	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public String getSymbol() {
		return symbol;
	}

	public MarkPoint setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public Integer getSymbolSize() {
		return symbolSize;
	}

	public MarkPoint setSymbolSize(Integer symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	public Integer getSymbolRotate() {
		return symbolRotate;
	}

	public MarkPoint setSymbolRotate(Integer symbolRotate) {
		this.symbolRotate = symbolRotate;
		return this;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	public MarkPoint setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}

	public List<MarkPointData> getData() {
		return data;
	}

	public MarkPoint setData(List<MarkPointData> data) {
		this.data = data;
		return this;
	}

	public MarkPoint setDatas(MarkPointData... data){
		if(this.data == null){
			this.data = new ArrayList<MarkPointData>();
		}
		for(MarkPointData oneData : data){
			this.data.add(oneData);
		}
		return this;
	}
}
