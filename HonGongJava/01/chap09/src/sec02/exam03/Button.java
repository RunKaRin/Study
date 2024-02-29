package sec02.exam03;

public class Button {
    // 중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }

    // 인터페이스 타입 필드
    OnClickListener listener;

    void touch() {
        listener.onClick();
    }

    // 매개변수의 다형성, 셋터
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}
