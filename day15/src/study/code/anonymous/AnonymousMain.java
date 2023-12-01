package study.code.anonymous;

import study.code.anonymous.Component.MultiButton;

public class AnonymousMain {

	public static void main(String[] args) {
		
		// 버튼 선언
		Component.Button button = new Component.Button();
				
		// 익명 클래스 선언
		// 객체의 선언와 추상메서드의 구현을 동시에 한다.
		// 추상메서드는 객체 선언할 때 만들어짐에 따라 유일한 기능을 가진 메서드가 된다.
		ButtonEventListener listener = new ButtonEventListener() {
			@Override
			public void click(String type) {
				// TODO Auto-generated method stub
				if(type.equals("read")) {
					System.out.println("읽기 버튼 동작");
				}else if(type.equals("write")){
					System.out.println("쓰기 버튼 동작");
				}
			}
		};
		
		// 구현된 버튼이벤트 객체를 세팅
		button.setButtonEventListen(listener);
		
		// 버튼 클릭
		button.click("read");
		button.click("write");
		
		MultiButton multiButton = new MultiButton();
		
		multiButton.setButtonEventListen(new ViewButton());
		multiButton.click("view");
		
		multiButton.setButtonEventListen(new DeleteButton());
		multiButton.click("delete");
		
		
	}
	
	// 리스너를 상속한 구현 클래스
	public static class ViewButton implements ButtonEventListener{

		@Override
		public void click(String type) {
			if(type.equals("view")) {
				System.out.println("보기버튼 동작");
			}
		}
		
	}
	
	public static class DeleteButton implements ButtonEventListener{
		
		@Override
		public void click(String type) {
			if(type.equals("delete")) {
				System.out.println("삭제버튼 동작");
			}
		}
		
	}

}
