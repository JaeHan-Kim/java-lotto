# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 🚀 1단계 - 문자열 덧셈 계산기

- 쉼표(,) 또는 콜론(:)을 구분자로, 입력 숫자 반환 기능 구현 (v)
    - 빈 값을 전달하면, 0을 반환해야 한다 (v)
- "\\"와 "\n"사이에 위치하는 문자를 커스텀 구분자로 추가되는 기능 구현 (v)
    - ex: “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6 (v)
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 발생 (v)