package uts.if2.pkg10119073.aghniadewimahiranie.no3;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 *
 */
public class UTSIF210119073AGHNIADEWIMAHIRANIENo3 {

    public static void main(String[] args) {
        Rnb rnb1 = new Rnb();
        Rnb rnb2 = new Rnb();
        Folk folk = new Folk();
        Rockability rockability = new Rockability();
        HardRock hr1 = new HardRock();
        HardRock hr2 = new HardRock();
        HardRock hr3 = new HardRock();
        Metal metal1 = new Metal();
        Metal metal2 = new Metal();
        Grindcore grind1 = new Grindcore();
        DeathMetal death1 = new DeathMetal();
        DeathCoreKepiting dck1 = new DeathCoreKepiting();
        BlackMetal bm1 = new BlackMetal();
        NewSkul ns1 = new NewSkul();
        
        rnb1.genreBlues("Jimmy Hendrik");
        rnb2.genreJazz("Chad Baker");
        folk.genreFolk("Bob Dylan");
        rockability.genreRockability("Elvis Presley");
        hr1.genreProgressiveRock("DreamTheater");
        hr2.genrePsycehedellic("The Doors");;
        hr3.genrePopRock("Kiss");
        metal1.genrePunk("MXPX");
        metal2.genreHeavyMetal("METALLICA");
        grind1.genreGrindcore("Mesin Tempur");
        death1.genreDeathMetal("JASAD");
        dck1.genreDeathCoreKepiting("Revenge The Fate");
        bm1.genreBlackMetal("Behemoth");
        ns1.genreNewSkul("HATEBREED");
        
    }
    
}
