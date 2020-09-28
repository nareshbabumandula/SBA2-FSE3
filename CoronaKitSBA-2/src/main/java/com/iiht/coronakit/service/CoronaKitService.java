package com.iiht.coronakit.service;

import com.iiht.coronakit.entity.CoronaKit;

public interface CoronaKitService {
	public CoronaKit saveKit(CoronaKit kit);
	public CoronaKit getKitById(int kitId);
}
