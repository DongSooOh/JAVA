package ohdongsoo;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationSystem {
    private Map<String, String> userCredentials; // 아이디를 키로 하고 비밀번호를 값으로 하는 Map

    public AuthenticationSystem() {
        userCredentials = new HashMap<>();
        // 사용자 인증 정보를 초기화하거나 데이터베이스에서 가져오는 등의 작업 수행
        initializeUserCredentials();
    }

    // 사용자 인증 정보를 초기화하는 메서드 (예시)
    private void initializeUserCredentials() {
        // 사용자의 아이디와 비밀번호를 Map에 추가
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");
        // 추가적으로 사용자 정보를 등록할 수 있습니다.
    }

    // 아이디와 비밀번호를 검증하는 메서드
    public boolean authenticate(String username, String password) {
        // 입력된 아이디를 키로 사용하여 저장된 비밀번호를 가져옵니다.
        String storedPassword = userCredentials.get(username);
        // 저장된 비밀번호가 존재하고 입력된 비밀번호와 일치하는지 확인합니다.
        return storedPassword != null && storedPassword.equals(password);
    }
}