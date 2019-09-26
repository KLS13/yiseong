package message;
import java.util.*;
public class QueueTest {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "강이성"));
		messageQueue.offer(new Message("sendKAKAO", "홍두깨"));
		//메세지 저장
		
		while(!messageQueue.isEmpty()) { // 메시지 큐가 비어있는지 확인
			Message message = messageQueue.poll();// 메시지 큐에서 한개의 메시지 꺼냄
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다");
				break;
			case "sendKAKAO":
				System.out.println(message.to + "님에게 카톡을 보냅니다");
				break;
			}
		}
	}
}
