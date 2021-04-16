package p09.textbook.exercise.ex6;

public class Chatting {
	
	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			
			@Override
			public void start() {
				while (true) {
					String intputData = "안녕하세요";
					String message = "[" + nickName + "] " + intputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
		class Chat {
			void start() {}
			void sendMessage(String message) {}
		}
}
