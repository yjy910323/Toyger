package com.yan.toyger.common.model.echarts.sery;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.data.ScatterData;

public class ScatterSery extends Sery<ScatterData, ScatterSery> {
	private Integer xAxisIndex;
	private Integer yAxisIndex;
	private String symbol;// 标志图形类型，默认自动选择 'circle' | 'rectangle' | 'triangle' |
							// 'diamond' | 'emptyCircle' | 'emptyRectangle' |
							// 'emptyTriangle' | 'emptyDiamond'
	private Integer symbolSize;// 标志图形大小，可计算特性启用情况建议增大以提高交互体验。实现气泡图时symbolSize需为Function，气泡大小取决于该方法返回值，传入参数为当前数据项（value数组）
	private Integer symbolRotate;// 标志图形旋转角度[-180,180]
	private Boolean large;// 启动大规模散点图
	private Integer largeThreshold;// 大规模散点图自动切换阀值，large为true下有效

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
	public ScatterSery(){
		super.setType("scatter");
	}

	public Integer getxAxisIndex() {
		return xAxisIndex;
	}

	public ScatterSery setxAxisIndex(Integer xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
		return this;
	}

	public Integer getyAxisIndex() {
		return yAxisIndex;
	}

	public ScatterSery setyAxisIndex(Integer yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
		return this;
	}

	public String getSymbol() {
		return symbol;
	}

	public ScatterSery setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public Integer getSymbolSize() {
		return symbolSize;
	}

	public ScatterSery setSymbolSize(Integer symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	public Integer getSymbolRotate() {
		return symbolRotate;
	}

	public ScatterSery setSymbolRotate(Integer symbolRotate) {
		this.symbolRotate = symbolRotate;
		return this;
	}

	public Boolean getLarge() {
		return large;
	}

	public ScatterSery setLarge(Boolean large) {
		this.large = large;
		return this;
	}

	public Integer getLargeThreshold() {
		return largeThreshold;
	}

	public ScatterSery setLargeThreshold(Integer largeThreshold) {
		this.largeThreshold = largeThreshold;
		return this;
	}
}
