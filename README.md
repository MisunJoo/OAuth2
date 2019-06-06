#  OAuth2.0 

### 1. OAuth2.0이란 ? API를 사용하는 클라이언트에 대한 권한 부여 및 위임


사용자와 A(사진을 업로드 하는 서비스), 그리고 B(사진을 출력하는 서비스) 가 있다고 하자.

사용자는 A에 개인정보를 제공한 상태며, A에 업로드한 사진을 B에서 출력하고 싶다.

이 때, B는 A에 저장된 사진을 사용하기 위해 사용자에게 인증 및 권한을 요청한다.

 만약 사용자가 허락한다면 A에 있는 API 서버에서 사용자의 개인정보를 노출시키지 않은 채 B에게 기능을 제공한다. 

이것을 가능하게 해주는 인증 및 권한 부여 **프레임워크**가 OAuth2.0이다.




흔히 우리가 앱이나 웹페이지에서 (A) 페이스북 로그인이 가능한 이유는, 해당 앱이나 웹이 구글의 OAuth2.0 클라이언트로 등록되어있기 때문이다.
여기서 구글은 리소스 서버가 되며, A 에게 권한을 위임하여 우리의 일부 정보를 노출시키지 않고 사용할 수 있게 해주는 것이다.


##### Spring Security는 Spring Security OAuth 모듈을 통해 OAuth 2.0 서버 기능을 제공한다.



`OAuth 2.0` 사용의 장점은 **사용자 → 클라이언트 → 서버** 구조에 있어 사용자의 중요한 인증 정보가 클라이언트에게 노출될 일이 없다는 것이다. 클라이언트는 미리 서버로부터 발급 받은 `client_id`, `client_secret`으로 서버에 사용자의 로그인과 정보 사용 동의를 요청하며 서버는 사용자 인증 후 클라이언트에게 일시적으로만 접근이 유효한 `access_token`을 발급함으로서 중요 정보의 노출 없이 **API** 서버(**Resource Server**)의 정보를 사용할 수 있게 해준다.

(출처 : <https://jsonobject.tistory.com/361>)



### 2. 용어

- Authentication : 인증이 된 클라이언트인가? 이 클라이언트를 들여보내도 되는가?
- Authorization : 데이터 범위를 어디까지 제공할 것인지 **권한 부여**
- API 서버 : 클라이언트에게 데이터를 제공



(참고문헌 : <https://jsonobject.tistory.com/361>)

