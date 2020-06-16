package test.day2_findElement_getText_getAttribute;

public class BNotesDay2 {
}
/*5 HAZİRAN CUMA
Selenyum ->
    - Temelde kavanoz dosyaları koleksiyonu
    - Jar dosyalarının sınıfları var
    - Ve bu sınıfların hazır yöntemleri var
    - Bu jar dosyalarını, tarayıcı sürücülerinin yardımıyla tarayıcılarda işlem yapmamıza izin vermek için kullanıyoruz
Maven -> Maven yerleşik bir otomasyon aracıdır
    - Normalde maven geliştiriciler tarafından uygulamayı geliştirmek için kullanılır
    - Maven, proje oluşturmayı otomatikleştirmemize yardımcı oluyor
    - pom.xml ile önceden yapılandırılmış klasör yapısı sağlar
    - pom.xml dosyası maven projesindeki en önemli dosyadır
    - bağımlılıkları yönetmemize ve eklememize yardımcı olur
    - kullandığımız araçlar ve bağımlılıklar hakkındaki sürümleri kontrol etmemize yardımcı olur
    - hangi aracın hangi sürümünü kullandığınızı her zaman bilmelisiniz
    şu anda kullanılan sürüm:
        -> java 8
        -> selenyum 3.141.59
        -> WebDriverManager 4.0.0
Dahili otomasyon aracı: Ne yapılır?
    Bir proje oluştururken tekrarlanan süreçler oluşturulur
        -klasör yapısı oluşturma
        -compiling
        - jarfiles ekleme, bağımlılıklar
Maven test uzmanları için mi?
    - Hayır. Geliştiriciler içindir. Ancak maven tarafından sağlanan bazı işlevlerden faydalanacağız. Pom.xml dosyası ve mevcut klasör yapısı gibi
Maven'i tam olarak kullanacak mıyız?
    - Hayir. Biz maven'in tüm fonksiyonlariyla  kullanmayacađýz.

Mevcut çerçevenizin klasör yapısı nedir?
Röportaj Soru: Kalem ve kağıt verdi. Ve mevcut çerçevenin klasör yapısını çizmesi söylendi.
    proje Adı
        src
            main -> bu klasör geliştiriciler tarafından uygulamayı geliştirmek için kullanılır
            test -> bu klasör geliştiriciler tarafından UNIT testlerini yazmak için kullanılır
                java
                    Ölçek
                        day1_selenium_intro
        pom.xml
Yani gerçek dünyada, geliştiriciler hem ana hem de test klasörlerini kullanıyorsa, testçilerin hangi klasörde çalıştığı?
    - Gerçek çalışma ortamında uygulamanın geliştirildiği proje üzerinde çalışmayacaksınız.
    - Kendi projenizi yaratacak ve bunun üzerinde çalışacaksınız.
System.setProperty ("sürücü türü", "sürücünün yolu");
WebDriverManager.chromedriver () kurulumu (.); ->
    - Bu satır tarayıcı sürücüsü ile selenyum arasında bağlantı oluşturuyor
    - Bu iki çizgi de aynı şeyi yapıyor.
intranet -> depo -> oradan bağımlılıklar edinin
WebDriver sürücüsü = yeni ChromeDriver (); -> krom tarayıcıyı açar
WebDriver sürücüsü = yeni FirefoxDriver (); -> firefox tarayıcısını açar
driver.get ("URL") ->
    - bu yöntem, istediğimiz herhangi bir URL'yi açık bir tarayıcıda kullanmamıza olanak tanır
    - Bir String parametresini kabul eder
PROJE BELGELERİ:
    - Sınıflarınızın ve yöntemlerinizin ne hakkında oluşturulduğunu belgelemek daha iyidir.
ör .: web öğesi adı -> manageInterestCollectionButtonHomePage
driver.getTitle () ->
    - Sayfanın başlığını Dize olarak döndürür
    - Hiçbir argümanı kabul etmiyor
    - Dönüş türü: String
driver.getCurrentUrl () ->
    - Sayfanın currentURL'sini bir String olarak döndürür
    - Hiçbir argümanı kabul etmiyor
    - Dönüş türü: String
) (Driver.navigate. İleri ()
driver.navigate (). arka ()
driver.navigate (). refresh ()
) (Driver.navigate. Etmek ( "URL")
    -> yöntemine, .get ("url") yöntemiyle aynı şeyi yapar
    -> bir String argümanı kabul eder
    -> .get ve navigate (). ila () arasındaki fark get yönteminin sayfanın yüklenmesini bekleyecek, ancak (). to () yönteminin beklemeyecek olmasıdır. Sadece sayfaya devam edecek.
driver.manage (). window (). maximize () -> açılan tarayıcı sayfasını tam ekran yapar
driver.close () -> şu anda açık olan tarayıcı sayfasını kapatır
driver.quit () -> açılan tarayıcı sayfalarının tümünü (sekmeler) kapatır
- Herhangi bir web öğesinde herhangi bir işlem yapabilmek için selenyum web sürücüsü için bu web öğesini bulmamız gerekir.
- Web öğelerini bulmak için Selenyum'dan gelen findElement yöntemini kullanacağız
.findElement (Konumlandırıcı tarafından) ->
    - Bu yöntem tek bir WebElement bulur ve döndürür
    - dönüş türü WebElement
    - Belirli bir konumlandırıcı tarafından bir webElement bulamadığında, NoSuchElement istisnasını atar
//=============================================================================
KONUMLAR: Selenyum'da 8 farklı tipte konumlandırıcı vardır
    1- name: Bu konumlandırıcı tüm HTML kodunu arayacak ve WebElement öğesini eşleşen ad öznitelik değeriyle döndürecektir
        - bulduğu ilk web öğesini bulup iade edecektir
    sözdizimi: driver.findElement (By.name ("ad özellik değeri"))
.sendKeys ("buraya gönderilecek metin") ==> bu yöntem anahtarları bulunan web öğesine gönderir
    -> gönderilecek bir dize parametresini kabul eder
    sözdizimi: driver.findElement (By.locator) .sendKeys ("buraya metin");
.Tıklayın();
    -> bulduğumuz web öğesini tıklar
    -> hiçbir argümanı kabul etmiyor
    -> dönüş türü yok

2- linkText:
    -> linktext Selenyum'un 8 konumlandırıcısından biridir
    -> bu konumlandırıcı LINKS'i metinlerine göre bulmamıza izin veriyor
    -> bu konumlandırıcı SADECE LİNKLERDE ÇALIŞIR
    WebELement'in bir bağlantı olup olmadığını nasıl anlarım?
    -> <a> içinde depolanmışsa, bu bir bağlantıdır
    <a href="https://www.google.com"> BURADA METİN </a>
    TagName -> a -> bağlantı etiketi -> HTML bağlantıları için kullanılır
    özellik -> href
    özellik değeri -> https://www.google.com
    LINK METİN -> BURADA METİN
    ör .: driver.findElement (By.linkText ("BURADA METİN"));
3- partialLinkText:
    -> partialLinkText, Selenyum'un 8 konumlandırıcısından biridir
    -> bu konumlayıcı, LINKS'i metinlerine göre bulmamıza izin verir, ancak tam metnin geçmesini beklemez. Yalnızca verilen metnin bağlantıda bulunup bulunmadığını kontrol edin
    ör .: <a href="https://www.google.com"> BURADA METİN </a>
        driver.findElement (By.partialLinkText ( "MET"));
        driver.findElement (By.partialLinkText ( "BURADA"));
    Bunu Java'dan .equals ve .contains yöntemleriyle karşılaştırabilirsiniz.
    linkText -> .equals -> tam eşleşmeyi kontrol eder
    partialLinkText -> .contains -> metnin kısmi eşleşmesini kontrol eder
4- kimlik:
    -> id, Selenyum'daki 8 konumlandırıcıdan biridir
    -> id, id özelliğinin değerini eşleştirerek bulur
    -> id, söz konusu web öğesi için benzersizdir
    -> kimliğiniz varsa ve dinamik değilse (sayfayı yenilediğinizde özellik değeri değişmez) her zaman id kullanmalısınız
    sözdizimi: driver.findElement (By.id ("id niteliğinin değeri"))
5- sınıfAdı:
    -> className, Selenyum'daki 8 konumlandırıcıdan biridir
    -> className benzersiz değil, aynı özellik değerinin birden çok değeri olabilir
    -> bu konumlandırıcı bulduğu ilkini döndürür
    snytax: driver.findElement (By.className ("sınıf özniteliğinin değeri"))
intelliJ satırları çoğaltma
    -> MAC: Command + D
    -> Windows: Cntrl + D
HTML denetiminde herhangi bir şeyi nasıl arayabilirim?
    - sayfa açıkken inceleme çubuğunu açmak için cmd + F veya cntrl + F tuşlarına basın.
    - benzersiz olup olmadığını kontrol etmek için anahtar kelimelerinizi yazın
6- tagName:
    -> tagName, Selenyum'daki 8 konumlandırıcıdan biridir
    -> tagName, tagName'in kendisini kullanarak bulur
    -> bu konumlandırıcı için kullanım durumu çok küçük
    -> genellikle aynı türdeki Web Öğelerini bulmak istediğinizde iyidir
    -> örneğin: sayfadaki tüm bağlantıları döndürmek istiyorsanız findElements ile kullanabilirsiniz
    sözdizimi: driver.findElement (By.tagName ("a"))
    sözdizimi: driver.findElement (By.tagName ("div"))
    sözdizimi: driver.findElement (By.tagName ("giriş"))
    sözdizimi: driver.findElement (By.tagName ("h1"))
.getText () ->
    -> Bu yöntem verilen web öğesinin metnini alıyor olacak
    -> Herhangi bir argümanı kabul ETMEZ
    -> Web öğesinin metnini STRING olarak döndürür
    -> Dönüş türü: String
    sözdizimi: bu yöntemin nasıl kullanılacağı.
    <a id="ubt7" href="https://www.google.com"> GOOGLE İÇİN BURAYA TIKLAYIN </a>
    driver.findElement (By.id ( "ubt7")) GetText (.);
        -> "GOOGLE İÇİN TIKLAYIN" bir String olarak dön
.getAttribute ("özellik adı") ->
    -> Bu yöntem verilen özniteliğin değerini döndürecek
    -> Bir dizeyi argüman olarak kabul eder
    -> Bir dize değeri döndürür
    .GetAttribute ("") -> nasıl kullanılır
    1- Webelement'i bulmamız gerekiyor
    2- Hangi özellik değerine sahip olduğumuza karar veririz
    3- öznitelik adını yöntemin içine aktarıyoruz
    4- Bu yöntem, özniteliğin değerini döndürecektir
    sözdizimi:
    <a id="ubt7" href="https://www.google.com"> GOOGLE İÇİN BURAYA TIKLAYIN </a>
    driver.findElement (By.linkText ("GOOGLE İÇİN TIKLAYIN")). getAttribute ("id")
    döndürür -> ubt7
 */