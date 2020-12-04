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
        rnb1.genreBlues("Jimmy Hendrik");
        Rnb rnb2 = new Rnb();
        rnb2.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        Rockability rockability = new Rockability();
        rockability.genreRockability("Elvis Presley");
        
        HardRock hr1 = new HardRock();
        hr1.genreProgressiveRock("DreamTheater");
        HardRock hr2 = new HardRock();
        hr2.genrePsycehedellic("The Doors");
        HardRock hr3 = new HardRock();
        hr3.genrePopRock("Kiss");
        
        Metal metal1 = new Metal();
        metal1.genrePunk("MXPX");
        Metal metal2 = new Metal();
        metal2.genreHeavyMetal("METALLICA");
        Grindcore grind = new Grindcore();
        grind.genreGrindcore("Mesin Tempur");
        DeathMetal death = new DeathMetal();
        death.genreDeathMetal("JASAD");
        DeathCoreKepiting dck = new DeathCoreKepiting();
        dck.genreDeathCoreKepiting("Revenge The Fate");
        BlackMetal bm = new BlackMetal();
        bm.genreBlackMetal("Behemoth");
        NewSkul ns = new NewSkul();
        ns.genreNewSkul("HATEBREED");
        
    }
    
}
