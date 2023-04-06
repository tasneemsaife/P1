package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry{
	 private String terrain;
	 private String tempo;
	 
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem) { 
	 
    super(n, d, m, y, h, min, s, dist);
    this.terrain = ter;
    this.tempo=tem;
    name = n;
	  Calendar inst = Calendar.getInstance();
	  inst.set(y,m-1,d,h,min,s);
	  dateAndTime = inst;
  distance = dist;
	}
	 
	public String getterrain( ) {
		return terrain;
	}
	public void setterrain(String ter) {
		this.terrain = ter;
	}
	public String gettempo() {
		return tempo;
	}
	 public void settempo(String tem) {
		 this.tempo =tem;
	 }
	 public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
	 }
	 
	 
}