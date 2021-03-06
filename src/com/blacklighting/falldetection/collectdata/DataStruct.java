/**
 * 
 */
package com.blacklighting.falldetection.collectdata;

/**
 * @author liuyajun
 * 
 */
public class DataStruct {
	long timestamp;
	float[] accValue;
	float[] gValue;

	public DataStruct(long timestamp, float[] accValue, float[] gValue) {
		this.timestamp = timestamp;
		this.accValue = accValue;
		this.gValue = gValue;
	}

	public float[] getAccValue() {
		return accValue;
	}

	public void setAccValue(float[] accValue) {
		this.accValue = accValue;
	}

	public float[] getgValue() {
		return gValue;
	}

	public void setgValue(float[] gValue) {
		this.gValue = gValue;
	}

	public float getGValueComponent(int index) {
		return gValue[index];
	}

	public float getAccValueComponent(int index) {
		return accValue[index];
	}

	public long getTime() {
		return timestamp;
	}
}
