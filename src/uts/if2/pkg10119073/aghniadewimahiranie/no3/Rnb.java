package uts.if2.pkg10119073.aghniadewimahiranie.no3;

public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreJazz(String artistName){
        setArtistName("Chad Baker");
        System.out.printf("%s adalah musisi Jazz\n",artistName);
    }
    
    @Override
    public void genreBlues(String artistName){
        setArtistName("Jimmy Hendrik");
        System.out.printf("%s adalah musisi Blue\n",artistName);
    }
    
}
