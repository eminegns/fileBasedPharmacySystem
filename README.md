# fileBasedPharmacySystem

**1-) IlacIsmiArama:** "IlacIsmiArama" adında bir sınıf tanımlar. Bu sınıfın içerisinde IlacBul adlı bir metot var. Bu metot kullanıcıdan aldığı ilaç ismini depolarda -dosyalarda- arayarak bulmaya çalışır daha sonra bulunup bulunmadığı hakkında bilgi verir. 

**2-) SatilanExtraSayisi:** Bu sınıfın içerisinde “Say” isminde bir metot vardır. Satılan extra ürünlerinin sayısını bir dosyaya kaydeder ve kullanıcı istediğinde bu dosyanın içine kaydedilenleri toplayarak kullanıcıya verir. 

**3-)ToplamCiro:** ToplamTutar sınıfında alışveriş sonrasında ToplamCiro.txt dosyasına yazılan toplam tutarları okuyup toplayıp kullanıcıya sunan bir sınıf. 

**4-)YoneticiGirisi:** Bu sınıf “Insan” sınıfından türemiştir. Insan sınıfının yapıcı metotunu çağırarak isim ve soy isim bilgilerini alır. Artı olarak yönetici şifresini temsil eden bir değişkende tanımlanır. 

**5-)YoneticiIslemiSecme:** Yönetici girişi yapıldıktan sonra yöneticiye yapabileceği işlemleri println ile yazdıran bir sınıf. 

**6-) YoneticiVeriAlma:** Burada yöneticiden isim, soy isim ve şifre alınır. Şifre 3 hanelidir eğer 100 sayısından küçük 999 sayısından büyük sayılar girilirse yani 3 hane olmama durumunda şifre yanlıştır ve program sonlanmadan önce kullanıcıya 3 hak verir. Bunu da try –catch ile yaptık try içine açtığımız if ile 100'den küçük 999’dan büyük sayılar girilirse bir istisna (exception) yazısı çıkar “yanlış yönetici şifresi girdiniz.” ondan sonra catch’e girerek “kalan deneme hakkınız: 2-/” yazısı çıkar kullanıcı 3 hakkını da yanlış girerse program sonlanır. 

**7-)AbstractDosyaOkuyucu:** Abstract bir sınıftır. DosyaOkuyucu diye metotu vardır. Parametre olarak bir dosya ismi alır ve dosya okuma işlemini gerçekleştirmek için diğer sınıflara extends edilir. 

**8-)BasAgrisiIlaclari:** DosyaOkuyucu sınıftan extends olmuştur. Baş ağrıları için olan ilaçların yazıldığı dosyayı okuma işlemini gerçekleştiren bir sınıftır. 

**9-)BogazAgrisiIlaclari:** DosyaOkuyucu sınıftan extends olmuştur. Boğaz ağrıları için olan ilaçların yazıldığı dosyayı okuma işlemini gerçekleştiren bir sınıftır. 

**10-)GripIlaclari:** DosyaOkuyucu sınıftan extends olmuştur. Grip ilaçlarının yazıldığı dosyayı okuma işlemini gerçekleştiren bir sınıftır. 

**11-)Extralar:** DosyaOkuyucu sınıftan extends olmuştur. Extra ilaçların yazıldığı dosyayı okuma işlemini gerçekleştiren bir sınıftır. 

**12-)YanikKremi:** DosyaOkuyucu sınıftan extends olmuştur. Yanık kremlerinin yazıldığı dosyayı okuma işlemini gerçekleştiren bir sınıftır. 

**13-)BasAgrisiBilgi:** Kullanıcı tarafından seçilen ilaca göre bilgi veren ve yan etkilerini ekrana yazdıran sınıftır. 

14-)BogazAgrisiBilgi: Kullanıcı tarafından seçilen ilaca göre bilgi veren ve yan etkilerini ekrana yazdıran sınıftır. 

15-)GripBilgi: Kullanıcı tarafından seçilen ilaca göre bilgi veren ve yan etkilerini ekrana yazdıran sınıftır. 

16-)YanikKremiBilgi: Kullanıcı tarafından seçilen kreme göre bilgi veren ve yan etkilerini ekrana yazdıran sınıftır. 

 
