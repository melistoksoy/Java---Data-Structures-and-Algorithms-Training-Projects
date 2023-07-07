

public class IdeaHash {
	private HashElement[] table;     // dograma tablosu, her bir elemaninda anahtar ve bilgi tutulur
	

	// yaratici islev, verilen size boyutunda dograma tablosunu yaratir
	public IdeaHash(int size) {
	    table=new HashElement[size];
	}

    // dograma fonksiyonunu tanimlayan ic islev
    private int hashFunction(int v) 
    {
        return ((v % table.length) + table.length) % table.length;
    }

    // insert islevi, verilen degere gore HashElement tipinde bir degiskeni tabloya ekler
    public void insert(int id) {
        int x=hashFunction(id);          // hash fonksiyonu sonucu x'te
        while(table[x] != null)          // tablo'nun x. elemani dolu oldugu surece
            x = (x+1) % table.length;      //   x degerine (dairesel olarak) bir ekle
        table[x] = new HashElement(id);  // bu bos yere, belirtilen degerle olusturulmus HashElement'i ekle
    }

    // find islevi, verilen id degeri onceden tabloya konulmussa ilgili elemanı dondurur, yoksa null dondurur
    public HashElement find(int id) {
        int x=hashFunction(id);          // hash fonksiyonu sonucu x'te
        // tablo'nun x. elemani doluyken ve o kaydin anahtar degeri id'den farkli iken
        while(table[x] != null && table[x].elem != id)
            x=(x+1) % table.length;        //   x degerine (dairesel olarak) bir ekle
        if(table[x] != null)             // donguden ciktigimizda, tablo'nun x. elemani bos degilse,
            return table[x];          //   oradaki kaydi dondur
        else                             // ama bos ise,
            return null;                   //   bulamadik demek: -1
    }
}
