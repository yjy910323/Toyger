package com.yan.toyger.common.model.echarts.sery;

import com.alibaba.fastjson.JSONObject;
import com.yan.toyger.common.model.echarts.sery.data.KData;

public class KSery extends Sery<KData, KSery> {
	private Integer xAxisIndex;
	private Integer yAxisIndex;
	private Integer barWidth;// K线蜡烛宽度，不设时自适应 
	private Integer barMaxWidth;// K线蜡烛最大宽度，不设时自适应 
	
	public String toString(){
		return JSONObject.toJSONString(this);
	}

	public KSery(){
		super.setType("k");
	}
	
	public Integer getxAxisIndex() {
		return xAxisIndex;
	}

	public KSery setxAxisIndex(Integer xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
		return this;
	}

	public Integer getyAxisIndex() {
		return yAxisIndex;
	}

	public KSery setyAxisIndex(Integer yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
		return this;
	}

	public Integer getBarWidth() {
		return barWidth;
	}

	public KSery setBarWidth(Integer barWidth) {
		this.barWidth = barWidth;
		return this;
	}

	public Integer getBarMaxWidth() {
		return barMaxWidth;
	}

	public KSery setBarMaxWidth(Integer barMaxWidth) {
		this.barMaxWidth = barMaxWidth;
		return this;
	}
	
}
