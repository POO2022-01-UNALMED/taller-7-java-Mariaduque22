package comunicacion;

public abstract class Escrito extends Pictograma {

	private String titulo;
	private String autor;
	private int paginas;

	public Escrito(String origen, String titulo, String autor, int paginas) {
		super(origen);
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String resumen() {
		return this.getOrigen() + "\n"
			 + this.titulo + "\n"
			 + this.autor + "\n"
		     + this.paginas;
	}

	abstract int palabrasTotales(int palabrasPagina);

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}