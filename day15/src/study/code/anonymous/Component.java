package study.code.anonymous;

import study.code.anonymous.AnonymousMain.DeleteButton;
import study.code.anonymous.AnonymousMain.ViewButton;

public class Component {
	
	// 내부클래스 선언
	public static class Button{
		private ButtonEventListener listener;
		
		// setter 통해 객체를 받는다.
		public void setButtonEventListen(ButtonEventListener listener) {
			this.listener = listener;
		}
		
		// 버튼 클릭 메서드
		public void click(String type) {
			if(this.listener != null) {
				// 리스너가 가지는 이벤트를 발생한다.
				this.listener.click(type);
			}
		}
	}
	
	public static class MultiButton{
		private ButtonEventListener listener;
		/*
		 * 메서드의 파라미터의 데이터 타입을
		 * 특정객체의 부모타입으로 지정할 경우,
		 * 부모타입을 포함한 그 하위 클래스 모두를 파라미터로 받을 수 있다.
		 * 
		 */
		public void setButtonEventListen(ButtonEventListener listener) {
			this.listener = listener;
		}
		
		public void click(String type) {
			// 대상 instanceof 비교객체
			// 대상의 객체 타입이 비교객체와 동일한지 비교하는 연산자
			if(listener instanceof ViewButton) {
				System.out.println("보기 버튼");
				this.listener.click(type);
			}else if(listener instanceof DeleteButton) {
				System.out.println("삭제버튼");
				this.listener.click(type);
			}
		}
	}
	
	
}
