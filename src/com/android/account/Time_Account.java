package com.android.account;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time_Account {
	private SimpleDateFormat account_date;
	private Date now;
	Time_Account(String time){
		account_date = new SimpleDateFormat("yyyy年MM月dd�?HH:mm:ss");
		now = new Date();
		time = account_date.format(now);
	}
}
