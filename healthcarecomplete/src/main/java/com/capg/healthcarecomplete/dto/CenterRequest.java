package com.capg.healthcarecomplete.dto;

import com.capg.healthcarecomplete.entity.Center;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class CenterRequest {

	private Center center;

	@Override
	public String toString() {
		return "CenterRequest [center=" + center + "]";
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	public CenterRequest(Center center) {
		super();
		this.center = center;
	}

	public CenterRequest() {
	}
}
