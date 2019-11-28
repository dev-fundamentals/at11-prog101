package examopp;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class TvShow extends Product{
	private LocalDate date;
	
	public LocalDate getLocalDate() {
		return date;
	}
	
	public TvShow(int id, String title, ProdutCategory category, ProductStatus status, double price,
			LocalDate date)
	{
		super(id, title, category, status, price);
		this.date = date;
	}
}
