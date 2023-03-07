package Pack;

public class Fecha {
	private int day;
	private int month;
	private int year;
	
	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean validar() {
		if(day> 0 && day<=31) {
			if(month > 0 && month <= 12) {
				if(month == 2) {
					if(day>0 && day<=28) {
						return true;
					}
				}else {
					if(year>0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public void mostrarFecha() {
		if(validar() == true) {
			System.out.println("Fecha: "+getDay()+"/"+getMonth()+"/"+getYear());
		}else {
			System.out.println("ERROR: LA FECHA ES INCORRECTA");
		}
	}
}
