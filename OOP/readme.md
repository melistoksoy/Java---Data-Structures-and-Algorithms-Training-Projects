
NFT sınıfı şu özniteliklere sahip olmalıdır:

 4 haneli rastgele karakterlerden oluşan hash kodu (string)
adı (string)
kategori (char)
satış fiyatı (int)
teklifler (int[])
aktif (bool)
Metodlar ise şu şekildedir:

yapıcı : ürün kodunu otomatik olarak rastgele doldurup,  teklifler dizisi için 3 tane int alıp hepsini 0 olarak başlatıp, aktif değişkenini true olarak başlatıp, diğer öznitelikleri ise parametre olarak almalıdır.
teklifAl : parametre olarak int alıp ve teklifler dizinine bu teklifi eklemelidir.
toString : ürünün teklifler hariç özniteliklerini string olarak ekrana basmalıdır.
sat : şu ana kadar alınan tekliflerin en yükseğine satmalıdır : NFT'nin satış fiyatı teklifler listesi içindeki en yüksek fiyata güncellenip, aktif değişkenine false atanmalıdır.
sınıf/static işlev:

enPahali : Parametre olarak NFT dizisi alıp aktif olan ürünler içinden satış fiyatı en yüksek ürünü döndüren işlev

Programdaki main işlevindeki akış NFT sınıf tanımını kullanarak şu şekilde olmalıdır:

 Aşağıdaki tablodaki NFT'leri bir dizi içinde oluşturun (yapıcı),
 her NFT oluşturduğunuzda kullanıcıdan 3 tane teklif alın (Scanner) ve bu teklifi NFT'de güncelleyin (teklifal())
 Dizideki NFT'leri ekrana yazdırın (toString() )
 NFT'lerin içinden en pahalı olanın adını ekrana bastırın (enPahali)
 NFT'lerin en pahalısını satın. (sat())

