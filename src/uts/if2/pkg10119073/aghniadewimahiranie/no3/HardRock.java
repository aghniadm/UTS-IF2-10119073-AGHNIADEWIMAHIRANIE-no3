package uts.if2.pkg10119073.aghniadewimahiranie.no3;

public class HardRock extends Rnb implements PopRock,PsycehedellicRock,ProgressiveRock{
    public void genreHardRock(String artistName){
        System.out.printf("%s adalah musisi HardRock\n",artistName);
    }
    
    @Override
    public void genrePopRock(String artistName){
        System.out.printf("%s adalah musisi PopRock\n",artistName);
    }
    
    @Override
    public void genrePsycehedellic(String artistName){
        System.out.printf("%s adalah musisi PsycehedellicRock\n",artistName);
    }
    
    @Override
    public void genreProgressiveRock(String artistName){
        System.out.printf("%s adalah musisi ProgressiveRock\n",artistName);
    }
}
