package session;

public class Notes {

}

//http protokolü durumsuz /stateless bir protokoldür
//browser ile serverarasında bağlantı kalıcı değildir. 
//SessionID
//client/browser bir istekte bulunur,container unique bir session id oluşturur .
//bu session id bilgisi responseta döner .daha sonraki isteklerde client/browser bu session id bilgisi ile server agider .

//session id bilgisi cookiler ile taşınır .
//httpsession objesi oluşturma,unique session id bilgisi oluşturma,cookiye id response a ekleme/donme bütün işlmelerden servlet container sorumludur .
