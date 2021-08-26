Feature: Login

  @Web
  Scenario: User login unsuccessful
    Given User go to Login page
    When User login with credentials "username@gmail.com" and "password"
    Then System should displayed "Có lỗi xảy ra:\n- Tài khoản không tồn tại, vui lòng kiểm tra lại" message