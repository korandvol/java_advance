package ua.lviv.lgs;

import java.util.Iterator;

public class Seance implements Comparable<Seance> {

	public static Iterator<Seance> iterator;
	private Movie movie;
	private Time startTime;
	private Time endTime;

	public Seance(Movie movie, Time startTime, Time endTime) throws ua.lviv.lgs.Time.TimeException {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = Time.sumTime(startTime, movie.getDuration());
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Seance [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	@Override
	public int compareTo(Seance o) {
		
		return 0;
	}

}
