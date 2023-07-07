
public class Main
{
    public static void main(String[] args) {
         int[] bst_dizi_bir = {8};
         int[] bst_dizi_iki = {8, 4, 16};
         int[] bst_dizi_uc = {8, 4, 16, 2, 6, 12, 18};
         int[] bst_dizi_dort = {8, 4, 2, 6, 16, 12, 10, 9, 1, 3};
         IkiliAramaAgaci bir = new IkiliAramaAgaci(bst_dizi_bir,1);
         IkiliAramaAgaci iki = new IkiliAramaAgaci(bst_dizi_iki,3);
         IkiliAramaAgaci uc = new IkiliAramaAgaci(bst_dizi_uc,7);
         IkiliAramaAgaci dort = new IkiliAramaAgaci(bst_dizi_dort,10);
         
         AgacDugumu d1 = new AgacDugumu(10);
         AgacDugumu d2 = new AgacDugumu(20);
         AgacDugumu d3 = new AgacDugumu(30);
         AgacDugumu d4 = new AgacDugumu(40);
         AgacDugumu d5 = new AgacDugumu(5);
         d1.sag = d2;
         d2.sag = d3;
         d3.sag = d4;
         d4.sag = d5;

         AgacDugumu f1 = new AgacDugumu(10);
         AgacDugumu f2 = new AgacDugumu(120);
         AgacDugumu f3 = new AgacDugumu(30);
         AgacDugumu f4 = new AgacDugumu(40);
         AgacDugumu f5 = new AgacDugumu(50);
         AgacDugumu f6 = new AgacDugumu(60);
         AgacDugumu f7 = new AgacDugumu(70);
         f4.sol = f2;
         f2.sol = f1;
         f2.sag = f3;
         f4.sag = f6;
         f6.sol = f5;
         f6.sag = f7;

         AgacDugumu g1 = new AgacDugumu(10);
         AgacDugumu g2 = new AgacDugumu(20);
         AgacDugumu g3 = new AgacDugumu(41);
         AgacDugumu g4 = new AgacDugumu(40);
         AgacDugumu g5 = new AgacDugumu(50);
         AgacDugumu g6 = new AgacDugumu(60);
         AgacDugumu g7 = new AgacDugumu(70);
         g4.sol = g2;
         g2.sol = g1;
         g2.sag = g3;
         g4.sag = g6;
         g6.sol = g5;
         g6.sag = g7;

         boolean ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(d1); //false
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(f4); // false
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(g4); // false
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(bir.kok);  // true
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(iki.kok);  // true
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(uc.kok);   // true
         ikilimi = IkiliAramaAgaci.ikiliAramaAgacimi(dort.kok); // true


         int toplam = IkiliAramaAgaci.agacTopla(uc.kok); // 66            
         toplam = IkiliAramaAgaci.agacTopla(dort.kok); // 71
         
    }
}
