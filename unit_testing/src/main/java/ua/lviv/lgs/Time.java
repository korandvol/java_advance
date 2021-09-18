package ua.lviv.lgs;

import ua.lviv.lgs.Time.TimeException;

public class Time {

	int minutes;
	int hours;
	
	
	public Time(int minutes, int hours) throws TimeException {
		super();
		if ((minutes >=0 && minutes <=60) && (hours >=0 && hours <=24)) {
		this.minutes = minutes;
		this.hours = hours;
		} else
			throw new TimeException();
	}


	public int getMinutes() {
		return minutes;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	@Override
	public String toString() {
		return "Time [minutes=" + minutes + ", hours=" + hours + "]";
	}
	
	public static Time sumTime(Time time1, Time time2) throws TimeException {
		int hours = time1.getHours() + time2.getHours();
		int minutes = time1.getMinutes() + time2.getMinutes();

		if (minutes >= 60) {
			hours = hours + 1;
			minutes = minutes - 60;
		} else if (hours >= 24) {
			hours = hours - 24;
		}

		return new Time(hours, minutes);
	}
	
	public static boolean compareTime(Time time1, Time time2) {
		if (time1.hours > time2.hours) {
			return true;
		} else {
			if (time1.hours >= time2.hours && time1.minutes > time2.minutes)
				return true;
		}
		return false;
	}

	public static boolean checkTimeInterval(Time time1Start, Time time1Finish, Time time2Start, Time time2finish) {

		if (compareTime(time1Start, time2Start) && compareTime(time1Start, time2finish)
				&& compareTime(time1Finish, time2Start) && compareTime(time1Finish, time2finish))
			return true;
		if (!compareTime(time1Start, time2Start) && !compareTime(time1Start, time2finish)
				&& !compareTime(time1Finish, time2Start) && !compareTime(time1Finish, time2finish))
			return true;

		return false;
	}
	class TimeException extends Exception{
		static final String message = "Не коректний формат введення. ";
		
		public TimeException(){
			super(message);
		}
	}
	
}
