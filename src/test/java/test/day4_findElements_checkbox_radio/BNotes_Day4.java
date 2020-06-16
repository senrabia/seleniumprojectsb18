package test.day4_findElements_checkbox_radio;

public class BNotes_Day4 {
}
/*12 HAZİRAN CUMA
Mutlak xpath:
    -> ile başlar: /
    -> <html> başından başlar
    -> Yalnızca ebeveynlerden çocuğa geçebilirsiniz
Göreli xpath:
    -> ile başlar: //
    -> HTML kodundaki her şeye bakar
    -> Tüm eşleşenleri döndürür
    -> Html kodunda herhangi bir yerden başlayabilirsiniz
    -> Nerede kullandığınız // (göreceli yol) eşleşen tüm sonuçları atlamak ve döndürmek istiyor
        ör .: // gövde // a
Kenar notu;
    -> Bir görev olduğunda, pdf dosyasını indirin ve ardından yapıştırma metni görevini intelliJ'e kopyalayın.

    -> Bu, görevin sayı yapısının korunmasına yardımcı olacaktır
Yaygın olarak kullanılan xpath'ler
    1- // tagName [@ attribute = 'değer']
    2- //tagName[.='text ']
        -> eşleşen metin değerini arar
    //a[.='iPhone ']
    //span[.='iPhone ']
    . -> cssSelector'daki sınıf anlamına gelir. Xpath içinde değil.

-> Bu sözdizimini kullanarak aynı webElement öğesini bulma:
    // tagName [öznitelik @ = 'değeri']
    // * [öznitelik @ = 'değeri']
        -> tagName yerine * kullandığımızda, tagName kontrol edilmez.
        -> Yalnızca nitelikleri ve değerleri kontrol eder. Ve eşleşen bir (ler) i döndürün.

    # 1 -> sınıf öznitelik değerini kullanma:
        // a [@ class = 'ac-gn-link ac-gn-link-iphone']

    # 2 -> href özellik değerini kullanarak:
        // a [@href = '/ iphone /']
        (// a [@href = '/ iphone /']) [1] -> bu bana iki web öğesi döndürüyor
        Xpath'ınız size birden fazla web öğesi döndürüyorsa ve hangisini alacağınızı belirtmek istiyorsanız, xpath öğesini () ile çevreler ve dizin numarasını [] içine geçirirsiniz

    # 3 -> // a [@ data-analytics-title = 'iphone']
        (// bir [@ veri analizi başlıktaki = 'iphone']) [1]
        -> Web öğeleri birbirine kardeşse, parantez ile çevrelenmenize gerek yoktur. [] Kullanarak dizin numarasını doğrudan iletebilirsiniz

    # 4 -> Bir çocuğun yerini belirleme ve ebeveynine gitme: Ebeveyne gitmek için / .. kullanmamız gerekir
        //span[.='iPhone']/ ..

    # 5 -> tagName yerine * kullanma
        // * [@ class = 'ac-gn-link ac-gn-link-iphone']

    ANNE BABAN BULMA: // li [@ class = 'ac-gn-item ac-gn-item-menu ac-gn-iphone'] / a
    Temel olarak benzersiz bir ebeveyn bulun, ardından istediğiniz web öğesine ulaşana kadar / tuşlarını kullanarak çocuğa geçin.
    -> Neden farklı insanlar hepimiz aynı sayfaya gitsek bile farklı sayıda bağlantı alıyor?
        -> işletim sistemi farkı nedeniyle olabilir: MAC vs Windows
        -> farklı tarayıcılar olabilir
        -> aynı tarayıcı olabilir, ancak farklı sürüm vb.
        -> bir şeyi etkileyen ekran boyutu olabilir

 */