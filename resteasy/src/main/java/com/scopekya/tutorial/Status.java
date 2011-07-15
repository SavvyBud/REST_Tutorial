package com.scopekya.tutorial;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="status")
public class Status {
	public String getUpsince() {
		return upsince;
	}
	public void setUpsince(String upsince) {
		this.upsince = upsince;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	String upsince;
	String time;
	String status;
}
