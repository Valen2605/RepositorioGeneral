package snippet;

public class Snippet {
	public void agregarComicDTOLista(ComicDTO comicDTO) {
			if(listaComics == null) {
				listaComics = new ArrayList<ComicDTO>();
			}
			listaComics.add(comicDTO);
		}
}

