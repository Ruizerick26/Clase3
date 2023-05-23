public class Genero {
    String tipo;
    String ritnmo;
    int anio;
    String pais;
    String artista;
    String festival;

    public Genero(String tipo, String ritnmo, int anio, String pais, String artista, String festival) {
        this.tipo = tipo;
        this.ritnmo = ritnmo;
        this.anio = anio;
        this.pais = pais;
        this.artista = artista;
        this.festival = festival;
    }


    public String getTipo() {
        return tipo;
    }

    public String getRitnmo() {
        return ritnmo;
    }

    public int getAnio() {
        return anio;
    }

    public String getPais() {
        return pais;
    }

    public String getArtista() {
        return artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRitnmo(String ritnmo) {
        this.ritnmo = ritnmo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public void imprimir_Datos(){
        System.out.println(this.tipo);
        System.out.println(this.ritnmo);
        System.out.println(this.anio);
        System.out.println(this.pais);
        System.out.println(this.artista);
        System.out.println(this.festival);
    }
    //otro
}


