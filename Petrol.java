package com.collections;

import java.util.Optional;

public class Petrol {

	
	private int rate;
	private int litre;
	
	private Optional<Performance> perfomance;

	public Petrol(int rate, int litre, Performance perfomance) {
		super();
		this.rate = rate;
		this.litre = litre;
		this.perfomance = Optional.of(perfomance);
	}

	public int getRate() {
		return rate;
	}

	public int getLitre() {
		return litre;
	}

	public Optional<Performance> getPerfomance() {
		return perfomance;
	}

	
	
	
}
