
package com.xzero.mysunshine;

import java.util.List;

public class Sys{
   	private String country;
   	private Number id;
   	private Number message;
   	private Number sunrise;
   	private Number sunset;
   	private Number type;

 	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public Number getMessage(){
		return this.message;
	}
	public void setMessage(Number message){
		this.message = message;
	}
 	public Number getSunrise(){
		return this.sunrise;
	}
	public void setSunrise(Number sunrise){
		this.sunrise = sunrise;
	}
 	public Number getSunset(){
		return this.sunset;
	}
	public void setSunset(Number sunset){
		this.sunset = sunset;
	}
 	public Number getType(){
		return this.type;
	}
	public void setType(Number type){
		this.type = type;
	}
}
