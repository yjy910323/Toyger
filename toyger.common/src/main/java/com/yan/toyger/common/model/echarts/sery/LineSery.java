package com.yan.toyger.common.model.echarts.sery;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.data.LineData;

/**
 * @author Yan
 * 
 *         折线图sery模型
 */
public class LineSery extends Sery<LineData,LineSery> {
	private String stack;// 组合名称，多组数据的堆积图时使用，eg：stack:'group1'，则series数组中stack值等于'group1'的数据做堆积计算
	private Integer xAxisIndex;
	private Integer yAxisIndex;
	private String symbol;// 标志图形类型，默认自动选择 'circle' | 'rectangle' | 'triangle' |
							// 'diamond' | 'emptyCircle' | 'emptyRectangle' |
							// 'emptyTriangle' | 'emptyDiamond'
	private Integer symbolSize;
	private Integer symbolRotate;// 标志图形旋转角度[-180,180]
	private Boolean showAllSymbol;// 标志图形默认只有主轴显示（随主轴标签间隔隐藏策略），如需全部显示可把showAllSymbol设为true
	private Boolean smooth;// 平滑曲线显示

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
	public LineSery(){
		super.setType("line");
	}
	
	public String getStack() {
		return stack;
	}

	public LineSery setStack(String stack) {
		this.stack = stack;
		return this;
	}

	public Integer getxAxisIndex() {
		return xAxisIndex;
	}

	public LineSery setxAxisIndex(Integer xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
		return this;
	}

	public Integer getyAxisIndex() {
		return yAxisIndex;
	}

	public LineSery setyAxisIndex(Integer yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
		return this;
	}

	public String getSymbol() {
		return symbol;
	}

	public LineSery setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public Integer getSymbolSize() {
		return symbolSize;
	}

	public LineSery setSymbolSize(Integer symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	public Integer getSymbolRotate() {
		return symbolRotate;
	}

	public LineSery setSymbolRotate(Integer symbolRotate) {
		this.symbolRotate = symbolRotate;
		return this;
	}

	public Boolean getShowAllSymbol() {
		return showAllSymbol;
	}

	public LineSery setShowAllSymbol(Boolean showAllSymbol) {
		this.showAllSymbol = showAllSymbol;
		return this;
	}

	public Boolean getSmooth() {
		return smooth;
	}

	public LineSery setSmooth(Boolean smooth) {
		this.smooth = smooth;
		return this;
	}
	
}
