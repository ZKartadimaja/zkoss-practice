package com.fif;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.Captcha;

public class MyViewModel {
	private Captcha captcha;
	public MyViewModel() {
		captcha = new Captcha();
		// Additional configuration as needed
	}

	public boolean validateCaptcha(String input) {
		return captcha.getHover().equals(input);
	}

	private int count;
	private String name;

	@Init
	public void init() {
		count = 100;
	}

	@Command
	@NotifyChange("count")
	public void cmd() {
		++count;
	}

	@Command
	@NotifyChange("count")
	public void min(){
        count--; }

	@Command
	@NotifyChange("count")
	public void setThou(){
		count = count * 1000;	}

	public int getCount() {
		return count;
	}

	public String getName(){
		return "Hello World!";
	}
}
