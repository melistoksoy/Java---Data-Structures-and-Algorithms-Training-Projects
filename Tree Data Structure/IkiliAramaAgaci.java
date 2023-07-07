//s26016 Melis Toksoy


public class IkiliAramaAgaci {

    AgacDugumu kok;

    public IkiliAramaAgaci() {
        kok = null;
    }

    public IkiliAramaAgaci(int[] arr, int n) {
        if (n == 0) {
            kok = null;
        } else {
            for (int i = 0; i < n; i++) {
                elemanEkle(arr[i]);
            }
        }
    }

    public void elemanEkle(int eleman) {
        if (kok == null) {
            kok = new AgacDugumu(eleman);
        } else {
            elemanEkle_Ozyinele(kok, eleman);
        }
    }

    private void elemanEkle_Ozyinele(AgacDugumu dugum, int eleman) {
        if (eleman > dugum.elem) {
            if (dugum.sag != null) {
                elemanEkle_Ozyinele(dugum.sag, eleman);
            } else {
                dugum.sag = new AgacDugumu(eleman);
            }
        } else if (eleman < dugum.elem) {
            if (dugum.sol != null) {
                elemanEkle_Ozyinele(dugum.sol, eleman);
            } else {
                dugum.sol = new AgacDugumu(eleman);
            }
        }
    }

    public static boolean ikiliAramaAgacimi(AgacDugumu dugum) {

        if (dugum == null) {
            return true;
        }
        if (!ikiliAramaAgacimi(dugum.sol) || !ikiliAramaAgacimi(dugum.sag)) {
            return false;
        }
        if (dugum.sag != null && (findMin(dugum.sag).elem < dugum.elem)) {
            return false;
        }
        if (dugum.sol != null && (findMax(dugum.sol).elem > dugum.elem)) {
            return false;
        }

        return true;
    }

    public static int agacTopla(AgacDugumu kok) {

        if (kok == null) {
            return 0;
        }
        return (kok.elem + agacTopla(kok.sag) + agacTopla(kok.sol));
    }

    public static AgacDugumu findMax(AgacDugumu dugum) {

        if (dugum.sag == null) {
            return dugum;
        }
        return findMax(dugum.sag);
    }

    public static AgacDugumu findMin(AgacDugumu dugum) {

        if (dugum.sol == null) {
            return dugum;
        }
        return findMin(dugum.sol);
    }
      
}

class AgacDugumu {

    public int elem;
    public AgacDugumu sol;
    public AgacDugumu sag;

    AgacDugumu(int eleman) {
        elem = eleman;
        this.sol = this.sag = null;
    }

    AgacDugumu(int eleman, AgacDugumu sol, AgacDugumu sag) {
        elem = eleman;
        this.sol = sol;
        this.sag = sag;
    }

}
