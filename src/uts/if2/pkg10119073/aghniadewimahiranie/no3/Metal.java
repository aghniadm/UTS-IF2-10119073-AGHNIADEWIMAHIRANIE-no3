package uts.if2.pkg10119073.aghniadewimahiranie.no3;

public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName){
        
    }
    
    @Override
    public void genreHeavyMetal(String artistName){
        System.out.printf("%s adalah musisi HeavyMetal\n", artistName);
    }
    
    public void genrePunk(String artistName){
        System.out.printf("%s adalah musisi Punk\n", artistName);
    }
    
    public void genreGrunge(String artistName){
        System.out.printf("%s adalah musisi Grunge\n", artistName);
    }
}
